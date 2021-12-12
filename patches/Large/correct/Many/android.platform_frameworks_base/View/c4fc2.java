diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 11b0b14..639441b 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -2283,7 +2283,7 @@
             scrollabilityCache.scrollBar = new ScrollBarDrawable();
         }
         
-        final boolean fadeScrollbars = a.getBoolean(R.styleable.View_fadeScrollbars, false);
+        final boolean fadeScrollbars = a.getBoolean(R.styleable.View_fadeScrollbars, true);
 
         if (!fadeScrollbars) {
             scrollabilityCache.state = ScrollabilityCache.ON;
