public class HitDotComTest{
    public static void main(String[] args){
        HitDotCom dotCom = new HitDotCom();
        int[] loc = {2,3,4};
        dotCom.setLocation(loc);
        String userGuess = "2";
        String result = dotCom.checkHit(userGuess);
        String testResult = "fail";
        if(result.equals("hit")){
            testResult = "pass";
        }
        System.out.println(testResult);
    }
}