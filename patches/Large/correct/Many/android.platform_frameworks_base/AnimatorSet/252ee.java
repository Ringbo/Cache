diff --git a/core/java/android/animation/AnimatorSet.java b/core/java/android/animation/AnimatorSet.java
index 00d6657..1a2dc5c 100644
--- a/core/java/android/animation/AnimatorSet.java
+++ b/core/java/android/animation/AnimatorSet.java
@@ -843,7 +843,7 @@
         // Assumes forward playing from here on.
         for (int i = 0; i < mEvents.size(); i++) {
             AnimationEvent event = mEvents.get(i);
-            if (event.getTime() > currentPlayTime) {
+            if (event.getTime() > currentPlayTime || event.getTime() == DURATION_INFINITE) {
                 break;
             }
 
@@ -1264,7 +1264,8 @@
         } else {
             for (int i = mLastEventId + 1; i < size; i++) {
                 AnimationEvent event = mEvents.get(i);
-                if (event.getTime() <= currentPlayTime) {
+                // TODO: need a function that accounts for infinite duration to compare time
+                if (event.getTime() != DURATION_INFINITE && event.getTime() <= currentPlayTime) {
                     latestId = i;
                 }
             }
