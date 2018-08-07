import java.util.*;
public class HitDotCom{
    private int[] location;
    private int hitNum;
    public int[] getLocation(){
        return location;
    }

    public void setLocation(int[] loc){
        location = loc;
    }

    public String checkHit(String userGuess){
        String result = "miss";
        int userGuessInt = Integer.parseInt(userGuess);
        for(int i=0;i<location.length;i++){
            if(userGuessInt==location[i]){
                hitNum++;
                if(hitNum==location.length){
                    result =  "kill";
                }
                else{
                    result = "hit";
                }
                break;
            }
        }
        return result;
    }
}