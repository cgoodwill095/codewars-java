package main.java.com.fifth;

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

            0,0 - straight up would be in the middle of 20, each section is 18 degrees, so 20 would the start of 20's section
            would be -9 from


            angle + 9 degrees




     */
    public String getScore(double x, double y)
    {
        // Calculate which scoring section
        String score = "";

        double c = (Math.sqrt((x*x) + (y*y)));

        //y = opposite
        //x = adjacent
        // tan(angle) = opposite/adjacent

        //If bullseye or bull, then direction doesn't matter
        if(c <12.7){
            score = "DB";
        }
        else if(c <31.8){
            score = "SB";
        }
        else if(c <198){
            //standard point
            double testDegree = Math.tan(x/y);
            System.out.println(testDegree);
        }
        else if(c <214) {
            //triple
            score="t";

        }
        else if(c <324){
            //standard points
        }
        else if(c <340){
            // double
        }
        else if(c>=340){
            score="X";
        }
        int angle = calculateAngle(x, y);
        //
        return score;
    }


    public int calculateAngle(double x, double y){
        Boolean negX = false;
        Boolean negY = false;
        if(x<0){
            negX = true;
        }
        if(y<0){
            negY = true;
        }


        if(negX){
            if(negY){

            }
            else{

            }
        }
        else{
            if(negY){

            }
            else{

            }
        }


    }

}
