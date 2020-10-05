package classThree.com;

public class AmphibiousArtist implements PlayMovie,TVSeries,Sing{

    @Override
    public void PlayInMovie() {
        System.out.println("可以演电影");
    }

    @Override
    public void SingSong() {
        System.out.println("可以演电视剧");
    }

    @Override
    public void ActingTVSeries() {
        System.out.println("可以唱歌");
    }
}
