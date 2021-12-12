diff --git a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidDaydream.java b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidDaydream.java
index 10f7211..c1e2936 100644
--- a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidDaydream.java
+++ b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidDaydream.java
@@ -371,7 +371,7 @@
 	}
 
 	@Override
-	public void log (String tag, String message, Exception exception) {
+	public void log (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_INFO) Log.i(tag, message, exception);
 	}
 
