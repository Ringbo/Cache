diff --git a/activemq-client/src/test/java/org/apache/activemq/broker/scheduler/CronParserTest.java b/activemq-client/src/test/java/org/apache/activemq/broker/scheduler/CronParserTest.java
index 2733602..af9f1aa 100644
--- a/activemq-client/src/test/java/org/apache/activemq/broker/scheduler/CronParserTest.java
+++ b/activemq-client/src/test/java/org/apache/activemq/broker/scheduler/CronParserTest.java
@@ -270,8 +270,8 @@
         calender.setTimeInMillis(next);
         LOG.debug("next:" + calender.getTime());
         long result = next - current;
-        if (startHours == 8 && startMinutes == 50) {
-            assertEquals(60*40*1000,result);
+        if (startHours == 20 && startMinutes == 50) {
+            assertEquals(60*40*1000,result); // allow for 30 min offset timezone
         } else {
             assertEquals(60*10*1000,result);
         }
