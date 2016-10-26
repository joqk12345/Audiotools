import com.thinkit.auidotools.WavCut;

import java.io.File;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String wavPath ="D://2.wav";
        String targetWavPath ="D://2_0_10.wav";
//        System.out.println(WavCut.getTimeLen(new File(wavPath)));
        System.out.println(WavCut.cutALawWave(wavPath,targetWavPath,0,10));
//        System.out.println(WavCut.cutwav(wavPath,targetWavPath,0,10));

    }
}
