diff --git a/library/src/main/java/cn/bingoogolapple/badgeview/BGABadgeViewHelper.java b/library/src/main/java/cn/bingoogolapple/badgeview/BGABadgeViewHelper.java
index 6d3dc66..aa256b8 100644
--- a/library/src/main/java/cn/bingoogolapple/badgeview/BGABadgeViewHelper.java
+++ b/library/src/main/java/cn/bingoogolapple/badgeview/BGABadgeViewHelper.java
@@ -280,8 +280,8 @@
         // 计算徽章背景的宽高
         int badgeHeight = mBadgeNumberRect.height() + mBadgePadding * 2;
         int badgeWidth;
-        // 当mBadgeText的长度为1时，计算出来的高度会比宽度大，此时设置宽度等于高度
-        if (badgeText.length() == 1) {
+        // 当mBadgeText的长度为1或0时，计算出来的高度会比宽度大，此时设置宽度等于高度
+        if (badgeText.length() == 1 || badgeText.length() == 0) {
             badgeWidth = badgeHeight;
         } else {
             badgeWidth = mBadgeNumberRect.width() + mBadgePadding * 2;
