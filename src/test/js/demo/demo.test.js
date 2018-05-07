var demo = require('../../../../target/js/try-kotlin')
var Playlist = demo.com.purplepip.kotlin.demo.Playlist

// Set up aliases for mangled method names
Playlist.prototype.addSong = Playlist.prototype.addSong_gpnp0z$
var myMaxOf = demo.com.purplepip.kotlin.lang.myMaxOf_vux9f0$

describe('demo test', function() {
  it('should add 2 numbers', function() {
    expect(2).toBe(myMaxOf(1,2))
    var song1 = new demo.com.purplepip.kotlin.demo.Song("song1", 1)
    var song2 = new demo.com.purplepip.kotlin.demo.Song("song2", 2)
    //console.log(song1)
    expect(song1.name).toBe("song1")
    var playlist = new Playlist()
    playlist.addSong(song1)
    playlist.addSong(song2)
    expect(playlist.getLength()).toBe(3)
  })

  it('scratch pad', function() {
    //console.log(kotlin)
    //console.log(demo.com.purplepip.kotlin.lang)
    //console.log(demo.com.purplepip.kotlin.demo.Song)
  })
})