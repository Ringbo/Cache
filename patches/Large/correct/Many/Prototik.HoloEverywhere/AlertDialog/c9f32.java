diff --git a/library/src/org/holoeverywhere/app/AlertDialog.java b/library/src/org/holoeverywhere/app/AlertDialog.java
index c2d918e..6523e2c 100644
--- a/library/src/org/holoeverywhere/app/AlertDialog.java
+++ b/library/src/org/holoeverywhere/app/AlertDialog.java
@@ -97,7 +97,7 @@
 
         public Builder setBlockDismiss(boolean blockDismiss) {
             int buttonBehavior = 0;
-            if (blockDismiss) {
+            if (!blockDismiss) {
                 buttonBehavior |= AlertDialog.DISMISS_ON_POSITIVE;
                 buttonBehavior |= AlertDialog.DISMISS_ON_NEGATIVE;
                 buttonBehavior |= AlertDialog.DISMISS_ON_NEUTRAL;
