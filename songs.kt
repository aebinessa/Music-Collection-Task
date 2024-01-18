 fun main() {
    val songs: MutableList<String> = mutableListOf()

    songs.add("It Ain't Hard To Tell")
    songs.add("Renegade")
    songs.add("Wanksta")
    songs.add("FE!N")
    songs.add("Premeditated Murder")
    playAll(songs)
    println("////////////")
    addSong(songs, "First Person Shooter")
    playAll(songs)
    println("////////////")

    shuffleSongs(songs)
    playAll(songs)
    println("////////////")
    removeSongs(songs, "Wanksta")
    playAll(songs)
    println("////////////")
    showPlaylist(songs)

    //crerating a new list for artists to do step 6b in task
    val artists: MutableList<String> = mutableListOf()
    songs.clear()
    songs.add("It Ain't Hard To Tell")
    songs.add("Renegade")
    songs.add("Wanksta")
    songs.add("FE!N")
    songs.add("Premeditated Murder")
    artists.add("Kanye West")
    artists.add("Kendrick Lamar")
    artists.add("Bin Jesus")
    artists.add("3armoo6")
    showPlaylist(songs)
    findByArtist(artists,songs,"Bin Jesus")




    
}

fun playAll(songs: MutableList<String>){
    for (song in songs){
        println("Now Playing on IHeart Radio: $song")
    }
}
fun addSong(songs: MutableList<String>, songTitle: String){
    songs.add(songTitle)
}
fun shuffleSongs(songs: MutableList<String>){
    songs.shuffle()

}
fun removeSongs(songs: MutableList<String>, songTitle: String){
    songs.remove(songTitle)
}

fun showPlaylist(songs: MutableList<String>){
    for (song in songs){
        println(song)
    }
}

fun findByArtist(artists: MutableList<String>,songs: MutableList<String>,artistName: String)
{
    val index = artists.indexOf(artistName)
    val indexToRetrieve = 2 // Replace with the desired index
if (index in 0 until songs.size) {
    val retrievedElement = songs[index]
    println("Song by  $artistName: $retrievedElement")
} else {
    println("Artist not found")
}
    

}