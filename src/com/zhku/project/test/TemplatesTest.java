package com.zhku.project.test;

import java.util.ArrayList;

/**
 * @author Hai
 * @date 2019/12/22 - 14:49
 *
 * 1.IDEA中代码模板的位置：setting-Editor-live Templates或general-Postfix Completion
 * 主要看：live Templates中的output other iteration plain和Postfix Completion中的java
 */
public class TemplatesTest {
        //模板六：prsf
    private static final int a=1;
    private static final student s1=new student();
        //变形：psf
    public static final int b=2;
        //变形：psfi
    public static final int c=3;
        //变形：osfs
    public static final String s="sdsdd";
        //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("ssd");
          //变形:（就近选泽）
        System.out.println("args = [" + args + "]");//输出参数soutp
        System.out.println("TemplatesTest.main");//输出方法名soutm
        int m=1;
        int n=2;
        System.out.println("n = " + n);//输出变量soutv
        System.out.println(m);//输出变量  xxx.sout
        //模板三：fori
        String[] str=new String[]{"lili","lala","didi"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
          //变形：iter
        for (String s : str) {
            System.out.println(s);
        }
          //变形：itar
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        for (Object o : list) {

        }
           //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
           //变形：list.forr(从尾到头)
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        //模板五：ifn（判断是否为空）
        if (list == null) {

        }
           //变形：inn（判断是否不为空）
        if (list != null) {

        }
          //变形：xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
