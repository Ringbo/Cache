diff --git a/activemq-broker/src/main/java/org/apache/activemq/broker/BrokerService.java b/activemq-broker/src/main/java/org/apache/activemq/broker/BrokerService.java
index 6f28314..b250d32 100644
--- a/activemq-broker/src/main/java/org/apache/activemq/broker/BrokerService.java
+++ b/activemq-broker/src/main/java/org/apache/activemq/broker/BrokerService.java
@@ -1979,7 +1979,7 @@
 
         if (memLimit > jvmLimit) {
             usage.getMemoryUsage().setPercentOfJvmHeap(70);
-            LOG.error("Memory Usage for the Broker (" + memLimit / (1024 * 1024) +
+            LOG.warn("Memory Usage for the Broker (" + memLimit / (1024 * 1024) +
                     " mb) is more than the maximum available for the JVM: " +
                     jvmLimit / (1024 * 1024) + " mb - resetting to 70% of maximum available: " + (usage.getMemoryUsage().getLimit() / (1024 * 1024)) + " mb");
         }
@@ -2041,7 +2041,7 @@
             }
             long dirFreeSpace = tmpDir.getUsableSpace();
             if (storeLimit > dirFreeSpace) {
-                LOG.error("Temporary Store limit is " + storeLimit / (1024 * 1024) +
+                LOG.warn("Temporary Store limit is " + storeLimit / (1024 * 1024) +
                         " mb, whilst the temporary data directory: " + tmpDirPath +
                         " only has " + dirFreeSpace / (1024 * 1024) + " mb of usable space - resetting to maximum available " +
                         dirFreeSpace / (1024 * 1024) + " mb.");
