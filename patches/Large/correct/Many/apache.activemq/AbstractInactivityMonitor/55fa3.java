diff --git a/activemq-core/src/main/java/org/apache/activemq/transport/AbstractInactivityMonitor.java b/activemq-core/src/main/java/org/apache/activemq/transport/AbstractInactivityMonitor.java
index 9ccda1d..8f2058d 100644
--- a/activemq-core/src/main/java/org/apache/activemq/transport/AbstractInactivityMonitor.java
+++ b/activemq-core/src/main/java/org/apache/activemq/transport/AbstractInactivityMonitor.java
@@ -135,7 +135,7 @@
             return;
         }
 
-        if (!commandSent.get() && useKeepAlive) {
+        if (!commandSent.get() && useKeepAlive && monitorStarted.get() && !ASYNC_TASKS.isTerminating()) {
             if (LOG.isTraceEnabled()) {
                 LOG.trace(this + " no message sent since last write check, sending a KeepAliveInfo");
             }
@@ -178,7 +178,7 @@
             }
             return;
         }
-        if (!commandReceived.get()) {
+        if (!commandReceived.get() && monitorStarted.get() && !ASYNC_TASKS.isTerminating()) {
             if (LOG.isDebugEnabled()) {
                 LOG.debug("No message received since last read check for " + toString() + "! Throwing InactivityIOException.");
             }
