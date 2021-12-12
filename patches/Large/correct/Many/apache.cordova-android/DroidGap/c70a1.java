diff --git a/framework/src/com/phonegap/DroidGap.java b/framework/src/com/phonegap/DroidGap.java
index 13175e7..218c473 100755
--- a/framework/src/com/phonegap/DroidGap.java
+++ b/framework/src/com/phonegap/DroidGap.java
@@ -1592,7 +1592,7 @@
              // Load URL on UI thread
              me.runOnUiThread(new Runnable() {
                  public void run() {
-                     me.showWebPage(errorUrl, true, true, null); 
+                     me.showWebPage(errorUrl, false, true, null); 
                  }
              });
          }
