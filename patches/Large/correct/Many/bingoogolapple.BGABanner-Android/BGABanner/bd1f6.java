diff --git a/library/src/main/java/cn/bingoogolapple/bgabanner/BGABanner.java b/library/src/main/java/cn/bingoogolapple/bgabanner/BGABanner.java
index 5e2d553..2118e1b 100644
--- a/library/src/main/java/cn/bingoogolapple/bgabanner/BGABanner.java
+++ b/library/src/main/java/cn/bingoogolapple/bgabanner/BGABanner.java
@@ -692,7 +692,7 @@
                     !mIsNeedShowIndicatorOnOnlyOnePage && mViews.size() > 1)))) {
                 mPointRealContainerLl.setVisibility(View.VISIBLE);
                 for (int i = 0; i < mPointRealContainerLl.getChildCount(); i++) {
-                    mPointRealContainerLl.getChildAt(i).setEnabled(i == newCurrentPoint);
+                    mPointRealContainerLl.getChildAt(i).setSelected(i == newCurrentPoint);
                     // 处理指示器选中和未选中状态图片尺寸不相等
                     mPointRealContainerLl.getChildAt(i).requestLayout();
                 }
