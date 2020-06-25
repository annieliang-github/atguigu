题目：定义Student类，包含三个属性number， state， score，创建20个对象，学号1-20， 年级成绩随机。
第一：打印state==3的学生信息
第二：冒泡排序学生成绩

public class Main{
    public static void main(String[] args) {      
        //创建的两个对象     
		Student[] array = new Student[20];
		Student test = new Student();		
		//给array赋值		
		for (int i = 0; i < array.length; i++) {
		    array[i] = new Student();
		    array[i].number = i + 1;
		    array[i].state = (int)(Math.random() * 6 + 1);
		    array[i].score = (int)(Math.random() * 101);
		}		
		//调用 test的SearchState方法		
		test.SearchState(array, 3);		
		System.out.println("**********");		
		//调用 冒泡排序		
		test.SortArray(array);		
		//调用 遍历并打印基本信息		
		test.PrintInfo(array);		
    }   
}

class Student {
    int number;
    int state;
    int score;
      
    public String info() {
        return "number: " + number + " state: " + state + " score: " + score;
    }
       
    public void SearchState(Student[] array, int state) {
        for (int i = 0; i < array.length; i++) {
		    if (array[i].state == state) {
		        System.out.println(array[i].info());
		    }
		}
    }
  
    public void PrintInfo(Student[] array) {
        for (int i = 0; i < array.length; i++) {
		    System.out.println(array[i].info());
		}
    }
    
    public void SortArray(Student[] array) {
        for (int i = 0; i < array.length - 1; i++) {
		    for (int j = 0; j < array.length - 1 - i; j++) {
		        if (array[j].score > array[j + 1].score) {
		            Student temp = array[j];
		            array[j] = array[j + 1];
		            array[j + 1] = temp;
		        }
		    }
		}
    } 
}


