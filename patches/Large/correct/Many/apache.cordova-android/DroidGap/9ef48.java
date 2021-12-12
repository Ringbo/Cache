diff --git a/framework/src/org/apache/cordova/DroidGap.java b/framework/src/org/apache/cordova/DroidGap.java
index a42f16c..68dbe08 100755
--- a/framework/src/org/apache/cordova/DroidGap.java
+++ b/framework/src/org/apache/cordova/DroidGap.java
@@ -1042,7 +1042,7 @@
     @Override
     public boolean onKeyUp(int keyCode, KeyEvent event)
     {
-        if (appView.backHistory() || keyCode != KeyEvent.KEYCODE_BACK)
+        if (appView.canGoBack() || keyCode != KeyEvent.KEYCODE_BACK)
             return appView.onKeyUp(keyCode, event);
         else 
             return super.onKeyUp(keyCode, event);
