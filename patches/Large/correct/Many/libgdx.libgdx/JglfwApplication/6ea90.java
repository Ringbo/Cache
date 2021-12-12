diff --git a/backends/gdx-backend-jglfw/src/com/badlogic/gdx/backends/jglfw/JglfwApplication.java b/backends/gdx-backend-jglfw/src/com/badlogic/gdx/backends/jglfw/JglfwApplication.java
index 75d5c2e..8ccfd2e 100644
--- a/backends/gdx-backend-jglfw/src/com/badlogic/gdx/backends/jglfw/JglfwApplication.java
+++ b/backends/gdx-backend-jglfw/src/com/badlogic/gdx/backends/jglfw/JglfwApplication.java
@@ -377,7 +377,7 @@
 		}
 	}
 
-	public void log (String tag, String message, Exception exception) {
+	public void log (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_INFO) {
 			System.out.println(tag + ": " + message);
 			exception.printStackTrace(System.out);
