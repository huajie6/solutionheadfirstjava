public class HitGame{
    public static String getUserGuess(){
        int getUserGuess='\n';
            try{
                getUserGuess = System.in.read();
                if(getUserGuess=='\n'){
                    getUserGuess = System.in.read();
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        System.out.printf("getUserGuess:%c..\n",getUserGuess);
        System.out.printf("getUserGuess:%d..\n",getUserGuess+0);
        return String.valueOf(getUserGuess-48);
    }
    public static void main(String[] args){
        HitDotCom dotCom = new HitDotCom();
        int[] loc = {2,3,4};
        dotCom.setLocation(loc);
        String result = "miss";
        int guessNum = 0;
        while(result!="kill"){
            guessNum++;
            // System.out.println(guessNum);
            System.out.println("Type your guess:");
            try{
                String guess = String.valueOf(getUserGuess());
                result = dotCom.checkHit(guess);
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            
            if(result=="hit"){
                System.out.println("Good job, continue");
            }
            else if(result == "miss"){
                System.out.println("Pity, continue");
            }
            else{
                System.out.printf("U just try %d times;",guessNum);
                System.out.println("Congratulation！");
            }
        }

    }
}