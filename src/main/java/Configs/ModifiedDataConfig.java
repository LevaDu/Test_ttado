package Configs;

import java.util.ResourceBundle;

public class ModifiedDataConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("ModifiedDataConfig");
    public static final int DRIVERTYPE = Integer.parseInt(rb.getString("driverType"));  //浏览器类型
    public static final long SLEEP = Long.parseLong(rb.getString("sleep"));             //休眠时间
    public static final String URL =rb.getString("url");                                //输入网址
    public static final String KAIYUAN =rb.getString("kaiYuan");                        //开源版
    public static final String USERNAMETEXT = rb.getString("userNameText");             //定位用户名输入框
    public static final String USERNAME =rb.getString("userName");                      //输入用户名
    public static final String PASSWORDTEXT = rb.getString("passWordText");             //定位密码输入框
    public static final String PASSWORD = rb.getString("passWord");                     //输入密码
    public static final String SAVELOGIN = rb.getString("saveLogin");                   //保存登录状态
    public static final String LOGINZENTAO = rb.getString("loginZentao");               //点击登录
    public static final String DANGAN = rb.getString("dangAn");                         //点击档案
    public static final String DANGANFRAME = rb.getString("dangAnFrame");               //点击档案中的框架
    public static final String MODIFIEDDATA = rb.getString("modifiedData");             //点击修改档案
    public static final String SEX = rb.getString("sex");                               //修改性别
    public static final String BIRTHDAY = rb.getString("birthday");                     //修改出生年月
    public static final String ACCOUNTNO = rb.getString("accountNo");                   //修改源代码账号
    public static final String QQ = rb.getString("qq");                                 //修改QQ
    public static final String SAFEPASSWORD = rb.getString("safePassword");             //安全验证输入密码
    public static final String SUBMITSAVE = rb.getString("submitSave");                 //点击保存
    public static final String XX = rb.getString("xx");                                 //点击叉掉


}
