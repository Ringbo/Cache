diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index fc250f2..163f855 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -23859,7 +23859,7 @@
      * on the screen.
      */
     private boolean shouldDrawRoundScrollbar() {
-        if (!mResources.getConfiguration().isScreenRound()) {
+        if (!mResources.getConfiguration().isScreenRound() || mAttachInfo == null) {
             return false;
         }
 
