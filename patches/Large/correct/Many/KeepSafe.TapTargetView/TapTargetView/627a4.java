diff --git a/taptargetview/src/main/java/com/getkeepsafe/taptargetview/TapTargetView.java b/taptargetview/src/main/java/com/getkeepsafe/taptargetview/TapTargetView.java
index 10a94ba..9856842 100755
--- a/taptargetview/src/main/java/com/getkeepsafe/taptargetview/TapTargetView.java
+++ b/taptargetview/src/main/java/com/getkeepsafe/taptargetview/TapTargetView.java
@@ -527,7 +527,7 @@
 
     @Override
     protected void onDraw(Canvas c) {
-        if (isDismissed) return;
+        if (isDismissed || outerCircleCenter == null) return;
 
         if (dimColor != -1) {
             c.drawColor(dimColor);
