
/*定义银行账户类Account，有属性：卡号cid，余额balance，所属用户Customer   
银行账户类Account有方法：
（1）getInfo()，返回String类型，返回卡的详细信息
（2）取钱方法withdraw()，参数自行设计，如果取钱成功返回true，失败返回false
（3）存钱方法save()，参数自行设计，如果存钱成功返回true，失败返回false
   
其中Customer类有姓名、身份证号、联系电话、家庭地址等属性
*/

public class Main{
    
    public static void main(String[] args) {
        
        Customer cus1 = new Customer();
        Account acct1 = new Account();
        
        acct1.cid = "5896641";
        acct1.balance = 10000;
        
        cus1.name = "Tom";
        cus1.idNumber = "7765123984";
        cus1.phoneNumber = "781-749-6655";
        cus1.address = "88754 Sugar land";
        
        System.out.println(acct1.getInfo(cus1));
    
    }
}

class Account {
    String cid;
    double balance;
    String customer;
    
    public String getInfo(Customer cus1) {
        String ans = "卡号 " + cid + " 余额 " + balance + " 卡主的信息如下：" + cus1.getCustomerInfo();
        return ans;
    }
    
    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean save(int amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }
}


class Customer {
    String name;
    String idNumber;
    String phoneNumber;
    String address;
    
    public String getCustomerInfo() {
        String ans2 = "姓名 " + name + " 身份证 " + idNumber + 
        " 电话号 " + phoneNumber +  " 地址 " + address;
        
        return ans2;
    }
    
}




