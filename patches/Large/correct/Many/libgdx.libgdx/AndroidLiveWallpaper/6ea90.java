diff --git a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidLiveWallpaper.java b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidLiveWallpaper.java
index ccad000..15efbc0 100644
--- a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidLiveWallpaper.java
+++ b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidLiveWallpaper.java
@@ -328,7 +328,7 @@
 	}
 
 	@Override
-	public void log (String tag, String message, Exception exception) {
+	public void log (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_INFO) Log.i(tag, message, exception);
 	}
 
