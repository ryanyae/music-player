# Music Player Project
## Being able to play music


### **PHASE 1: TASK 2**

My project will be of a **music playing application**. Range of people will be able to use my application ranging 
music enthusiasts to those periodic listeners. In a perfect world this would be the place where you favourite 
artists will be able to release their new albums, singles, etc. But this application is not so much about the 
artists, but for the user and their overall experience. This project interests me because I have a big
passion for **software engineering** and just the realm of coding in general. I have done other personal projects, 
for now, only consists of fully functional websites hand typed by me :). I am hoping with this project that I am
able to expand my grasp on software engineering and make something other than a website.

### **PHASE 1: TASK 3**
* As a user I want to be able to add songs to my playlist.
* As a user I want to be able to make new playlists.
* As a user I want to be able to pause and resume my music whenever I want.
* As a user I want to be able to delete some playlists.
* As a user I want to be able to save previous playlists
* As a user I want to be given the option to reload my previous playlists

### ***Instructions for the Grader***

- you can generate the first required event related to adding X's to a Y by making new playlists through the "view all
playlists button", you are allowed to make multiple playlists and with the choice of naming them as well
- you can generate the second required event related to adding X's to a Y by adding a song through the "browse our song
    library" button and adding a song to an existing playlist
- you can locate my visual component by listening to a song from an existing playlist with songs inside or
listening to a song through the "browse our song library" and seeing the unique cover arts of each song.
- you can save the state of my application by clicking the "save all playlists" button
- you can reload the state of my application by clicking the "load previous playlists" button
- **when double-clicking on a song to play be careful as multiple instances of the same song can play**


### PHASE 4: TASK 2
- Sun Nov 27 17:40:27 PST 2022
Created new playlist named: 1234
- Sun Nov 27 17:40:34 PST 2022
Added song (One Kiss by Dua Lipa) to 1234
- Sun Nov 27 17:40:38 PST 2022
Added song (Levitating by Dua Lipa) to 1234
- Sun Nov 27 17:40:53 PST 2022
Created new playlist named: 123

### PHASE 4: TASK 3
If I were to refactor my code in any way will be doing so by editing a single frame instead of making new frames
and then having to make some frames visible and others invisible. Instantiating less objects, such as frames, can 
ease the load on any computer. After having learned the Singleton Design I would change my project in a way so that
only one frame is able to play a song. This change will most definitely make my code easier to read and take advantages
of single instances from bugs that allow multiple instances of a song to be able to be played. Another thingI would 
change is an easily accessible JSON file where all the songs in my library can be just read instead of having to 
manually instantiate every song, this change will make my code so much readable and reduce redundant code that makes a 
new library every time.