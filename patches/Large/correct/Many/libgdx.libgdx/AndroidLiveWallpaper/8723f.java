diff --git a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidLiveWallpaper.java b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidLiveWallpaper.java
index 4ca39bd..962696c 100755
--- a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidLiveWallpaper.java
+++ b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidLiveWallpaper.java
@@ -83,7 +83,7 @@
 		graphics = new AndroidGraphicsLiveWallpaper(this, config.useGL20, config.resolutionStrategy==null?new FillResolutionStrategy():config.resolutionStrategy);
 		input = AndroidInputFactory.newAndroidInput(this, this.getService(), null, config);
 		audio = new AndroidAudio(this.getService(), config);
-		files = new AndroidFiles(this.getService().getAssets());
+		files = new AndroidFiles(this.getService().getAssets(), this.getService().getFilesDir().getAbsolutePath());
 		this.listener = listener;
 		
 		Gdx.app = this;
