diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index b9864ba..2b71b4a 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -3304,7 +3304,7 @@
         boolean noneOfTheChildrenAreTransparent = true;
         for (int i = 0; i < count; i++) {
             final View child = children[i];
-            if ((child.mViewFlags & VISIBILITY_MASK) != GONE || child.getAnimation() != null) {
+            if ((child.mViewFlags & VISIBILITY_MASK) == VISIBLE || child.getAnimation() != null) {
                 if (!child.gatherTransparentRegion(region)) {
                     noneOfTheChildrenAreTransparent = false;
                 }
