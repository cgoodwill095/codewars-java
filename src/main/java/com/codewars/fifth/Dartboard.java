package main.java.com.codewars.fifth;

public class Dartboard {
    /*
        Create your own mechanical dartboard that gives back your score based on the coordinates of your dart.

    Task:

        Use the scoring rules for a standard dartboard:
        Finish method:

        public String getScore(double x, double y);

        The coordinates are `(x, y)` are always relative to the center of the board (0, 0). The unit is millimeters. If you throw your dart 5 centimeters to the left and 3 centimeters below, it is written as:

        String score = dartboard.getScore(-50, -30);

        Possible scores are:
            Outside of the board: `"X"`
            Bull's eye: `"DB"`
            Bull: `"SB"`
            A single number, example: `"10"`
            A triple number: `"T10"`
            A double number: `"D10"`
        A throw that ends exactly on the border of two sections results in a bounce out. You can ignore this because all the given coordinates of the tests are within the sections.
        The diameters of the circles on the dartboard are:
            Bull's eye: `12.70 mm`
            Bullseye area = pi * 6.35 ^2
            Generate area for pi, assign to variable, then use a switch to define where the dart lands.

            edit - even easier - just figure out if the spot is within the radius
            Keep bounce outs in mind.
            Bull: `31.8 mm`
            Triple ring inner circle: `198 mm`
            Triple ring outer circle: `214 mm`
            Double ring inner circle: `324 mm`
            Double ring outer circle: `340 mm`

            each angle is 18 degrees
            from top, clockwise, 20, 1, 18, 4, 13, 6, 10, 15, 2, 17, 3, 19, 7, 16, 8, 11, 14, 9, 12, 5
            From right, counter clockwise 6, 13, 4, 18, 1 ,20, 5, 12, 9, 14, 11, 8, 16, 7, 19, 3, 17, 2, 15, 10
            0-9 = 6, 9-27 = 13, 27-45=4, 45-63=18, 63-81 = 1, 81-99=20, 99-117=5,
     */
    public String getScore(double x, double y)
    {
        // Calculate which scoring section
        String score = "";
        double c = (Math.sqrt(Math.pow(x,2) + Math.pow(y, 2)));
        if(c <6.35){
            score = "DB";
            return score;
        }
        else if(c <15.9){
            score = "SB";
            return score;
        }
        double angle = this.calculateAngle(x,y);



        //If bullseye or bull, then direction doesn't matter

        if(c <99 && c>=15.9){
            return String.valueOf(scoreNumber(angle));
            }
        else if(c <107) {
            score="T"+scoreNumber(angle);
        }
        else if(c <162){
            return String.valueOf(scoreNumber(angle));
        }
        else if(c <170){
            score="D"+scoreNumber(angle);
        }
        else if(c>=170){
            score="X";
        }
        //
        return score;
    }


    public double calculateAngle(double x, double y){
        double theta = Math.toDegrees(Math.atan2(y,x));
        theta = (theta + 360) % 360;
        return theta;
    }

    public int scoreNumber(double angle){
        if(angle>351 || angle<9){
            return 6;
        }
        if(angle>=9){
            angle = angle + 9;
        }
        int points =(int)angle / 18;
        switch(points){
            case 0:
                return 6;

            case 1:
                return 13;

            case 2:
                return 4;

            case 3:
                return 18;

            case 4:
                return 1;
                
            case 5:
                return 20;
                
            case 6:
                return 5;
                
            case 7:
                return 12;
                
            case 8:
                return 9;
                
            case 9:
                return 14;
                
            case 10:
                return 11;
                
            case 11:
                return 8;
                
            case 12:
                return 16;
                
            case 13:
                return 7;
                
            case 14:
                return 19;
                
            case 15:
                return 3;
                
            case 16:
                return 17;
                
            case 17:
                return 2;
                
            case 18:
                return 15;
                
            case 19:
                return 10;

            default:
                return 0;
        }
    }

}
