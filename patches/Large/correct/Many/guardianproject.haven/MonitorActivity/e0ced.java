diff --git a/src/main/java/org/havenapp/main/MonitorActivity.java b/src/main/java/org/havenapp/main/MonitorActivity.java
index 3884979..529feaa 100644
--- a/src/main/java/org/havenapp/main/MonitorActivity.java
+++ b/src/main/java/org/havenapp/main/MonitorActivity.java
@@ -351,7 +351,7 @@
 
         TimePickerDialog mTimePickerDialog = TimePickerDialog.newInstance(this, hours, minutes, seconds, true);
         mTimePickerDialog.enableSeconds(true);
-        mTimePickerDialog.show(getFragmentManager(), "TimePickerDialog");
+        mTimePickerDialog.show(getSupportFragmentManager(), "TimePickerDialog");
     }
 
     @Override
