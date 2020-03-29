package com.mingrisoft.thread;

/*
* 王者歸來-java完全開發範例集
*  http://www.deepstone.com.tw/xmdoc/cont?xsmsid=0J191295271158913049&sid=0J353063566013658199&sq=java%E5%AE%8C%E5%85%A8%E9%96%8B%E7%99%BC%E7%AF%84%E4%BE%8B%E9%9B%86
*  第12行,使用ThreadLocal
*/

public class Bank {
    // 使用ThreadLocal類別來管理共享變數account
	
    private static ThreadLocal<Integer> account = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 100;// 重新定義initialValue()方法，將account的初值設為100
        }
    };
    
    public void deposit(int money) {
        account.set(account.get() + money);// 利用account的get()、set()方法實現存錢
    }
    
    public int getAccount() {// 獲得賬戶餘額
        return account.get();
    }
}
