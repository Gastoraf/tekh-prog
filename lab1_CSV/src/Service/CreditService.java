package Service;

import Entity.Credit;

import java.util.HashMap;

public class CreditService implements ParsingInterface{

    private HashMap<Integer, Credit> creditMap;

    @Override
    public void saveList(HashMap dats) {
        try {
            for (int i = 0; i < dats.size(); i++){
                String[] str = (String[]) dats.get(i);
                if (str[0].trim().equalsIgnoreCase("credit")){
                    creditMap.put(new Credit(str[1], str[2], st));
                }

            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public Object getList() {
        return null;
    }
}
