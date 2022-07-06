import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Main main = new Main();
        main.test("04140469124990");
    }


    private String test(String s) {

        final List<String> inputList =
                Arrays.asList("04140489124578\tPersonal\tMr Des Smith\tSortCodeAccountNumber",
                        "04140469124990\tBusiness\tMatrix Limited\tSortCodeAccountNumber",
                        "04140459124221\tPersonal\tMrs Penny Jones\tSortCodeAccountNumber");

          for(int i = 0; i<inputList.size(); i++) {
              if (inputList.get(i).contains(s)) {
                  System.out.println(inputList.get(i));
                  return inputList.get(i);
              }
          }
          return null;
    }

}
