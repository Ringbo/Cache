diff --git a/gdx/src/com/badlogic/gdx/Application.java b/gdx/src/com/badlogic/gdx/Application.java
index cf8ce5d..fb69334 100644
--- a/gdx/src/com/badlogic/gdx/Application.java
+++ b/gdx/src/com/badlogic/gdx/Application.java
@@ -129,7 +129,7 @@
 	public void log (String tag, String message);
 
 	/** Logs a message to the console or logcat */
-	public void log (String tag, String message, Exception exception);
+	public void log (String tag, String message, Throwable exception);
 
 	/** Logs an error message to the console or logcat */
 	public void error (String tag, String message);
