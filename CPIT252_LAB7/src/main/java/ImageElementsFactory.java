import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

  private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

  public ImageElement getFlyweight(String n) {
    String key=String.valueOf(n);
    if(flyweights.containsKey(n)){
        return flyweights.get(key);
    }
        ImageElement e =new ImageElement(n);
        flyweights.put(key,e);
    
        return e;
    
  }

  public int numberOfFlyweights() {
  return flyweights.size();
  }

}
