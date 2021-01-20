class Main {
  public static void main(String[] args) {

    double total = 0;    
    for (int index = 0; index < 8; index ++) {
      double attendance = Keyboard.getInt("Please enter the attendance of Game " + (index + 1));
      total = total + attendance;
    }
    int average = (int) Math.round(total / 8 ); //rounds like maths so 13 is stored\
    System.out.println("Average cricket attendance is " + average + " this year.");

  }
}
