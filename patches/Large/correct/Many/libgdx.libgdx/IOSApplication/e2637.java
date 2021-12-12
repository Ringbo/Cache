diff --git a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
index 4e69b45..96f15ec 100644
--- a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
+++ b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
@@ -290,14 +290,14 @@
 	@Override
 	public void log (String tag, String message) {
 		if (logLevel > LOG_NONE) {
-			Foundation.NSLog("[info] " + tag + ": " + message);
+			Foundation.log("[info] " + tag + ": " + message);
 		}
 	}
 
 	@Override
 	public void log (String tag, String message, Throwable exception) {
 		if (logLevel > LOG_NONE) {
-			Foundation.NSLog("[info] " + tag + ": " + message);
+			Foundation.log("[info] " + tag + ": " + message);
 			exception.printStackTrace();
 		}
 	}
@@ -305,14 +305,14 @@
 	@Override
 	public void error (String tag, String message) {
 		if (logLevel >= LOG_ERROR) {
-			Foundation.NSLog("[error] " + tag + ": " + message);
+			Foundation.log("[error] " + tag + ": " + message);
 		}
 	}
 
 	@Override
 	public void error (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_ERROR) {
-			Foundation.NSLog("[error] " + tag + ": " + message);
+			Foundation.log("[error] " + tag + ": " + message);
 			exception.printStackTrace();
 		}
 	}
@@ -320,14 +320,14 @@
 	@Override
 	public void debug (String tag, String message) {
 		if (logLevel >= LOG_DEBUG) {
-			Foundation.NSLog("[debug] " + tag + ": " + message);
+			Foundation.log("[debug] " + tag + ": " + message);
 		}
 	}
 
 	@Override
 	public void debug (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_DEBUG) {
-			Foundation.NSLog("[error] " + tag + ": " + message);
+			Foundation.log("[error] " + tag + ": " + message);
 			exception.printStackTrace();
 		}
 	}
