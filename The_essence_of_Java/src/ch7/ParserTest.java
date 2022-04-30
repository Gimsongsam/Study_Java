package ch7;

interface Parseable{
    // 구문 분석작업을 수행한다.
    public abstract void parse (String fileName);
}

class ParserManager{
    // 리턴타입이 Parseable인터페이스이다.
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        }else{
            return new HTMLParser();
        }
    }
}

class XMLParser implements Parseable{
    public void parse(String fileName){
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "- XML parsing completed");
    }
}

class HTMLParser implements Parseable{
    public void parse(String fileName){
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "- HTML parsing completed.");
    }
}

public class ParserTest {
    public static void main(String args[]){
        Parseable parser = ParserManager.getParser("XML");  // parser는 XMLParser 인스턴스 주소값을 갖게 된다.
                                                                  // == Paserable parser = new XMLParser();
        parser.parse("document.xml"); // XMLParser 인스턴스의 parse 메서드가 호출된다.
        parser = ParserManager.getParser("HTML ");
        parser.parse("document2.html");
    }
}
