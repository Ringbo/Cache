diff --git a/src/java/org/jivesoftware/openfire/handler/IQEntityTimeHandler.java b/src/java/org/jivesoftware/openfire/handler/IQEntityTimeHandler.java
index a324cae..04afb04 100644
--- a/src/java/org/jivesoftware/openfire/handler/IQEntityTimeHandler.java
+++ b/src/java/org/jivesoftware/openfire/handler/IQEntityTimeHandler.java
@@ -71,7 +71,7 @@
      */
     String formatsTimeZone(TimeZone tz) {
         // package-private for test.
-        int seconds = Math.abs(tz.getRawOffset()) / 1000;
+        int seconds = Math.abs(tz.getOffset(System.currentTimeMillis())) / 1000;
         int hours = seconds / 3600;
         int minutes = (seconds % 3600) / 60;
         return (tz.getRawOffset() < 0 ? "-" : "+") + String.format("%02d:%02d", hours, minutes);
