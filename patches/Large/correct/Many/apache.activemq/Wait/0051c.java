diff --git a/activemq-core/src/test/java/org/apache/activemq/util/Wait.java b/activemq-core/src/test/java/org/apache/activemq/util/Wait.java
index 12b7ede..ee3115e 100644
--- a/activemq-core/src/test/java/org/apache/activemq/util/Wait.java
+++ b/activemq-core/src/test/java/org/apache/activemq/util/Wait.java
@@ -34,7 +34,7 @@
     }
 
     public static boolean waitFor(final Condition condition, final long duration) throws Exception {
-        return waitFor(condition, MAX_WAIT_MILLIS, SLEEP_MILLIS);
+        return waitFor(condition, duration, SLEEP_MILLIS);
     }
 
     public static boolean waitFor(final Condition condition, final long duration, final int sleepMillis) throws Exception {
