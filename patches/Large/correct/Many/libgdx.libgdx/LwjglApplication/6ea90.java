diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglApplication.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglApplication.java
index 1d1b094..5f2e661 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglApplication.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglApplication.java
@@ -347,7 +347,7 @@
 	}
 
 	@Override
-	public void log (String tag, String message, Exception exception) {
+	public void log (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_INFO) {
 			System.out.println(tag + ": " + message);
 			exception.printStackTrace(System.out);
