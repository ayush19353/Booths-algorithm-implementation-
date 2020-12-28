 import java.util.*;
 //import java.util.PriorityQueue;
 import java.util.*;//package com.company;
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import java.util.StringTokenizer;
//import org.graalvm.compiler.nodes.calc.RightShiftNode;
class booth
{


String convertbinary(int num)//converting to binary equivalent

{String x="";
    while(num > 0)
    {
       int a = num % 2;
       
        x = a + "" + x;
        num = num / 2;
    }
    return x;

}
String twocomplement(String stp1)
{int res=-1;
for(int i=stp1.length()-1;i>=0;i--)
{if(stp1.charAt(i)=='1')
{res=i;
break;
}}//System.out.println(res);
String stp2="";
if(res==-1)
return stp1;
else
{
int ans1=9-(res+1);
ans1=ans1+8;
for(int j=0;j<res;j++)
{if(stp1.charAt(j)=='0')
stp2=stp2+'1';
else if(stp1.charAt(j)=='1')
stp2=stp2+'0';
}
for(int j=res;j<stp1.length();j++)
{
    stp2=stp2+stp1.charAt(j);
}}return stp2;
}
String calculate(String zaq,String zaq1,String zaq2)
{String ac="000000000000000000000000000000000";
    char qo = '0';
    String jun = "";
String first=zaq;
String fin=ac+first+qo;//System.out.println(fin);
int i=0;
System.out.println((33-i)+"           "+ ac+"      "+first+"      "+qo+"      "+"Initialization");
while(i<33)
{//System.out.println(fin);
  //  System.out.println(fin.charAt(18));
if(fin.charAt(65)==fin.charAt(66))
{// System.out.println(ac);
 jun=rightshift(fin);fin=jun;
 ac=fin.substring(0, 33);
 first=fin.substring(33,66);
 qo=fin.charAt(66);
 System.out.println((33-i)+"           "+ ac+"      "+first+"      "+qo+"      "+"Right Shift");
}
else
{if(fin.charAt(65)=='1')
{//System.out.println(ac);
  //  System.out.println(ac);
ac=addition(ac,zaq1);//System.out.println(ac);
//ac=Long.toString(up);
System.out.println((33-i)+"           "+ ac+"      "+first+"      "+qo+"      "+" subtraction");
fin=ac+first+qo;//System.out.println(fin);
jun=rightshift(fin);
fin=jun;ac=fin.substring(0, 33);
first=fin.substring(33,66);
qo=fin.charAt(50);
System.out.println((33-i)+"           "+ ac+"      "+first+"      "+qo+"      "+"right shift");

}
else if(fin.charAt(65)=='0')
{//Long up=Long.parseLong(ac);
   // System.out.println(ac);
   
 ac=addition(ac,zaq2);//System.out.println(ac);
 System.out.println((33-i)+"           "+ ac+"      "+first+"      "+qo+"      "+"addition");
//ac=Long.toString(up);
fin=ac+first+qo;
jun=rightshift(fin);
fin=jun;ac=fin.substring(0, 33);
first=fin.substring(33,66);
qo=fin.charAt(66);
System.out.println((33-i)+"           "+ ac+"      "+first+"      "+qo+"      "+"right shift");
}
}i++;}return jun;}


String addition(String binary1,String binary2)

{String result = "";  
        
int s = 0;          

int i = binary1.length() - 1, j = binary2.length() - 1; 
while (i >= 0 || j >= 0 || s == 1) 
{  if(i >= 0)
    s=s+binary1.charAt(i) - '0';
    else 
    s=s+0;
if(j >= 0)
s=s+binary2.charAt(j) - '0';
else 
s=s+0;

    result = (char)(s % 2 + '0') + result; 

    s /= 2; 

    i--; j--; 
} 
  
if(result.length()==33)
    return result; 
    else
    return result.substring(1, result.length());
 }

String rightshift(String lg)

{String sop1;
sop1=lg.substring(0,lg.length()-1);
sop1=lg.charAt(0)+sop1;
return sop1;
}
Long convert(String erp)
{long adder=0;int con=0;
    for(int i=erp.length()-1;i>=0;i--)
{adder= (long) (adder + (Math.pow(2, con) * Integer.parseInt(Character.toString(erp.charAt(i)))));
con=con+1;
}return adder;

}


