package Service;

import java.awt.*;
import java.util.HashMap;

public interface ParsingInterface <T, E>{

    void saveList(HashMap<T, E> dats);

    T getList();

}
