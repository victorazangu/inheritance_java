public class marketer extends employee {

    //only for marketer
    public  boolean insideMarket(){
        return true;
    }

    @Override
    public int getHours() {
        return 50;
    }
}
