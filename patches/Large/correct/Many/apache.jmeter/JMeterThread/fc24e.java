diff --git a/src/core/org/apache/jmeter/threads/JMeterThread.java b/src/core/org/apache/jmeter/threads/JMeterThread.java
index 9ec8dda..4b02529 100644
--- a/src/core/org/apache/jmeter/threads/JMeterThread.java
+++ b/src/core/org/apache/jmeter/threads/JMeterThread.java
@@ -253,10 +253,10 @@
                     // restart of the next loop 
                     // - was requested through threadContext
                     // - or the last sample failed AND the onErrorStartNextLoop option is enabled
-                    if (threadContext.isRestartNextLoop()
+                    if (threadContext.isStartNextThreadLoop()
                             || (onErrorStartNextLoop
                             && !TRUE.equals(threadContext.getVariables().get(LAST_SAMPLE_OK)))) {
-                        if (log.isDebugEnabled() && onErrorStartNextLoop && !threadContext.isRestartNextLoop()) {
+                        if (log.isDebugEnabled() && onErrorStartNextLoop && !threadContext.isStartNextThreadLoop()) {
                             log.debug("StartNextLoop option is on, Last sample failed, starting next loop");
                         }
 
