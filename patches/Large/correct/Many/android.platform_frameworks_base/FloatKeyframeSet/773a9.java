diff --git a/core/java/android/animation/FloatKeyframeSet.java b/core/java/android/animation/FloatKeyframeSet.java
index 4009f13..377b5a0 100644
--- a/core/java/android/animation/FloatKeyframeSet.java
+++ b/core/java/android/animation/FloatKeyframeSet.java
@@ -87,7 +87,7 @@
             }
             float intervalFraction = (fraction - prevFraction) / (nextFraction - prevFraction);
             return mEvaluator == null ?
-                    prevValue + fraction * (nextValue - prevValue) :
+                    prevValue + intervalFraction * (nextValue - prevValue) :
                     ((Number)mEvaluator.evaluate(intervalFraction, prevValue, nextValue)).
                             floatValue();
         } else if (fraction >= 1f) {
@@ -103,7 +103,7 @@
             }
             float intervalFraction = (fraction - prevFraction) / (nextFraction - prevFraction);
             return mEvaluator == null ?
-                    prevValue + fraction * (nextValue - prevValue) :
+                    prevValue + intervalFraction * (nextValue - prevValue) :
                     ((Number)mEvaluator.evaluate(intervalFraction, prevValue, nextValue)).
                             floatValue();
         }
@@ -120,7 +120,7 @@
                 float prevValue = prevKeyframe.getFloatValue();
                 float nextValue = nextKeyframe.getFloatValue();
                 return mEvaluator == null ?
-                        prevValue + fraction * (nextValue - prevValue) :
+                        prevValue + intervalFraction * (nextValue - prevValue) :
                         ((Number)mEvaluator.evaluate(intervalFraction, prevValue, nextValue)).
                             floatValue();
             }
