diff --git a/library/src/main/java/org/lucasr/twowayview/TwoWayView.java b/library/src/main/java/org/lucasr/twowayview/TwoWayView.java
index 8e1e112..f06bbc2 100644
--- a/library/src/main/java/org/lucasr/twowayview/TwoWayView.java
+++ b/library/src/main/java/org/lucasr/twowayview/TwoWayView.java
@@ -4723,7 +4723,7 @@
                 recycleBin.addScrapView(child, -1);
             }
 
-            returnedWidth += child.getMeasuredHeight();
+            returnedWidth += child.getMeasuredWidth();
 
             if (returnedWidth >= maxWidth) {
                 // We went over, figure out which width to return.  If returnedWidth > maxWidth,
