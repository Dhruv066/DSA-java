package oops;
class truck{
    MusicPlayer player;
    truck(MusicPlayer player){
        this.player = player;
    }
    void  start(){
        System.out.println("truck started");
        player.play();
    }
}
class MusicPlayer{
    void play(){
        System.out.println("playing music...");
    }
}