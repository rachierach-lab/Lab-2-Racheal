public class WeightOfMars
{

        static float weightOfEarthKanyinji = 523.1f;
        static float marsGravityKanyinji = 0.38f;
        static float weightOfMarsKanyinji;

        static double weightOfMarsDoubleKanyinji;
        static int weightOfMarsIntKanyinji;
        static char weightOfMarsCharKanyinji;
        static int charMathResultKanyinji;



        public static void main(String[] args)
        {

            weightOfMarsKanyinji = weightOfEarthKanyinji * marsGravityKanyinji;
            System.out.println("Mars weight calculated using float: " + weightOfMarsKanyinji);

            weightOfMarsDoubleKanyinji = weightOfMarsKanyinji;
            System.out.printf("Mars weight as double (4 decimal places): %.4f\n", weightOfMarsDoubleKanyinji);

            weightOfMarsIntKanyinji = (int) weightOfMarsDoubleKanyinji;
            System.out.println("Double cast to int: " + weightOfMarsIntKanyinji);

            weightOfMarsCharKanyinji = (char) weightOfMarsIntKanyinji;
            System.out.println("Int cast to char: " + weightOfMarsCharKanyinji);


            charMathResultKanyinji = weightOfMarsCharKanyinji + 5;
            System.out.println("Char value + 5 stored as int: " + charMathResultKanyinji);
        }



}
