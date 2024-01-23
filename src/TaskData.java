
import java.util.HashSet;
import java.util.Set;
public class TaskData {

    private static String bobsTasks = """
            Programing, Design , Medium, Assigned 
            Project, Budget, High, In Progress """;

    private static  String carolTasks = """
            Human Resource, Connection, High, In Progress
            Human Resource, Solutions, Medium, In queue """;

    private  static String annsTasks = """
            Cloud Service, Java , High, In Progress
            Devops, Arcitect, Low, Assigned""";

    public static Set<Task> getTasks(String person){
        Set<Task> taskList = new HashSet<>();


        String tasksData;
            switch (person.toLowerCase()) {
                case "bob":
                    tasksData = bobsTasks;
                    break;
                case "carol":
                    tasksData = carolTasks;
                    break;
                case "ann":
                    tasksData = annsTasks;
                    break;
                default:
                    tasksData = "";
                    break;
            };


        return  taskList;
    }

    public static String getBobsTasks() {
        return bobsTasks;
    }

    public static void setBobsTasks(String bobsTasks) {
        TaskData.bobsTasks = bobsTasks;
    }

    public static String getCarolTasks() {
        return carolTasks;
    }

    public static void setCarolTasks(String carolTasks) {
        TaskData.carolTasks = carolTasks;
    }

    public static String getAnnsTasks() {
        return annsTasks;
    }

    public static void setAnnsTasks(String annsTasks) {
        TaskData.annsTasks = annsTasks;
    }


}
