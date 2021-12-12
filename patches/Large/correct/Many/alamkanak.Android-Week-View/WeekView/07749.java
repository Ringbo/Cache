diff --git a/library/src/main/java/com/alamkanak/weekview/WeekView.java b/library/src/main/java/com/alamkanak/weekview/WeekView.java
index 2b3686e..6bf8523 100644
--- a/library/src/main/java/com/alamkanak/weekview/WeekView.java
+++ b/library/src/main/java/com/alamkanak/weekview/WeekView.java
@@ -214,7 +214,7 @@
             mEventTextColor = a.getColor(R.styleable.WeekView_eventTextColor, mEventTextColor);
             mEventPadding = a.getDimensionPixelSize(R.styleable.WeekView_hourSeparatorHeight, mEventPadding);
             mHeaderColumnBackgroundColor = a.getColor(R.styleable.WeekView_headerColumnBackground, mHeaderColumnBackgroundColor);
-            mDayNameLength = a.getColor(R.styleable.WeekView_dayNameLength, mDayNameLength);
+            mDayNameLength = a.getInteger(R.styleable.WeekView_dayNameLength, mDayNameLength);
         } finally {
             a.recycle();
         }
