diff --git a/core/java/android/transition/TransitionSet.java b/core/java/android/transition/TransitionSet.java
index c6005b9..363f97f 100644
--- a/core/java/android/transition/TransitionSet.java
+++ b/core/java/android/transition/TransitionSet.java
@@ -160,7 +160,7 @@
     @Override
     public TransitionSet setDuration(long duration) {
         super.setDuration(duration);
-        if (mDuration >= 0) {
+        if (mDuration >= 0 && mTransitions != null) {
             int numTransitions = mTransitions.size();
             for (int i = 0; i < numTransitions; ++i) {
                 mTransitions.get(i).setDuration(duration);
