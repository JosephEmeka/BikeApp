public class BikeApp {
    private boolean bikeIsOn;
    private int gear;

    private int speed;

    public BikeApp() {
        this.bikeIsOn = false;
        this.gear = 0;
        this.speed = 0;
    }


    public boolean itIsOff() {
        return bikeIsOn;
    }

    public void turnBikeOn() {
        this.bikeIsOn = true;
    }

    public void turnBikeOff() {
        this.bikeIsOn = false;
    }

    public void setGear(int gear) {
       this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }


    public int accelerate() {
            if (bikeIsOn == true) {
                if (gear == 1 && speed <= 20) {
                    speed += 1;
                } else if (gear == 2 && speed <= 30) {
                    speed += 2;
                } else if (gear == 3 && speed <= 40) {
                    speed += 3;
                }
                else if (gear == 4 && speed > 40) {
                    speed += 4;
                }
                return speed;
            }
            else {

                return 0;
            }
        }

    public int decelerate() {
        if (bikeIsOn == true) {
            if (gear == 1 && speed <= 20 && speed >= 1) {
                speed -= 1;
            } else if (gear == 2 && speed <= 30 && speed >= 21) {
                speed -= 2;
            } else if (gear == 3 && speed <= 40 && speed >= 31) {
                speed -= 3;
            }
            else if (gear == 4 && speed >=41 ) {
                speed -= 4;
            }
            return speed;
        }
        else {

            return 0;
        }
    }
}