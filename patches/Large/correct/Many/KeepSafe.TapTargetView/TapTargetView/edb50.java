diff --git a/taptargetview/src/main/java/com/getkeepsafe/taptargetview/TapTargetView.java b/taptargetview/src/main/java/com/getkeepsafe/taptargetview/TapTargetView.java
index 9a05543..f18e92e 100755
--- a/taptargetview/src/main/java/com/getkeepsafe/taptargetview/TapTargetView.java
+++ b/taptargetview/src/main/java/com/getkeepsafe/taptargetview/TapTargetView.java
@@ -745,7 +745,7 @@
     isDismissing = true;
     pulseAnimation.cancel();
     expandAnimation.cancel();
-    if (!visible) {
+    if (!visible || outerCircleCenter == null) {
       finishDismiss(tappedTarget);
       return;
     }
