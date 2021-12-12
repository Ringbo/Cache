diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 932e0a5..a362804 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -4760,7 +4760,7 @@
     }
 
     void performCollectViewAttributes(int visibility) {
-        if ((visibility & VISIBILITY_MASK) == VISIBLE) {
+        if ((visibility & VISIBILITY_MASK) == VISIBLE && mAttachInfo != null) {
             if ((mViewFlags & KEEP_SCREEN_ON) == KEEP_SCREEN_ON) {
                 mAttachInfo.mKeepScreenOn = true;
             }
