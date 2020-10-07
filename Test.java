package computer;
public class Test{
    public static void main(String args[]){
        CPU cpu = new CPU();
        HardDisk disk = new HardDisk();
        cpu.setSpeed(2200);
        cpu.setTemp(66);
        disk.setAmount(200);
        disk.setChs(120);
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}