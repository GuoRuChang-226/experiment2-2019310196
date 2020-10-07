package computer;
public class CPU{
    private int speed;
    int temp;
    int getSpeed(){
        return speed;
    }
    int getTemp() {
    	return temp;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setTemp(int temp) {
    	if(temp>40&&temp<85)
    		this.temp=temp;
    }
}