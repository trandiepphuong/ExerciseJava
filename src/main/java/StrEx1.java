public class StrEx1 {
    public String split(String n) {
        return String.join(", ", n.split("\\?|\\.|\\!|\\n"));
    }
}
