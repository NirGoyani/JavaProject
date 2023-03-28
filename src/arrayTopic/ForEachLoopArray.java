package arrayTopic;

public class ForEachLoopArray {

    public static void main(String[] args) {

        String[] studentNames = {"Nirav","Naresh","Krishna","Yash","Nisha"};
        //Print all studentname
//        for(int i=0; i<studentNames.length; i++){
//            System.out.println(studentNames[i]);
//        }

        //For each
        for (String studentName:studentNames) {
            System.out.println(studentName);
        }

//        Automation - Usaage
//        String[] categories = {"Women","Mens","Boys","Girls"};
//        for (String category : categories ){
//            if(element == category){
//                System.out.println("it is there");
//            }
//        }

    }
}
