diff --git a/bundles/binding/org.openhab.binding.ihc/src/main/java/org/openhab/binding/ihc/internal/IhcDataConverter.java b/bundles/binding/org.openhab.binding.ihc/src/main/java/org/openhab/binding/ihc/internal/IhcDataConverter.java
index c4163b7..f74705c 100644
--- a/bundles/binding/org.openhab.binding.ihc/src/main/java/org/openhab/binding/ihc/internal/IhcDataConverter.java
+++ b/bundles/binding/org.openhab.binding.ihc/src/main/java/org/openhab/binding/ihc/internal/IhcDataConverter.java
@@ -184,7 +184,7 @@
             short month = date.getMonth();
             short day = date.getDay();
 
-            cal.set(year, month, day, 0, 0, 0);
+            cal.set(year, month - 1, day, 0, 0, 0);
         }
 
         if (time != null) {
@@ -192,7 +192,7 @@
             int minute = time.getMinutes();
             int second = time.getSeconds();
 
-            cal.set(1900, 1, 1, hour, minute, second);
+            cal.set(1900, 0, 1, hour, minute, second);
         }
 
         return cal;
@@ -292,7 +292,7 @@
                 Calendar c = ((DateTimeType) type).getCalendar();
 
                 short year = (short) c.get(Calendar.YEAR);
-                byte month = (byte) c.get(Calendar.MONTH);
+                byte month = (byte) (c.get(Calendar.MONTH) + 1);
                 byte day = (byte) c.get(Calendar.DAY_OF_MONTH);
 
                 ((WSDateValue) value).setYear(year);
