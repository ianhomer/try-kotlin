var demo = require('../../../../target/js/try-kotlin');

describe('demo test', function() {
  it('should add 2 numbers', function() {
    expect(2).toBe(demo.com.purplepip.kotlin.lang.myMaxOf_vux9f0$(1,2))
    var song1 = new demo.com.purplepip.kotlin.demo.Song("song1", 1)
    var song2 = new demo.com.purplepip.kotlin.demo.Song("song2", 2)
    //console.log(song1)
    expect(song1.name).toBe("song1")
    var playlist = new demo.com.purplepip.kotlin.demo.Playlist()
    playlist.addSong_gpnp0z$(song1)
    playlist.addSong_gpnp0z$(song2)
    expect(playlist.getLength()).toBe(3)
  })

  it('scratch pad', function() {
    //console.log(kotlin)
    //console.log(demo.com.purplepip.kotlin.lang)
    //console.log(demo.com.purplepip.kotlin.demo.Song)
  })
})