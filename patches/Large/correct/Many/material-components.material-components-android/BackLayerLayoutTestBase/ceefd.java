diff --git a/tests/javatests/android/support/design/backlayer/BackLayerLayoutTestBase.java b/tests/javatests/android/support/design/backlayer/BackLayerLayoutTestBase.java
index 95e89b1..1ae4370 100644
--- a/tests/javatests/android/support/design/backlayer/BackLayerLayoutTestBase.java
+++ b/tests/javatests/android/support/design/backlayer/BackLayerLayoutTestBase.java
@@ -328,7 +328,7 @@
     CoordinatorLayout.LayoutParams layoutParams =
         (CoordinatorLayout.LayoutParams) backLayer.getLayoutParams();
     int absoluteGravity =
-        Gravity.getAbsoluteGravity(layoutParams.gravity, backLayer.getLayoutDirection());
+        Gravity.getAbsoluteGravity(layoutParams.gravity, ViewCompat.getLayoutDirection(backLayer));
     isBackLayerAtEndSide = absoluteGravity == Gravity.RIGHT || absoluteGravity == Gravity.BOTTOM;
     isHorizontal = absoluteGravity == Gravity.RIGHT || absoluteGravity == Gravity.LEFT;
 
