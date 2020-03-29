package com.mingrisoft.thread;

/*
* �����k��-java�����}�o�d�Ҷ�
*  http://www.deepstone.com.tw/xmdoc/cont?xsmsid=0J191295271158913049&sid=0J353063566013658199&sq=java%E5%AE%8C%E5%85%A8%E9%96%8B%E7%99%BC%E7%AF%84%E4%BE%8B%E9%9B%86
*  ��12��,�ϥ�ThreadLocal
*/

public class Bank {
    // �ϥ�ThreadLocal���O�Ӻ޲z�@���ܼ�account
	
    private static ThreadLocal<Integer> account = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 100;// ���s�w�qinitialValue()��k�A�Naccount����ȳ]��100
        }
    };
    
    public void deposit(int money) {
        account.set(account.get() + money);// �Q��account��get()�Bset()��k��{�s��
    }
    
    public int getAccount() {// ��o���l�B
        return account.get();
    }
}
