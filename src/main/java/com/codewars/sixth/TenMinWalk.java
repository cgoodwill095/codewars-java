package main.java.com.codewars.sixth;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if(walk.length!= 10){
            return false;
        }
        // Lat & lon should be named x & y for ease of understanding
        int lat = 0, lon = 0;
        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n':
                    lat++;
                    break;
                case 's':
                    lat--;
                    break;
                case 'e':
                    lon++;
                    break;
                case 'w':
                    lon--;
                    break;
            }
        }
        System.out.println(5/2);
        System.out.println(5%2);

        return (lat==0 && lon==0);
    }
}