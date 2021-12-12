diff --git a/core/java/android/view/RenderNodeAnimator.java b/core/java/android/view/RenderNodeAnimator.java
index debf45d..b95f9a4 100644
--- a/core/java/android/view/RenderNodeAnimator.java
+++ b/core/java/android/view/RenderNodeAnimator.java
@@ -219,7 +219,7 @@
 
     @Override
     public void cancel() {
-        if (mState != STATE_FINISHED) {
+        if (mState != STATE_PREPARE && mState != STATE_FINISHED) {
             if (mState == STATE_DELAYED) {
                 getHelper().removeDelayedAnimation(this);
                 notifyStartListeners();
