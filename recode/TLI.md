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

**StringBuilder**
```text
많은 문자열을 연결하면 많은 중간 문자열 객체가 생성되어 비효율적인 코드가 생성된다.
```

* 예를 들어, 100만 개의 문자열을 연결해야 하는 상황이 왔다고 가정하자.
* 문자열끼리 연결하는 작업 시에는 내부적으로 여러 작업이 발생하고, 기존 문자열 값의 길이에 추가된 문자열의 크기를 더한 크기의
    새로운 문자열이 생성된다.
* 이걸 100만 번 숭행해야 하니 메모리를 많이 잡아먹게 된다.
* 이런경우 고려해볼 수 있는 것 중 하나가 StringBuilder다.
  * String은 변경 불가능한 문자열을 생성하지만 StringBuilder는 변경 가능한 문자열을 만들어 준다.

```java
public class Main{
    public static void main(String[] arags){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder("문자열").append("연결");
        
        // String str = stringBuilder; // stringBuilder를 그대로 넣을 수는 없다.
        string str = stringBuilder.toString();
        // 두 println은 똑같은 값을 출력한다.
        System.out.println(stringBuilder);
        System.out.println(str);
    }
}
```