diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 449091a..aa91120 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -4750,7 +4750,7 @@
     }
 
     void performCollectViewAttributes(int visibility) {
-        if ((visibility & VISIBILITY_MASK) == VISIBLE) {
+        if ((visibility & VISIBILITY_MASK) == VISIBLE && mAttachInfo != null) {
             if ((mViewFlags & KEEP_SCREEN_ON) == KEEP_SCREEN_ON) {
                 mAttachInfo.mKeepScreenOn = true;
             }
