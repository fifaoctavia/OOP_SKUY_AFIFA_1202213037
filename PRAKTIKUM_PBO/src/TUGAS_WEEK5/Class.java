package TUGAS_WEEK5;
// AFIFA NUR OCTAVIANI - 1202213037 - SI4501
public class Class{
    public int detectgolongan(String golongan){
        if (golongan.equals("1")){
            return 3000000;
        } 
        else if (golongan.equals("2")){
            return 4000000;
        } 
        else if (golongan.equals("3")){
            return 5000000;
        }
        else if (golongan.equals("4")){
            return 6000000;
        } 
        return 0;
    }
    
    public double detectstatus(String status){
        if (status.equals("Ya")){
            return 0.2;
        } 
        else if (status.equals("Tidak")){
            return 0;
        }
        return 0;
    }

    public int detectanak(int anak){
        if (anak <= 3){
            return anak*150000;
        }
        else if (anak > 3){
            return 450000;
        }
        return 0;
    }
}
