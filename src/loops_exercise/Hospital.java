package loops_exercise;

public class Hospital {
    public Patient[] patients;

    public static final int MAX = 10;

    public int resgistered;


    public Hospital(){
       patients = new Patient[MAX];
       resgistered = 0;
    }

    public void addPatient(Patient patient){

        if(resgistered < MAX){
            patients[resgistered] = patient;
            resgistered++;
        } else {
            System.out.println("Nie ma miejsc");
        }

    }

    public void printPatient(){

        for (int i = 0; i < resgistered; i++) {
            System.out.println("Lista: " + patients[i].getName()
                    + " " + patients[i].getSurname() + " " + patients[i].getPesel() );
        }


    }













}
