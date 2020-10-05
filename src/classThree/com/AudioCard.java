package classThree.com;

public class AudioCard implements PCI{
    @Override
    public void send() {
        System.out.println("声卡正在发送数据!");
    }
}
