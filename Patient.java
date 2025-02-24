public class Patient {
    public int id_number;
    public double caffeine_level;

    public Patient(int id_number, double caffeine_level){
        this.id_number = id_number;
        this.caffeine_level = caffeine_level;

    }
    @Override
    public String toString(){
        return id_number + " " + caffeine_level;
    }
}
