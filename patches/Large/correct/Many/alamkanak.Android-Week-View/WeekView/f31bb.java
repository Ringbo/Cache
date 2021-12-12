diff --git a/library/src/main/java/com/alamkanak/weekview/WeekView.java b/library/src/main/java/com/alamkanak/weekview/WeekView.java
index ae9859b..ab65e61 100644
--- a/library/src/main/java/com/alamkanak/weekview/WeekView.java
+++ b/library/src/main/java/com/alamkanak/weekview/WeekView.java
@@ -465,11 +465,11 @@
 
                     // Calculate left and right.
                     float left = startFromPixel + mEventRects.get(i).left * mWidthPerDay;
-                    if (left != startFromPixel)
+                    if (left < startFromPixel)
                         left += mOverlappingEventGap;
                     float originalLeft = left;
                     float right = left + mEventRects.get(i).width * mWidthPerDay;
-                    if (right != startFromPixel + mWidthPerDay)
+                    if (right < startFromPixel + mWidthPerDay)
                         right -= mOverlappingEventGap;
                     if (left < mHeaderColumnWidth) left = mHeaderColumnWidth;
 
