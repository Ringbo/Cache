diff --git a/samples/src/main/java/com/github/ksoichiro/android/observablescrollview/samples/FlexibleSpaceWithImageWithViewPagerTab2Activity.java b/samples/src/main/java/com/github/ksoichiro/android/observablescrollview/samples/FlexibleSpaceWithImageWithViewPagerTab2Activity.java
index aaac283..fdce7f4 100644
--- a/samples/src/main/java/com/github/ksoichiro/android/observablescrollview/samples/FlexibleSpaceWithImageWithViewPagerTab2Activity.java
+++ b/samples/src/main/java/com/github/ksoichiro/android/observablescrollview/samples/FlexibleSpaceWithImageWithViewPagerTab2Activity.java
@@ -232,7 +232,7 @@
             translationY = mScroller.getCurrY();
             Log.e("DEBUG", "updateLayout: currY: " + mScroller.getCurrY() + " velocity: " + mScroller.getCurrVelocity());
             int flexibleSpace = mFlexibleSpaceHeight - mTabHeight;
-            if (-flexibleSpace < translationY && translationY < 0) {
+            if (-flexibleSpace <= translationY && translationY <= 0) {
                 needsUpdate = true;
             } else if (translationY < -flexibleSpace) {
                 translationY = -flexibleSpace;
