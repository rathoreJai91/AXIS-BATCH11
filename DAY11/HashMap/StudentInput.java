package HashMap;

public class StudentInput {
    public static void main(String[] args) {
        System.out.println("---Students Records---");
        HelperClass h = new HelperClass();

        while(true){
            System.out.println("Select Choice \n 1: ADD STUDENT\n 2: SEARCH STUDENT\n 3: DELETE RECORD\n 4: exit");
            int choice = h.s.nextInt();
            switch(choice){
                case 1 : h.addStudent();
                    break;
                case 2 : h.searchStudent();
                    break;
                case 3 : h.deleteStudent();
                    break;
                case 4 : System.exit(1);
                    break;
                default : System.out.println("Wromg Choice");
            }
        }
    }

}
