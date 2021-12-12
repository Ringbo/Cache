diff --git a/core/java/android/animation/AnimatorSet.java b/core/java/android/animation/AnimatorSet.java
index 5480193..6db5b9b 100644
--- a/core/java/android/animation/AnimatorSet.java
+++ b/core/java/android/animation/AnimatorSet.java
@@ -702,7 +702,7 @@
     }
 
 
-    private class AnimatorSetListener implements AnimatorListener {
+    private static class AnimatorSetListener implements AnimatorListener {
 
         private AnimatorSet mAnimatorSet;
 
@@ -712,7 +712,7 @@
 
         public void onAnimationCancel(Animator animation) {
 
-            if (!mTerminated) {
+            if (!mAnimatorSet.mTerminated) {
                 // Listeners are already notified of the AnimatorSet canceling in cancel().
                 // The logic below only kicks in when animations end normally
                 if (mAnimatorSet.mPlayingSet.size() == 0) {
@@ -734,7 +734,7 @@
             Node animNode = mAnimatorSet.mNodeMap.get(animation);
             animNode.mEnded = true;
 
-            if (!mTerminated) {
+            if (!mAnimatorSet.mTerminated) {
                 List<Node> children = animNode.mChildNodes;
                 // Start children animations, if any.
                 int childrenSize = children == null ? 0 : children.size();
@@ -747,9 +747,9 @@
                 // end(); the logic below only kicks in when animations end normally
                 boolean allDone = true;
                 // Traverse the tree and find if there's any unfinished node
-                int size = mNodes.size();
+                int size = mAnimatorSet.mNodes.size();
                 for (int i = 0; i < size; i++) {
-                    if (!mNodes.get(i).mEnded) {
+                    if (!mAnimatorSet.mNodes.get(i).mEnded) {
                         allDone = false;
                         break;
                     }
@@ -757,9 +757,9 @@
                 if (allDone) {
                     // If this was the last child animation to end, then notify listeners that this
                     // AnimatorSet has ended
-                    if (mListeners != null) {
+                    if (mAnimatorSet.mListeners != null) {
                         ArrayList<AnimatorListener> tmpListeners =
-                                (ArrayList<AnimatorListener>) mListeners.clone();
+                                (ArrayList<AnimatorListener>) mAnimatorSet.mListeners.clone();
                         int numListeners = tmpListeners.size();
                         for (int i = 0; i < numListeners; ++i) {
                             tmpListeners.get(i).onAnimationEnd(mAnimatorSet);
