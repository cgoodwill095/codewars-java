package main.java.com.codewars.fifth;

public class Dartboard {

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
