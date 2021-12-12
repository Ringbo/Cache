diff --git a/stetho/src/main/java/com/facebook/stetho/common/android/ViewUtil.java b/stetho/src/main/java/com/facebook/stetho/common/android/ViewUtil.java
index 5117c02..57dbbb2 100644
--- a/stetho/src/main/java/com/facebook/stetho/common/android/ViewUtil.java
+++ b/stetho/src/main/java/com/facebook/stetho/common/android/ViewUtil.java
@@ -83,7 +83,13 @@
         final View child = viewGroup.getChildAt(i);
 
         if (ViewUtil.isTransformedPointInView(viewGroup, child, x, y, localPoint)) {
-          View childResult = hitTest(child, localPoint.x, localPoint.y, viewSelector);
+          View childResult = hitTestImpl(
+              child,
+              localPoint.x,
+              localPoint.y,
+              viewSelector,
+              allowViewGroupResult);
+
           if (childResult != null) {
             return childResult;
           }
