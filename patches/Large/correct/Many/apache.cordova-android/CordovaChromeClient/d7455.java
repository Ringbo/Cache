diff --git a/framework/src/org/apache/cordova/CordovaChromeClient.java b/framework/src/org/apache/cordova/CordovaChromeClient.java
index 86b575b..cdfc9d1 100755
--- a/framework/src/org/apache/cordova/CordovaChromeClient.java
+++ b/framework/src/org/apache/cordova/CordovaChromeClient.java
@@ -101,7 +101,7 @@
         dlg.setOnCancelListener(
                 new DialogInterface.OnCancelListener() {
                     public void onCancel(DialogInterface dialog) {
-                        result.confirm();
+                        result.cancel();
                     }
                 });
         dlg.setOnKeyListener(new DialogInterface.OnKeyListener() {
