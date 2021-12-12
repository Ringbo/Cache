diff --git a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/GwtApplication.java b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/GwtApplication.java
index 13b0832..83d2c67 100644
--- a/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/GwtApplication.java
+++ b/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/GwtApplication.java
@@ -299,7 +299,7 @@
 	}
 
 	@Override
-	public void log (String tag, String message, Exception exception) {
+	public void log (String tag, String message, Throwable exception) {
 		if (logLevel >= LOG_INFO) {
 			checkLogLabel();
 			log.setText(log.getText() + "\n" + tag + ": " + message + "\n" + exception.getMessage() + "\n");
