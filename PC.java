package computer;
public class PC{
    CPU cpu;
    HardDisk disk;
    void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk disk){
        this.disk = disk;
    }
    void show(){
        System.out.println("CPU�ٶȣ�"+cpu.getSpeed());
        System.out.println("Ӳ������"+disk.getAmount());
        System.out.println("CPU�¶ȣ�"+cpu.getTemp());
        System.out.println("Ӳ��chs��"+disk.getChs());
    }
}