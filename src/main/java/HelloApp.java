public class HelloApp {

    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder sb = new StringBuilder();

            for (String name : args) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(name);
            }

            message = "Hello, " + sb.toString() + "!";
        }

        System.out.println(message);
    }
}