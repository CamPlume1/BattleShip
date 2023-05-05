import java.util.List;

public class PlayerImpl extends BoardImpl implements Player{


    @Override
    public void mirrorClientPlacement(List<Ship> playerShips) {
        super.fleet = playerShips;
    }

}
