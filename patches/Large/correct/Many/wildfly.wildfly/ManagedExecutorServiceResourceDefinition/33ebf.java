diff --git a/ee/src/main/java/org/jboss/as/ee/subsystem/ManagedExecutorServiceResourceDefinition.java b/ee/src/main/java/org/jboss/as/ee/subsystem/ManagedExecutorServiceResourceDefinition.java
index 5dbca04..6416034 100644
--- a/ee/src/main/java/org/jboss/as/ee/subsystem/ManagedExecutorServiceResourceDefinition.java
+++ b/ee/src/main/java/org/jboss/as/ee/subsystem/ManagedExecutorServiceResourceDefinition.java
@@ -208,7 +208,7 @@
             // Validate an unbounded queue
             if (!queueLength.isDefined() || queueLength.asInt() == Integer.MAX_VALUE) {
                 if (coreThreads.isDefined() && coreThreads.asInt() <= 0) {
-                    throw EeLogger.ROOT_LOGGER.invalidCoreThreadsSize(coreThreads.asString());
+                    throw EeLogger.ROOT_LOGGER.invalidCoreThreadsSize(queueLength.asString());
                 }
 
             }
@@ -216,7 +216,7 @@
             // Validate a hand-off queue
             if (queueLength.isDefined() && queueLength.asInt() == 0) {
                 if (coreThreads.isDefined() && coreThreads.asInt() <= 0) {
-                    throw EeLogger.ROOT_LOGGER.invalidCoreThreadsSize(coreThreads.asString());
+                    throw EeLogger.ROOT_LOGGER.invalidCoreThreadsSize(queueLength.asString());
                 }
             }
 
