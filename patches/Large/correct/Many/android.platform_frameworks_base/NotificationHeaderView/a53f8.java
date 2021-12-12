diff --git a/core/java/android/view/NotificationHeaderView.java b/core/java/android/view/NotificationHeaderView.java
index d4ccdbf..93e11af 100644
--- a/core/java/android/view/NotificationHeaderView.java
+++ b/core/java/android/view/NotificationHeaderView.java
@@ -100,7 +100,7 @@
             int overFlow = totalWidth - givenWidth;
             // We are overflowing, lets shrink
             final int appWidth = mAppName.getMeasuredWidth();
-            if (appWidth > mHeaderMinWidth) {
+            if (mAppName.getVisibility() != GONE && appWidth > mHeaderMinWidth) {
                 int newSize = appWidth - Math.min(appWidth - mHeaderMinWidth, overFlow);
                 int childWidthSpec = MeasureSpec.makeMeasureSpec(newSize, MeasureSpec.AT_MOST);
                 mAppName.measure(childWidthSpec, wrapContentHeightSpec);
