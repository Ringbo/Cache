diff --git a/core/java/android/animation/IntKeyframeSet.java b/core/java/android/animation/IntKeyframeSet.java
index 5629c5e..7b7c876 100644
--- a/core/java/android/animation/IntKeyframeSet.java
+++ b/core/java/android/animation/IntKeyframeSet.java
@@ -87,7 +87,7 @@
             }
             float intervalFraction = (fraction - prevFraction) / (nextFraction - prevFraction);
             return mEvaluator == null ?
-                    prevValue + (int)(fraction * (nextValue - prevValue)) :
+                    prevValue + (int)(intervalFraction * (nextValue - prevValue)) :
                     ((Number)mEvaluator.evaluate(intervalFraction, prevValue, nextValue)).
                             intValue();
         } else if (fraction >= 1f) {
@@ -103,7 +103,7 @@
             }
             float intervalFraction = (fraction - prevFraction) / (nextFraction - prevFraction);
             return mEvaluator == null ?
-                    prevValue + (int)(fraction * (nextValue - prevValue)) :
+                    prevValue + (int)(intervalFraction * (nextValue - prevValue)) :
                     ((Number)mEvaluator.evaluate(intervalFraction, prevValue, nextValue)).intValue();
         }
         IntKeyframe prevKeyframe = (IntKeyframe) mKeyframes.get(0);
@@ -119,7 +119,7 @@
                 int prevValue = prevKeyframe.getIntValue();
                 int nextValue = nextKeyframe.getIntValue();
                 return mEvaluator == null ?
-                        prevValue + (int)(fraction * (nextValue - prevValue)) :
+                        prevValue + (int)(intervalFraction * (nextValue - prevValue)) :
                         ((Number)mEvaluator.evaluate(intervalFraction, prevValue, nextValue)).
                                 intValue();
             }
