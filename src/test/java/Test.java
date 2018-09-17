import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String arg[]){
        Integer[] aaa = {1,32,1,2,5,1,3};
        List<Integer> bbb = new ArrayList<>();
        User ccc[] = {new User(5),new User(6),new User(7)};
        bbb.add(5);
        bbb.add(9);
        for (Integer a:
             aaa) {
            System.out.println("这是a的值"+aaa);
        }

        for (Integer b:
             bbb) {
            System.out.println("这是b的值"+b);
        }

        for (User c:
             ccc) {
            System.out.println(c.getId());
        }
        if(aaa[0] == aaa[4]){
            System.out.println("判定成功！");
        }
    }
}
