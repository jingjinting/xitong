import java.util.ArrayList;
import java.util.List;

public class jihe {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add(888.8f);
        list.add(false);
        System.out.println("当前集合的元素个数:"+list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
