diff --git a/library/src/main/java/com/transitionseverywhere/Transition.java b/library/src/main/java/com/transitionseverywhere/Transition.java
index 233f1b9..30aed94 100644
--- a/library/src/main/java/com/transitionseverywhere/Transition.java
+++ b/library/src/main/java/com/transitionseverywhere/Transition.java
@@ -181,7 +181,7 @@
     private TransitionValuesMaps mStartValues = new TransitionValuesMaps();
     private TransitionValuesMaps mEndValues = new TransitionValuesMaps();
     TransitionSet mParent = null;
-    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
+    int[] mMatchOrder = DEFAULT_MATCH_ORDER;
     ArrayList<TransitionValues> mStartValuesList; // only valid after playTransition starts
     ArrayList<TransitionValues> mEndValuesList; // only valid after playTransitions starts
 
@@ -235,7 +235,7 @@
 
     // The function used to interpolate along two-dimensional points. Typically used
     // for adding curves to x/y View motion.
-    private PathMotion mPathMotion = PathMotion.STRAIGHT_PATH_MOTION;
+    PathMotion mPathMotion = PathMotion.STRAIGHT_PATH_MOTION;
 
     /**
      * Constructs a Transition object with no target objects. A transition with
@@ -777,7 +777,7 @@
                 }
             }
         }
-        if (minStartDelay != 0) {
+        if (startDelays.size() != 0) {
             for (int i = 0; i < startDelays.size(); i++) {
                 int index = startDelays.keyAt(i);
                 Animator animator = mAnimators.get(index);
