Progress
=====

- Versão 1.1
- SDK Min: 21

![](https://raw.githubusercontent.com/Pierry/Progress/master/art/custom.png)
![](https://raw.githubusercontent.com/Pierry/Progress/master/art/dark.png)
![](https://raw.githubusercontent.com/Pierry/Progress/master/art/light.png)


Gradle
====

Into your app build.gradle:

Ensure you add the maven { url "https://jitpack.io" } under allprojects instead of buildscript.

	buildscript {
	  repositories {
	    jcenter()
	    // DO NOT ADD IT HERE!!!
	  }
	  ...
	}

	allprojects {
 	  repositories {
	    mavenLocal()
	    jcenter()
	    // ADD IT HERE
	    maven { url "https://jitpack.io" }
	  }
	}


	dependencies {
	  implementation 'com.github.Pierry:Progress:1.0'
	}

Ref. https://jitpack.io/#Pierry/Progress/1.1


Usage
=====

The API is kept as simple as the ProgressDialog(Deprecated):

Create a Progress:

	Progress progress = new Progress(context);

Default light:

	progress.light(CharSequence);
                
Default dark:

	progress.dark(CharSequence);
                
Customize it:

	progress.setBackgroundColor(getResources().getColor(R.color.your_color))
          .setMessage(CharSequence)
	      .setMessageColor(getResources().getColor(R.color.message_color))
          .setProgressColor(getResources().getColor(R.color.progress_color))
	      .show();
        
Methods:

	    progress.dark(String message); // set dark theme
        progress.light(String message); // set light theme
	    progress.setBackgroundDrawable(Drawable drawable); // set Background layout
        progress.setBackgroundColor(getResources().getColor(R.color.your_color)); // set Background color
        progress.setProgressColor(getResources().getColor(R.color.your_color)); // set ProgressBar color
        progress.setMessageColor(getResources().getColor(R.color.your_color)); // set Message color
        progress.show(); // show ProgressBar
        progress.dismiss(); //dismiss ProgressBar
        


Questions
=====

Questions regarding Progress can be asked on StackOverflow, using the Progress tag.

Developed By
======

Pierry Borges - http://pierry.github.io - pieerry@gmail.com

License
=====

Apache Version 2.0
