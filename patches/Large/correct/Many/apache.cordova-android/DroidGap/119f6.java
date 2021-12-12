diff --git a/framework/src/com/phonegap/DroidGap.java b/framework/src/com/phonegap/DroidGap.java
index 97c62b3..13175e7 100755
--- a/framework/src/com/phonegap/DroidGap.java
+++ b/framework/src/com/phonegap/DroidGap.java
@@ -280,7 +280,7 @@
         this.appView.setWebChromeClient(new GapClient(DroidGap.this));
         this.setWebViewClient(this.appView, new GapViewClient(this));
 
-        this.appView.setInitialScale(100);
+        this.appView.setInitialScale(0);
         this.appView.setVerticalScrollBarEnabled(false);
         this.appView.requestFocusFromTouch();
 
