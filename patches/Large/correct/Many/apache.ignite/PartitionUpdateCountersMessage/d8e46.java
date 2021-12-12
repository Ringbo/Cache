diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/PartitionUpdateCountersMessage.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/PartitionUpdateCountersMessage.java
index 6ee0294..3e5953f 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/PartitionUpdateCountersMessage.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/PartitionUpdateCountersMessage.java
@@ -228,7 +228,7 @@
 
     /** {@inheritDoc} */
     @Override public byte fieldsCount() {
-        return 1;
+        return 2;
     }
 
     /** {@inheritDoc} */
