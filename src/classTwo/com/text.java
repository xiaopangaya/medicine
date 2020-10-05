package classTwo.com;

import java.util.Scanner;

import static java.lang.System.exit;

public class text {


    public static void paper(){
        double thick=0.00008;
        int times=0;
        while (thick<8848){
            thick=thick*2;
            times++;
        }
        System.out.println("对折"+times+"次后到达珠穆朗玛峰高度");
    }

    public static void Sum(){
        double sum=0;
        for (int i=1;i<=20;i++){
            double sum2=1;
            for (int j=1;j<=i;j++){
                sum2=sum2*j;
            }
            sum=sum+(1/sum2);
        }
        System.out.println("和为："+sum);
    }

    public static void ji(){
        int child,femail,mail;
        for (child=0;child<=100;child=child+3){
            for(femail=0;femail<=100-child;femail++){
                mail=100-child-femail;
                if ((child/3)+(femail*3)+(mail*5)==100){
                    System.out.println("有"+mail+"只公鸡，有"+femail+"只母鸡，有"+child+"只雏鸡");
                }
            }
        }
    }

    public static void quxifu(){
        double money=0.01;
        double allmoney=0;
        for (int i = 0; i < 90; i++) {
            allmoney=allmoney+money;
            money=money*2;
        }
//        long m;
//        m= (long) allmoney;
//        System.out.println("总共给了"+m+"元");
        System.out.println("总共给了"+allmoney+"元");
    }

    public static void primeNum(){
        for (int i=101;i<=200;i++){
            int cishu=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    cishu++;
                }
            }
            if (cishu==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void commonDivisor(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int firstNum=scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int secondNum=scanner.nextInt();
        for (int i=firstNum;i>0;i--){
            if((firstNum%i)==0&&(secondNum%i)==0){
                System.out.println("最大公约数为："+i);
                break;
            }
        }
    }

    public static void commonMultiple(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int firstNum=scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int secondNum=scanner.nextInt();
        for (int i=firstNum;i<firstNum*secondNum;i++){
            if ((i%firstNum)==0&&(i%secondNum)==0){
                System.out.println("最小公倍数为："+i);
                break;
            }
        }
    }

    public static void frog(){
        int day=0;
        int heigh=0;
        while (heigh<=7){
            heigh=heigh+3;
            day++;
            if (heigh>=7){
                System.out.println("在第"+day+"天爬出井口");
                break;
            }
            heigh=heigh-2;
        }
    }

    /**
     *
     */
    public static void findSum(){
        int sum=0;
        for (int i=1;i<=100;i++){
            if((i%10)==3){
                continue;
            }
            sum=sum+i;
        }
        System.out.println("1到100的累加(跳过个位数字为3的数字)和为:"+sum);
    }

    public static void main(String[] args) {
        System.out.println("1，一张纸的厚度大约0.08mm，对折多少次后达到珠穆朗玛峰的高度（8848米）\n" +
                "2，计算 1+1/2！+1/3！+1/4！+....+1/20!\n" +
                "3, 5文钱可以买一只公鸡，3文钱可以买一只母鸡，1文钱可以买3只雏鸡。现在用100文钱买100只鸡，那么有多少只公鸡，母鸡，雏鸡\n" +
                "4，有一青年，娶媳妇。第一个女生要100万 ，第二个女生说 我不要钱 你只要给我1分钱，第二天给我前一天的两倍，以此类推。给我3个月就可以了，青年觉得挺划算的 选择了第二个女生，请问三个月后 男生总共给了我女生多少钱。（每月按照30天计算）\n" +
                "5，判断101到200之间有多少个素数，请输出所有素数\n" +
                "6，输入两个数字，请这两个数字的最大公约数 \n" +
                "7，输入两个数字，请计算这两个数字的最小公倍数\n" +
                "8，有口井7米深，一只青蛙白天爬3米 晚上坠2下米，这只青蛙几天才可以爬出井口\n" +
                "9，求整数1到100的累加和，但是要求跳过个位数字为3的数字\n" +
                "0，退出做题");

        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入想要运行第几题。");
            int meun=scanner.nextInt();
            switch (meun){
                case 0:
                    exit(0);
                case 1:
                    paper();
                    break;
                case 2:
                    Sum();
                    break;
                case 3:
                    ji();
                    break;
                case 4:
                    quxifu();
                    break;
                case 5:
                    primeNum();
                    break;
                case 6:
                    commonDivisor();
                    break;
                case 7:
                    commonMultiple();
                    break;
                case 8:
                    frog();
                    break;
                case 9:
                    findSum();
                    break;
            }
        }

    }
}
