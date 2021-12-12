diff --git a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCanvas.java b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCanvas.java
index 38591b5..270c244 100644
--- a/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCanvas.java
+++ b/backends/gdx-backend-lwjgl/src/com/badlogic/gdx/backends/lwjgl/LwjglCanvas.java
@@ -356,7 +356,7 @@
 	}
 
 	@Override
-	public void log (String tag, String message, Exception exception) {
+	public void log (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_INFO) {
 			System.out.println(tag + ": " + message);
 			exception.printStackTrace(System.out);
