diff --git a/uhabits-android/src/main/java/org/isoron/uhabits/utils/DatabaseUtils.java b/uhabits-android/src/main/java/org/isoron/uhabits/utils/DatabaseUtils.java
index e0bc5d4..8f99eb4 100644
--- a/uhabits-android/src/main/java/org/isoron/uhabits/utils/DatabaseUtils.java
+++ b/uhabits-android/src/main/java/org/isoron/uhabits/utils/DatabaseUtils.java
@@ -92,7 +92,7 @@
         throws IOException
     {
         SimpleDateFormat dateFormat = DateFormats.getBackupDateFormat();
-        String date = dateFormat.format(DateUtils.getStartOfToday());
+        String date = dateFormat.format(DateUtils.getLocalTime());
         String format = "%s/Loop Habits Backup %s.db";
         String filename = String.format(format, dir.getAbsolutePath(), date);
 
