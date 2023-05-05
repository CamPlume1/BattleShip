public class Referee implements IReferee{
    private Board p1Board;
    private Board p2Board;
    private Player client1;
    private Player client2;



    public Referee(Player p1, Player p2){
        this.client1 = p1;
        this.client2 = p2;
        this.p1Board = new BoardImpl();
        this.p2Board = new BoardImpl();
    }


    /**
     * Execute Game Of BattleShip
     */
    @Override
    public void run() {

    }
}
