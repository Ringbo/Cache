diff --git a/lib/java/android/support/design/widget/TabLayout.java b/lib/java/android/support/design/widget/TabLayout.java
index f9698b4..f659e9b 100644
--- a/lib/java/android/support/design/widget/TabLayout.java
+++ b/lib/java/android/support/design/widget/TabLayout.java
@@ -392,7 +392,7 @@
             attrs, R.styleable.TabLayout, defStyleAttr, R.style.Widget_Design_TabLayout);
 
     slidingTabIndicator.setSelectedIndicatorHeight(
-        a.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, 0));
+        a.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
     slidingTabIndicator.setSelectedIndicatorColor(
         a.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
     setSelectedTabIndicator(
@@ -2440,7 +2440,7 @@
       if (tabSelectedIndicator != null) {
         indicatorHeight = tabSelectedIndicator.getIntrinsicHeight();
       }
-      if (selectedIndicatorHeight != 0) {
+      if (selectedIndicatorHeight >= 0) {
         indicatorHeight = selectedIndicatorHeight;
       }
 
