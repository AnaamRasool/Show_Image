# Show_Image
Show Imageview above Videoview

You can show images inside imageview in interval of every 10 seconds for 5 seconds of videoview current duration.

You just need place the dependency inside the build.gradle file of your app.
Then Create a constructer like this: Show show = new Show();

Then call function showImage using this show constructer as: show.showImage(Videoview v, ImageView iv, String[] s, Context context);

And the arguments passed here are VideoView of your video and ImageView where you want to show image and array of string for url.
