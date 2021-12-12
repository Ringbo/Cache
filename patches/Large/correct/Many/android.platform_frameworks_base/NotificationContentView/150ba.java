diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
index 5477468..5eaf191 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
@@ -178,7 +178,7 @@
         int heightMode = MeasureSpec.getMode(heightMeasureSpec);
         boolean hasFixedHeight = heightMode == MeasureSpec.EXACTLY;
         boolean isHeightLimited = heightMode == MeasureSpec.AT_MOST;
-        int maxSize = Integer.MAX_VALUE;
+        int maxSize = Integer.MAX_VALUE / 2;
         int width = MeasureSpec.getSize(widthMeasureSpec);
         if (hasFixedHeight || isHeightLimited) {
             maxSize = MeasureSpec.getSize(heightMeasureSpec);
@@ -189,17 +189,15 @@
             if (mExpandedSmartReplyView != null) {
                 notificationMaxHeight += mExpandedSmartReplyView.getHeightUpperLimit();
             }
-            int size = Math.min(maxSize, notificationMaxHeight);
+            int size = notificationMaxHeight;
             ViewGroup.LayoutParams layoutParams = mExpandedChild.getLayoutParams();
             boolean useExactly = false;
             if (layoutParams.height >= 0) {
                 // An actual height is set
-                size = Math.min(maxSize, layoutParams.height);
+                size = Math.min(size, layoutParams.height);
                 useExactly = true;
             }
-            int spec = size == Integer.MAX_VALUE
-                    ? MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED)
-                    : MeasureSpec.makeMeasureSpec(size, useExactly
+            int spec = MeasureSpec.makeMeasureSpec(size, useExactly
                             ? MeasureSpec.EXACTLY
                             : MeasureSpec.AT_MOST);
             measureChildWithMargins(mExpandedChild, widthMeasureSpec, 0, spec, 0);
@@ -207,7 +205,7 @@
         }
         if (mContractedChild != null) {
             int heightSpec;
-            int size = Math.min(maxSize, mSmallHeight);
+            int size = mSmallHeight;
             ViewGroup.LayoutParams layoutParams = mContractedChild.getLayoutParams();
             boolean useExactly = false;
             if (layoutParams.height >= 0) {
@@ -241,7 +239,7 @@
         if (mHeadsUpChild != null) {
             int maxHeight = mHeadsUpHeight;
             maxHeight += mHeadsUpWrapper.getExtraMeasureHeight();
-            int size = Math.min(maxSize, maxHeight);
+            int size = maxHeight;
             ViewGroup.LayoutParams layoutParams = mHeadsUpChild.getLayoutParams();
             boolean useExactly = false;
             if (layoutParams.height >= 0) {
@@ -263,11 +261,11 @@
                         MeasureSpec.EXACTLY);
             }
             mSingleLineView.measure(singleLineWidthSpec,
-                    MeasureSpec.makeMeasureSpec(maxSize, MeasureSpec.AT_MOST));
+                    MeasureSpec.makeMeasureSpec(mNotificationMaxHeight, MeasureSpec.AT_MOST));
             maxChildHeight = Math.max(maxChildHeight, mSingleLineView.getMeasuredHeight());
         }
         if (mAmbientChild != null) {
-            int size = Math.min(maxSize, mNotificationAmbientHeight);
+            int size = mNotificationAmbientHeight;
             ViewGroup.LayoutParams layoutParams = mAmbientChild.getLayoutParams();
             boolean useExactly = false;
             if (layoutParams.height >= 0) {
@@ -281,7 +279,7 @@
             maxChildHeight = Math.max(maxChildHeight, mAmbientChild.getMeasuredHeight());
         }
         if (mAmbientSingleLineChild != null) {
-            int size = Math.min(maxSize, mNotificationAmbientHeight);
+            int size = mNotificationAmbientHeight;
             ViewGroup.LayoutParams layoutParams = mAmbientSingleLineChild.getLayoutParams();
             boolean useExactly = false;
             if (layoutParams.height >= 0) {
