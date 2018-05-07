var app = require('../../../../target/js/try-kotlin');

describe('app test', function() {
  it('should add 2 numbers', function() {
    expect(2).toBe(app.com.purplepip.kotlin.lang.myMaxOf_vux9f0$(1,2))
    var song1 = new app.com.purplepip.kotlin.app.Song("song1", 1)
    var song2 = new app.com.purplepip.kotlin.app.Song("song2", 2)
    //console.log(song1)
    expect(song1.name).toBe("song1")
    var playlist = new app.com.purplepip.kotlin.app.Playlist()
    playlist.addSong_6ikyoh$(song1)
    playlist.addSong_6ikyoh$(song2)
    expect(playlist.getLength()).toBe(3)
  })

  it('scratch pad', function() {
    //console.log(kotlin)
    //console.log(app.com.purplepip.kotlin.lang)
    //console.log(app.com.purplepip.kotlin.app.Song)
  })
})