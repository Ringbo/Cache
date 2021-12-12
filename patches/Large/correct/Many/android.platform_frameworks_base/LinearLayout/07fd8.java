diff --git a/core/java/android/widget/LinearLayout.java b/core/java/android/widget/LinearLayout.java
index fee7d9c..abf2756 100644
--- a/core/java/android/widget/LinearLayout.java
+++ b/core/java/android/widget/LinearLayout.java
@@ -669,7 +669,7 @@
             }
 
             LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) child.getLayoutParams();
-            lp.onResolveLayoutDirection(layoutDirection);
+            lp.resolveLayoutDirection(layoutDirection);
 
             totalWeight += lp.weight;
             
@@ -1014,7 +1014,7 @@
 
             final LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams)
                     child.getLayoutParams();
-            lp.onResolveLayoutDirection(layoutDirection);
+            lp.resolveLayoutDirection(layoutDirection);
 
             totalWeight += lp.weight;
             
