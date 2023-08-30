    import java.util.ArrayList;
    import java.util.LinkedList;
    
    public class Album {
        private String name;
        private String artist;
        private ArrayList<Song> songs;
     
        public Album(String name, String artist) {
            this.name = name;
            this.artist = artist;
            songs = new ArrayList<Song>();
        }
     
        public boolean addSong(String title, double duration){
            if(findSong(title) != null) return false;
            Song newSong = new Song(title, duration);
            songs.add(newSong);
            return true;
        }
     
        private Song findSong(String title){
            for(int i=0;i<songs.size();i++){
                Song currentSong = songs.get(i);
                if(currentSong.getTitle() == title) return currentSong;
            }
            return null;
        }
     
        public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
            if(trackNumber <= 0) return false;
            Song song = songs.get(trackNumber-1);
            playlist.add(song);
            return true;
        }
     
        public boolean addToPlayList(String title, LinkedList<Song> playlist){
            Song song = findSong(title);
            if(song == null) return false;
            playlist.add(song);
            return true;
        }
    }
