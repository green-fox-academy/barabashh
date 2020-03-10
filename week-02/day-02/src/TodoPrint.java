public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        todoText = "My todo:\n" + todoText;
        todoText += " - Download games\n";
        todoText += "\t - Diablo\n";
        System.out.println(todoText);
    }
}
