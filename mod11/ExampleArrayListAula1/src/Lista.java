import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    private List<String> listNames = new ArrayList<>();

    public List getListNames(){
        return listNames;
    }

    public void setListNames(String listNames){
        this.listNames.add(listNames);
    }

    /**
     * Sort the list
     */
    public void sortList(){
        Collections.sort(listNames);
    }


}
