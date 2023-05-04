import java.util.List;
import java.util.Map;

public interface Board {



    List<Coord> salvo(List<Coord> shots);

    List<Pair<Coord, Dir>> setup(Map<String, Integer> specifications);

    void hits(List<Coord> shots);


}
