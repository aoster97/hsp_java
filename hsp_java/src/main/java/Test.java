import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.Connection;
 
public class Test {

    Connection conn = Jsoup.connect("http://www.17sct.com/city.php?name=CHANGZHOU");
    conn.method(Method.GET);
    conn.followRedirects(false);
    Response response = conn.execute();
    System.out.println(response.cookies());

    public static void main(String[] args) {
         String str = "<table><tr><td>user</td><td>cc</td></tr><tr><td>pass</td><td>123</td></tr></table>";
 
        Document doc = Jsoup.parse(str);
        Elements trs = doc.select("table").select("tr");
        for(int i = 0;i<trs.size();i++){
            Elements tds = trs.get(i).select("td");
            for(int j = 0;j<tds.size();j++){
                String text = tds.get(j).text();
                System.out.println(text);
            }
        }
    }
 
}