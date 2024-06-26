package ex01;

public class OldTest {
  public static void main(String[] args) {
    try {
        String result = getFromArray(new String[]{"A","B",null},3);
        if(result == null){
        System.out.println("empty");
        return;
    }
    System.out.println();
  }  catch (IllegalArgumentException e) {
    System.out.println("exception");
  }
}

  private static <T> T getFromArray(T[] array, int index) {
    if (array == null) {
        throw new IllegalArgumentException();
    }
    try {
        return array[index];
    } catch (ArrayIndexOutOfBoundsException e) {
        throw new IllegalArgumentException(e);
    }
  }
}
