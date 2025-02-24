import java.util.ArrayList;
public class PatientManager{
    public ArrayList<Patient> patients;

    public PatientManager(){
        patients = new ArrayList<>(10);
    }
    public void addPatient(Patient patient){
        if(patients.size()< 10){
            patients.add(patient);
        }
    }
    public void removePatient(){
        if (patients.size() > 0){
            patients.remove(patients.size() -1);
        }
    }
    public void caffeineAbsorption(){
        for(int i = 0; i < patients.size();i++){
            patients.get(i).caffeine_level = patients.get(i).caffeine_level -160;
            if(patients.get(i).caffeine_level <= 0){
                patients.remove(i);
                i--;
            }
        }
    }
    @Override
    public String toString(){
        String outStr = "";
        for(int i = 0; i < patients.size();i++){
            if(patients.get(i) != null){
                outStr += patients.get(i).id_number + " " + patients.get(i).caffeine_level + "\n";

            }
        }
        if(outStr.length() == 0){
            return "Empty";
        } else {
            return outStr;
        }
    }
}