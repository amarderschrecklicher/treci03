import java.util.Scanner;

public class Sat {
    Scanner in = new Scanner(System.in);
    static int sati;
    static int minute;
    static int sekunde;
    Sat(int sati, int minute, int sekundee) { Postavi(sati,minute,sekundee); }
    void Postavi(int sati, int minute, int sekundee) { Sat.sati=sati; Sat.minute=minute; Sat.sekunde=sekundee; }
    void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
        else for (int i=0; i<-pomak; i++) Prethodni();
    }
    int DajSate()  { return sati; }
    int DajMinute() { return minute; }
    int DajSekunde() { return sekunde; }
    void Ispisi() { System.out.println(sati+":"+minute+":"+sekunde); }


}
