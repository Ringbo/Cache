diff --git a/core/java/android/view/animation/AnimationSet.java b/core/java/android/view/animation/AnimationSet.java
index 2cf8ea8..def4d70 100644
--- a/core/java/android/view/animation/AnimationSet.java
+++ b/core/java/android/view/animation/AnimationSet.java
@@ -224,7 +224,9 @@
         }
 
         boolean changeBounds = (mFlags & PROPERTY_CHANGE_BOUNDS_MASK) == 0;
-        if (changeBounds && a.willChangeTransformationMatrix()) {
+
+
+        if (changeBounds && a.willChangeBounds()) {
             mFlags |= PROPERTY_CHANGE_BOUNDS_MASK;
         }
 
