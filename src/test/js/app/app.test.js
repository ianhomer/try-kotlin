var app = require('../../../../target/js/try-kotlin.js');

describe('app test', function() {
  it('should add 2 numbers', function() {
     console.log(app.com.purplepip.kotlin.lang)
     console.log(app.com.purplepip.kotlin.app.Song)
     //expect(2).toBe(app.com.purplepip.kotlin.lang.maxOf(1,2))
     var song = new app.com.purplepip.kotlin.app.Song("song1", 1)
     console.log(song)
     expect(song.name).toBe("song1")
  })
})