package classThree.com;

public class NetCard implements PCI{
    @Override
    public void send() {
        System.out.println("网卡正在发送数据!");
    }
}
