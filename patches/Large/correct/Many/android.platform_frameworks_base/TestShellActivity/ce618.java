diff --git a/tests/DumpRenderTree/src/com/android/dumprendertree/TestShellActivity.java b/tests/DumpRenderTree/src/com/android/dumprendertree/TestShellActivity.java
index 69d3695..7e80370 100644
--- a/tests/DumpRenderTree/src/com/android/dumprendertree/TestShellActivity.java
+++ b/tests/DumpRenderTree/src/com/android/dumprendertree/TestShellActivity.java
@@ -630,7 +630,7 @@
         settings.setDatabaseEnabled(true);
         settings.setDatabasePath(getDir("databases",0).getAbsolutePath());
         settings.setDomStorageEnabled(true);
-        settings.setWorkersEnabled(true);
+        settings.setWorkersEnabled(false);
 
         webview.addJavascriptInterface(callbackProxy, "layoutTestController");
         webview.addJavascriptInterface(callbackProxy, "eventSender");
