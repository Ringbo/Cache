diff --git a/packages/SystemUI/src/com/android/systemui/volume/ZenModePanel.java b/packages/SystemUI/src/com/android/systemui/volume/ZenModePanel.java
index 1156d03..01d2ca0 100644
--- a/packages/SystemUI/src/com/android/systemui/volume/ZenModePanel.java
+++ b/packages/SystemUI/src/com/android/systemui/volume/ZenModePanel.java
@@ -509,7 +509,7 @@
         GregorianCalendar weekRange = new GregorianCalendar();
         final long now = weekRange.getTimeInMillis();
         setToMidnight(weekRange);
-        weekRange.roll(Calendar.DATE, 6);
+        weekRange.add(Calendar.DATE, 6);
         final long nextAlarmMs = mController.getNextAlarm();
         if (nextAlarmMs > 0) {
             GregorianCalendar nextAlarm = new GregorianCalendar();
