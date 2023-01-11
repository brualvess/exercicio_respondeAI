public class App {
    public static void main(String[] args) throws Exception {
        Signup newUser = new Signup();
        newUser.name = "Joaninha";
        newUser.setEmail("joaninha@gmail.com");

        Course study = new Course();
        study.courseName = "Programação";
        study.storyName = "Python";

        String response = String.format("A aluna %s estará realizando o curso de %s.", newUser.name, study.storyName);
        System.out.println(response);
    }
}
