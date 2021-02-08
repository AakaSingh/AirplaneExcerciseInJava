public class Airplane {

    boolean isMotorOn;
    int altitude;
    boolean isFunctional;

    Airplane()
    {
        this.isMotorOn = false;
        this.altitude = 0;
        this.isFunctional = true;
    }
    public void start()
    {
        if(!this.isMotorOn)
        {
            this.isMotorOn = true;
            System.out.println("Motor has been turned On!");
        }
        else
        {
            System.out.println("Motor is Already On!");
        }
    }

    public void stop()
    {
        if(this.isMotorOn && this.altitude == 0)
        {
            this.isMotorOn = false;
            System.out.println("Motor Stopped as Altitude is still 0!");
        }
        else
        {
            System.out.println("Either \"Motor is Already off\" or \"Airplane is in Mid-Air\"");
        }
    }

    public void takeOff()
    {
        if(this.isMotorOn && this.altitude == 0) {
            System.out.println("The Plane is Now Flying");
        }

        else {
            System.out.println("Either \"Motor is Off\" or \"Airplane is already flying\"");
        }

    }

    public void changeAltitude(int altChange)
    {
        if(this.isMotorOn)
        {
            this.altitude += altChange;
            System.out.println("New Altitude : " + this.altitude);
            if(this.altitude >= 12000)
            {
                System.out.println("BOOM! Plane Exploded");
                this.isFunctional = false;
            }
            else if(this.altitude >= 10000)
            {
                System.out.println("DANGER!");
            }
            else if(this.altitude <= 0)
            {
                System.out.println("Plane has landed");
                this.altitude = 0;
            }

        }
        else
        {
            System.out.println("Motor is Not On!");
        }
    }
}
