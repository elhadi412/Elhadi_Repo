import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Dictionary {

    public static void main(String[] args) throws InterruptedException {
        Third obj = new Third();

        String filename = "test.txt";
        String filename2 = "cities.txt";
        Map<Object,Object> dictMap = new HashMap<>();
        Set<Object> dictSet = new HashSet<>();
        //Set<String> dictSet2 = new HashSet<>();
        BufferedReader reader,reader1;
        try{
            reader = new BufferedReader((new FileReader(filename)));    //word & definition
            reader1 = new BufferedReader((new FileReader(filename2)));  //cities
            String line = reader.readLine();
            String line1 = reader1.readLine();
            while(/*line != null ||*/ line != null){
                if(line.equals(" ")) line = reader.readLine();
                    //if(line.length()<10){
                        String line2 = line;                                                // Line2 is the word
                        line = reader.readLine();                                           // Line becomes the definition
                        dictMap.put(line2,line);                                            // Put it into dictionary
                        line = reader.readLine();
                   // }
                line = reader.readLine();
                    dictSet.add(line1);
                    line1 = reader1.readLine();

            }
            reader.close();
            reader1.close();

        }
        catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();

        }


        //System.out.println(dictSet.toString());
        Object[] cities = dictSet.toArray();
        Object city = cities[new Random().nextInt(cities.length)];
        Scanner enter = new Scanner(System.in);

        Random rand = new Random();
        Object[] array = dictMap.keySet().toArray();
       Object key = array[rand.nextInt(array.length)];

       System.out.println(dictMap.get(key));
       //System.out.println(key + " : " +  dictMap.get(key));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi Welcome to SpellCheckerZ, " + name.toUpperCase() + "!\n");
       // TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("\033[1mPress enter to proceed\033[1m");
        enter.nextLine();
        System.out.println("Game Rules: 1) You have 3 chances for an incorrect guess");
        System.out.println("            2) Input one letter at a time");
        System.out.println("\n\033[1m     Press enter to proceed\033[1m");
        enter.nextLine();
        System.out.println("Today's word has the following characteristics: ");
        System.out.println("    Definition: " + dictMap.get(key));
        TimeUnit.MILLISECONDS.sleep(3500);
        System.out.println("    Word Length: " + key.toString().length()+"\n");
        //System.out.println("\n You have 3 chances to guess an incorrect letter.\n GOOD LUCK, " + name.toUpperCase());
        TimeUnit.MILLISECONDS.sleep(2500);
        System.out.println("You may now begin. GOOD LUCK, " + name.toUpperCase() +  "\n");
        System.out.println("Press enter to begin\n\n");
        enter.nextLine();
        long start = System.currentTimeMillis();
        Scanner guess = new Scanner(System.in);
        String[] bank = new String[key.toString().length()];
        int k=0, success=0,track=0,validator=0;
       for(String itr: bank){
           bank[k++] = "-";
       }
       System.out.println(Arrays.toString(bank));
        int count = 0;
       String storage;
        for(int i=0; i<key.toString().length();i++){
            storage = guess.next();


            if (Arrays.toString(bank).contains(storage)) {
                            i--;
                            System.out.println("You already guessed '" + storage + "' and it was correct. Pick another letter :)");
                        }
                if(key.toString().contains(storage)) {
                    char[] charcheck = storage.toCharArray();
                    int check = count(key.toString(), charcheck[0]);
                    if (check >= 2) {
                        if(!Arrays.toString(bank).contains(storage)){
                            success+=check;
                        }
                       // track++;
                        for (int z = 0; z < key.toString().length(); z++) {
                            if (key.toString().charAt(z) == charcheck[0]) {
                                bank[z] = storage;
                            }
                        }
//                        if(track == 1) {
//                            success += check;
//                        }
                    }
                    else {
                        int startIndex = key.toString().indexOf(storage);
                        int endIndex = key.toString().lastIndexOf(storage);

//                        if (!Arrays.toString(bank).contains(storage) && startIndex != endIndex) {
//                            success+=2;
//                        }
                        if(!Arrays.toString(bank).contains(storage) && startIndex==endIndex){
                            success++;
                        }

                        bank[startIndex] = storage;

                        if (startIndex != endIndex) {
                            bank[endIndex] = storage;
                        }




                    }

                }
                //System.out.println("success: " + success);
                 if(!key.toString().contains(storage)){
                     i--;
                    count++;
                }

            if(count == 4){
                System.out.println("You have used all your tries :/\n");
                System.out.println("The word was: " + key);
                System.exit(0);
            }



            System.out.println(Arrays.toString(bank));
            String level = " ";
            if(success==key.toString().length()){
                long stop = System.currentTimeMillis();
                System.out.println("CONGRATULATIONS, " + name.toUpperCase() + "! YOU SPELLED THE CORRECT WORD -> " + key);
                long time = stop - start;
                System.out.println("It took you " + time/1000 + " seconds to complete the challenge.\n\n");

                System.out.print("******** YOU WON A TRIP TO... ");
                TimeUnit.SECONDS.sleep(3);
                if(city==null){
                    city = cities[new Random().nextInt(cities.length)];
                }
                System.out.println(city + " ***********");
                System.exit(12);
            }
        }


    }

    public static int count(String s, char c){
        int res = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c) res++;
        }
        return res;
    }
}
