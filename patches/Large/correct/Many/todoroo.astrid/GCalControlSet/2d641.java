diff --git a/astrid/plugin-src/com/todoroo/astrid/gcal/GCalControlSet.java b/astrid/plugin-src/com/todoroo/astrid/gcal/GCalControlSet.java
index eda00d0..2acc8cb 100644
--- a/astrid/plugin-src/com/todoroo/astrid/gcal/GCalControlSet.java
+++ b/astrid/plugin-src/com/todoroo/astrid/gcal/GCalControlSet.java
@@ -227,10 +227,10 @@
                 calendar.setText(R.string.gcal_TEA_none_selected);
             }
         } else {
-            int index = calendars.defaultIndex + 1;
+            int index = calendars.defaultIndex;
             if (!TextUtils.isEmpty(model.getValue(Task.CALENDAR_URI))) {
                 calendar.setText(R.string.gcal_TEA_has_event);
-            } else if (index != 0 && index < calendars.calendars.length) {
+            } else if (index >= 0 && index < calendars.calendars.length) {
                 calendar.setText(calendars.calendars[index]);
             } else {
                 calendar.setText(R.string.gcal_TEA_none_selected);
