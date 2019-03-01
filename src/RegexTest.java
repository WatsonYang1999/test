import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
class A implements Comparable<A>
{

    private String s;
    private int x;
    public A (String s,int x){
        this.s=s;
        this.x=x;
    }
    public String getS()
    {
        return this.s;
    }
    public int getX()
    {
        return this.x;
    }
    public int compareTo(A a){
        if(this.x==a.x)
        {
            return this.s.compareTo(a.s);
        }
        else if(this.x<a.x)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
public class RegexTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //String p = "[1-9][0-9]+";
        //String str = sc.nextLine();
        //Pattern pt = Pattern.compile("a[0-9]z");
        //Matcher m  = pt.matcher(str);
        //System.out.println(m.find());
        //System.out.println(Pattern.matches(p,str));

        ArrayList<A> arrayList = new ArrayList<>();
        A a1 = new A("abc",3);
        A a2 = new A("bac",2);
        A a3 = new A("cba",3);
        System.out.println(a2.compareTo(a3));
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        Collections.sort(arrayList);
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i).getX()+"  "+arrayList.get(i).getS());
        }

    }
}
