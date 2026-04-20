package Practice;

public class LgSmartTv extends LgOldTv{
    @Override
    void changeChannel(){
        System.out.println("Object channel changed");
    }
    void playGame(){
        System.out.println("Object is playing game");
    }
    public static void main(String[] args) {
        LgOldTv oldtv = new LgSmartTv();
        oldtv.startTv();
        oldtv.stopTv();
        oldtv.increaseVolume();
        oldtv.changeChannel();

        LgSmartTv object = new LgSmartTv();
        object.playGame();
        
    }
}
