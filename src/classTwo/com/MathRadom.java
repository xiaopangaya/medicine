package classTwo.com;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Bidi;
import java.text.DecimalFormat;

public class MathRadom {
    public static void Red(){
        int red[]=new int[33];
        int count=0;
        for (int i=0;i<33;i++){
            red[i]=i+1;
        }
        while (count<6){
            int redNum= (int) Math.floor(Math.random()*32+1);
            if (red[redNum]!=0){
                System.out.println("第"+(count+1)+"个红球为"+red[redNum]);
                count++;
                red[redNum]=0;
            }
        }
    }

    public static void Blue(){
        int blue[]=new int[16];
        for (int i=0;i<16;i++){
            blue[i]=i+1;
        }
        int blueNum=(int) Math.floor(Math.random()*15+1);
        System.out.println("蓝球号码为："+blue[blueNum]);
    }

    public static void main(String[] args) {
//        Red();
//        Blue();
//        DecimalFormat decimalFormat=new DecimalFormat("#,###.0000");
//        String str=decimalFormat.format(1000000000.3283);
//        System.out.println(str);
//
//        BigDecimal decimal=new BigDecimal(123123123.123d);
//        BigDecimal decimal1=new BigDecimal(2);
//        BigDecimal result=decimal.multiply(decimal1);
//        System.out.println(result);

        String str="hello,asdfasdhelloasdfashelloasdfhello";
        String s="hello";
        int count=getNumber(str,s);
        System.out.println(count);


    }
    private static int getNumber(String ori,String word){
        int count=0;
        for (int i = 0; i < ori.length(); i++) {
            int index=ori.indexOf(word,i);
            if (index>-1){
                count++;
                i=index+word.length();
                i--;
            }
        }

        return count;
    }


    private static void text1() {
        String str="hello,asdfasdhelloasdfashelloasdfhello";
        String s="hello";
        String theFinal=str.replace(s,"");
        System.out.println(str);
        System.out.println(theFinal);
        System.out.println((str.length()-theFinal.length())/s.length());


        int count=0;

        for (int i=0;i<str.length();i++){
            int x=str.indexOf(s);
            if (x>=0){
                count++;
            }
            str=str.substring(x+1);
        }
        System.out.println(count);

        String[] s1=str.split(s);
        for (String s3 :
                s1) {
            System.out.print(s3);
        }
        System.out.println(s1.length-1);
    }
}