    public static void main(String[] args) throws IOException
    {
    
Scanner sc=new Scanner(System.in);
booth ob=new booth();
System.out.println("Enter first number");
 String n1 = sc.next();
 System.out.println("Enter second number");
 String n2 = sc.next();
  if(Integer.parseInt(n2)<0 && Integer.parseInt(n1)>=0)
  {String temp=n1;
    n1=n2;
    n2=temp;}
  String str1="",str2="";
if(Integer.parseInt(n1)>=0 && Integer.parseInt(n2)>=0)
{
 str1=ob.convertbinary(Integer.parseInt(n1));//System.out.println(str1);System.out.println(str1.length());
 str2=ob.convertbinary(Integer.parseInt(n2));

 int len1=33-str1.length();
 int len2=33-str2.length();
 for(int i=0;i<len1;i++)
 {str1='0'+str1;}//str1 is the multiplicand 
 for(int i=0;i<len2;i++)
 {str2='0'+str2;}
 System.out.println("First number in binary-     "+str1);
 System.out.println("Second number in binary-     "+str2);
}
//System.out.println(str2);System.out.println(str2.length());
else if(Integer.parseInt(n1)<0 && Integer.parseInt(n2)>=0)
{//ystem.out.println("ggg");
String n3=n1.substring(1);
   // System.out.println("Gg");
    str1=ob.convertbinary(Integer.parseInt(n3)); // System.out.println(str1);
    str2=ob.convertbinary(Integer.parseInt(n2));
int len1=33-str1.length();
int len2=33-str2.length();
for(int i=0;i<len1;i++)
{str1='0'+str1;}//str1 is the multiplicand 
for(int i=0;i<len2;i++)
{str2='0'+str2;}
    str1=ob.twocomplement(str1);

 System.out.println("First number in binary-     "+str1);
 System.out.println("Second number in binary-     "+str2);
    //System.out.println(str1);
   // System.out.println(str1);
    }
    else if(Integer.parseInt(n1)<0 && Integer.parseInt(n2)<0)
    {//ystem.out.println("ggg");
    String n3=n1.substring(1);String n4=n2.substring(1);
       // System.out.println("Gg");
        str1=ob.convertbinary(Integer.parseInt(n3)); // System.out.println(str1);
        str2=ob.convertbinary(Integer.parseInt(n4));
    int len1=33-str1.length();
    int len2=33-str2.length();
    for(int i=0;i<len1;i++)
    {str1='0'+str1;}//str1 is the multiplicand 
    for(int i=0;i<len2;i++)
    {str2='0'+str2;}
        str1=ob.twocomplement(str1);str2=ob.twocomplement(str2);
        //System.out.println(str1);
       // System.out.println(str1);
       System.out.println("First number in binary-     "+str1);
       System.out.println("Second number in binary-     "+str2);
        }
        System.out.println("number of steps        "+"ACCUMULATOR              "+" second number is bits                 "+ "Qo                "+ "TASk");
  
//str2 is the 2nd 
//System.out.println(str1);System.out.println(str2);
String str3=ob.twocomplement(str1);
//System.out.println(str3);


String resultp=ob.calculate(str2,str3,str1);
if(Integer.parseInt(n1)>=0 && Integer.parseInt(n2)>=0)
{System.out.println("Final output in binary-    "+resultp.substring(0,66));
    long result1=ob.convert(resultp.substring(0,66));
System.out.println(result1);}
else if(Integer.parseInt(n1)<0 && Integer.parseInt(n2)>=0)
{ String resultp1=ob.twocomplement(resultp);
//System.out.println(resultp1);
System.out.println("Final output in binary-    "+resultp.substring(0,66));
  
    long result1=ob.convert(resultp1.substring(0,66));
System.out.println('-'+Long.toString(result1));
}else if(Integer.parseInt(n1)<0 && Integer.parseInt(n2)<0)
{System.out.println("Final output in binary-    "+resultp.substring(0,66));
  
    long result1=ob.convert(resultp.substring(0,66));
System.out.println(result1);}

    }}class Scanner {
        BufferedReader reader;
        StringTokenizer tokenizer;
    
        Scanner(InputStream input) {
            reader = new BufferedReader(new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }
    
        String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        long nextLong() throws  IOException {
            return Long.parseLong(next());
        }
        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }




