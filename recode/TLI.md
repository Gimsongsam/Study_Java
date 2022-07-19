#ToDay I Learn - JAVA
###20220719
**node json**
```java
// jsonNode 생성하기
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateJsonNode{
    public static void main(String[] args){
        JsonNode jsonNode = mapper.createObjectNode();
    }
}

// Array Node 생성하기
public class CreateArrayNode{
    public static void main(String[] args){
        ArrayNode arrayNode = mapper.createArrayNode();
    }
}
```