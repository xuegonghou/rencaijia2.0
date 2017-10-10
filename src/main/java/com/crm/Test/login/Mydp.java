package com.crm.Test; /**
 * Created by Administrator on 2017/7/3.
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mydp {
     String userpassword=null;
    List list;
    public  List dp() {
        //声明Connection对象
        Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/rcj";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "root";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //要执行的SQL语句
            String sql = "select * from students";
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);
            String name = null;
            String id = null;
            list=new ArrayList();
            while(rs.next()){
                //获取stuname这列数据
                name = rs.getString("username");
                //获取stuid这列数据
                id = rs.getString("password");
                //首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
                //然后使用GB2312字符集解码指定的字节数组。
                name = new String(name.getBytes("ISO-8859-1"),"gb2312");
                //输出结果
                 userpassword=name+","+id;
                 list.add(userpassword);

            }

                //System.out.println(list);
            rs.close();
            con.close();
        } catch(ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
           // System.out.println("数据库数据成功获取！！");
        }
        return list;
    }

}