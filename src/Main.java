import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    private static char[][] zeilenweiseInRasterSchreiben(String a){
        char[][] array = new char[4][7] ;
        int n = 0 ;
        int m = 0 ;
        for (int i = 0; i < a.length(); i++) {
            if(m == 7){
                m = 0 ;
                n ++ ;
            }
            char h = a.charAt(i) ;
            if (h == ' '){
                array[n][m] = '-';
            }else {
                array[n][m] = h ;
            }
            m ++ ;
        }
        return array ;
    }
    private static String rasterSpaltenweiseAblesen(char[][] a ){
        String toreturn = " ";
        int m= 0 ;
        for (int n = 0; n < 5; n++) {
            if(n == 4 ){
                n = 0 ;
                m++ ;
            }
            char h = a[n][m] ;
            toreturn += h ;

        }
        return toreturn.replaceFirst(" ", "") ;
    }
    private static String verschluesseln(String a){
        char[][] b = zeilenweiseInRasterSchreiben(a) ;
        return rasterSpaltenweiseAblesen(b);
    }
    private static char[][] spaltenweiseInRasterSchreiben(String a){
        char[][] array1 = new char[4][7] ;
        int n = 0 ;
        int m = 0 ;
        for (int i = 0; i < a.length(); i++) {
            if(n == 4){
                n = 0 ;
                m++ ;
            }
            char h = a.charAt(i) ;
            if (h == ' '){
                array1[n][m] = '-';
            }else {
                array1[n][m] = h ;
            }
            n ++ ;
        }
        return array1 ;

    }
    private static String rasterZeilenweiseAblesen(char[][] a){
        String toreturn1 = " ";
        int n= 0 ;
        for (int m = 0; m < 8; m++) {
            if(m == 7 ){
                m = 0 ;
                n++ ;
            }
            char h = a[n][m] ;
            toreturn1 += h ;

        }
        return toreturn1.replaceFirst(" ", "") ;
    }
    private static String entschluesseln(String a){
        char[][] e = spaltenweiseInRasterSchreiben(a) ;
        return rasterZeilenweiseAblesen(e) ;
    }
}