package computer;
public class HardDisk {
    private int amount;
    private int chs;
    int getAmount(){
        return amount;
    }
    int getChs() {
    	return chs;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setChs(int chs) {
    	if(chs>0&&chs<64)
    	this.chs = chs;
    }
}