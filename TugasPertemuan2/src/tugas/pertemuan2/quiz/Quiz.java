package tugas.pertemuan2.quiz;

public abstract class Quiz {
    //UBAH INI
    // Ubah Modifier Menjadi Private (10 poin)
     String Soal;
     int Score;
     String Jawaban;
    
    // UBAH INI 
    // Buatkan Parameter dan set nilai nya ke properti kelas (10 poin)
    public Quiz(/*Isi Disni */) {
        //Isi disini
    }

    public abstract boolean submitAnswer();

    public int getScore(){
        return this.Score;
    }
    public String getSoal(){
        return this.Soal;
    }

}
