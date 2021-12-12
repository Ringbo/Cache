diff --git a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
index e1bd308..ac4b98d 100644
--- a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
+++ b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
@@ -264,7 +264,7 @@
 	}
 
 	@Override
-	public void log (String tag, String message, Exception exception) {
+	public void log (String tag, String message, Throwable exception) {
 		if (logLevel > LOG_NONE) {
 			System.out.println("[info] " + tag + ": " + message);
 			exception.printStackTrace();
