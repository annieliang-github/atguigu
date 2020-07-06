package team.service;

import team.domain.Architect;
import team.domain.Designer;
import team.domain.Employee;
import team.domain.Programmer;

//开发团队的添加删除等
public class TeamService {
	private static int counter = 1; //以后自增用于memberID
	private final int MAX_MEMBER = 5; //最多人数
	private Programmer[] team = new Programmer[MAX_MEMBER]; //开发团队成员
	private int total; //实际人数
	
	
	public Programmer[] getTeam() {
		Programmer[] actual = new Programmer[total];
		for (int i = 0; i < actual.length; i++) {
			actual[i] = team[i];
		}
		return team;	
	} 
	
	//将指定员工添加到开发团队中
	
	public void addMember(Employee e) throws TeamException {
		if (total >= MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加");
		} 
		if (!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}
		if (isExit(e)) {
			throw new TeamException("该员工已在本开发团队中");
		}
		
		Programmer p = (Programmer)e; //强转
		if ("BUSY".equalsIgnoreCase(p.getStatus().getNAME())) {
			throw new TeamException("该员工已是某团队成员 ");
		} else if ("VACATION".equalsIgnoreCase(p.getStatus().getNAME())) {
			throw new TeamException("该员正在休假，无法添加 ");
		}
		
		
		//获取team中已有的架构师、设计师、程序员人数
		int numOfArch = 0, numOfDes = 0, numOfPro = 0;
		for (int i = 0; i < total; i++) {
			if(team[i] instanceof Architect) {
				numOfArch++;
			} else if (team[i] instanceof Designer) {
				numOfDes++;
			} else if (team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		
		if (p instanceof Architect) {
			if(numOfArch >= 1) {
				throw new TeamException("团队中至多只能有一名架构师");
			}
		} else if (p instanceof Designer) {
			if (numOfDes >= 2) {
				throw new TeamException("团队中至多只能有两名设计师");
			}
		} else {
			if (numOfPro >= 3) {
				throw new TeamException("团队中至多只能有三名程序员");
			}
		}
	
		//将e添加到现有的team中
		team[total] = p;
		total++;
		
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);
	}
	
	//判断员工是否已经存在在开发团队中
	private boolean isExit(Employee e) {
		for (int i = 0; i < total; i++) {
			if (team[i].getId() == e.getId()) {
				return true;
			}
		}
		return false;
	}

	//删除成员
	public void removeMember(int memberId) throws TeamException {
		int i = 0;
		for (; i < total; i++) {
			if(team[i].getMemberId() == memberId) {
				
				//把BUSY改回FREE
				team[i].setStatus(Status.FREE);
				break;	
			}
		}
		//此时停下来了，如果找到了，那i一定在total之前，如果等于total说明没找到
		if (i == total) {
			throw new TeamException("找不到指定memberId的员工");
		}
		
		//此时已经找到i 从i开始后一个覆盖前一个
		for (int j = i + 1; j < total; j++) {
			team[j - 1] = team[j]; 
		}
		
		//写法一：
		team[total - 1] = null;
		total--;
		
		//写法二：
		//team[--total] = null;
		
	}

	
}
