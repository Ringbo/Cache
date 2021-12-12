diff --git a/library/src/main/java/com/prolificinteractive/materialcalendarview/MaterialCalendarView.java b/library/src/main/java/com/prolificinteractive/materialcalendarview/MaterialCalendarView.java
index 90bea33..2fbe65c 100644
--- a/library/src/main/java/com/prolificinteractive/materialcalendarview/MaterialCalendarView.java
+++ b/library/src/main/java/com/prolificinteractive/materialcalendarview/MaterialCalendarView.java
@@ -1574,15 +1574,15 @@
             } else {
                 measureTileHeight = desiredTileHeight;
             }
-        } else if (specWidthMode == MeasureSpec.EXACTLY) {
+        } else if (specWidthMode == MeasureSpec.EXACTLY || specWidthMode == MeasureSpec.AT_MOST) {
             if (specHeightMode == MeasureSpec.EXACTLY) {
-                //Pick the larger of the two explicit sizes
-                measureTileSize = Math.max(desiredTileWidth, desiredTileHeight);
+                //Pick the smaller of the two explicit sizes
+                measureTileSize = Math.min(desiredTileWidth, desiredTileHeight);
             } else {
                 //Be the width size the user wants
                 measureTileSize = desiredTileWidth;
             }
-        } else if (specHeightMode == MeasureSpec.EXACTLY) {
+        } else if (specHeightMode == MeasureSpec.EXACTLY || specHeightMode == MeasureSpec.AT_MOST) {
             //Be the height size the user wants
             measureTileSize = desiredTileHeight;
         }
