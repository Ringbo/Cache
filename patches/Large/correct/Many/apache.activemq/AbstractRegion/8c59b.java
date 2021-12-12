diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/AbstractRegion.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/AbstractRegion.java
index e681ca0..fb6f880 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/AbstractRegion.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/AbstractRegion.java
@@ -78,7 +78,7 @@
         this.destinationStatistics = destinationStatistics;
         this.usageManager = memoryManager;
         this.taskRunnerFactory = taskRunnerFactory;
-        if (broker == null) {
+        if (destinationFactory == null) {
             throw new IllegalArgumentException("null destinationFactory");
         }
         this.destinationFactory = destinationFactory;
