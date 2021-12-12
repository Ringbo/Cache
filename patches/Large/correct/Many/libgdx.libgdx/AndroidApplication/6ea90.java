diff --git a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidApplication.java b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidApplication.java
index a0d93b5..3c472ce 100644
--- a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidApplication.java
+++ b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidApplication.java
@@ -381,7 +381,7 @@
 	}
 
 	@Override
-	public void log (String tag, String message, Exception exception) {
+	public void log (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_INFO) Log.i(tag, message, exception);
 	}
 
