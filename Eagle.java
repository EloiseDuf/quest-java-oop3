public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setAltitude(int altitude) {
        this.altitude=altitude;
    }


    public void setFlying(boolean flying) {
        this.flying=flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        if(!this.flying && this.altitude==0){
            System.out.println(getName() + " take off in the sky");
            this.flying=true;
        } else {
            System.out.println(getName() + " is already in the sky");
        }
    }

    public int descend(int altitude){
        if( this.flying && this.altitude>=0){
            this.altitude-=altitude;
            if (this.altitude<=1){
                if(this.altitude<0){
                setAltitude(0); 
                } 
                System.out.println(getName() + " flies downward, altitude : " +getAltitude());
                land();
            } else {
            System.out.println(getName() + " flies downward, altitude : " +getAltitude());
            }
        } else {
            System.out.println(getName() + " is not take off");
        }
        return this.altitude;
    }

    public void glide(){
        if(this.flying && this.altitude>=150){
            System.out.println(getName() + " glides into the Air");
        } else {
            System.out.println(getName() + " is on the ground");
        }
    }

    public void land(){
        if(this.altitude<=1){
            this.flying=false;
            setAltitude(0);
            System.out.println(getName() + " lands on the ground");
        } else {
            System.out.println(getName() + " is too high, it can't land");
        }
    }

    public int ascend(int altitude){
        if(this.flying){
            this.altitude+=altitude;
            System.out.println(getName() + " flies upward, altitude : " +getAltitude());
            if (this.altitude>=150){
                glide();
            }
        } else {
            System.out.println(getName() + " is not take off");
        } 
        return this.altitude;
    }
}
