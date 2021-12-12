diff --git a/src/core/org/apache/jmeter/engine/StandardJMeterEngine.java b/src/core/org/apache/jmeter/engine/StandardJMeterEngine.java
index d4e6c6a..97a07a8 100644
--- a/src/core/org/apache/jmeter/engine/StandardJMeterEngine.java
+++ b/src/core/org/apache/jmeter/engine/StandardJMeterEngine.java
@@ -264,7 +264,7 @@
             engine = null;
             if (now) {
                 tellThreadGroupsToStop();
-                pause(10 * countStillActiveThreads());
+                pause(10L * countStillActiveThreads());
                 boolean stopped = verifyThreadsStopped();
                 if (!stopped) {  // we totally failed to stop the test
                     if (JMeter.isNonGUI()) {
