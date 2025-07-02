package runners;

public class NewClass {
    public static void main(String[] args) {
        String personGUID="";
        String input = "{\"query\":\"{personDocument(where:{personGUID:{eq:\\\""+personGUID+"\\\"}}){documentNumber,expiration,name}}\",\"variables\":{}}";
        System.out.println("\\\\\"toa  kn");
        System.out.println("{\"query\":\"{personDocument(where:{personGUID:{eq:\\\""+personGUID+"\\\"}}){documentNumber,expiration,name}}\",\"variables\":{}}");
    }
}// {"query":"{personDocument(where:{personGUID:{eq:"8888"}}){documentNumber,expiration,name}}","variables":{}}
//  {"query":"{personDocument(where:{personGUID:{eq:\"\"5656\"\"}}){documentNumber,expiration,name}}","variables":{}}