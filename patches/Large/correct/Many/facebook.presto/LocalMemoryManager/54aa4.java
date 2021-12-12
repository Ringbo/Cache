diff --git a/presto-main/src/main/java/com/facebook/presto/memory/LocalMemoryManager.java b/presto-main/src/main/java/com/facebook/presto/memory/LocalMemoryManager.java
index 8a82a1d..0011eca 100644
--- a/presto-main/src/main/java/com/facebook/presto/memory/LocalMemoryManager.java
+++ b/presto-main/src/main/java/com/facebook/presto/memory/LocalMemoryManager.java
@@ -49,7 +49,7 @@
         maxMemory = new DataSize(maxHeap - systemMemoryConfig.getReservedSystemMemory().toBytes(), BYTE);
 
         ImmutableMap.Builder<MemoryPoolId, MemoryPool> builder = ImmutableMap.builder();
-        checkArgument(config.getMaxQueryMemoryPerNode().toBytes() < maxMemory.toBytes(), format("%s set to %s, but only %s of useable heap available", QUERY_MAX_MEMORY_PER_NODE_CONFIG, config.getMaxQueryMemoryPerNode(), maxMemory));
+        checkArgument(config.getMaxQueryMemoryPerNode().toBytes() <= maxMemory.toBytes(), format("%s set to %s, but only %s of useable heap available", QUERY_MAX_MEMORY_PER_NODE_CONFIG, config.getMaxQueryMemoryPerNode(), maxMemory));
         builder.put(RESERVED_POOL, new MemoryPool(RESERVED_POOL, config.getMaxQueryMemoryPerNode()));
         DataSize generalPoolSize = new DataSize(Math.max(0, maxMemory.toBytes() - config.getMaxQueryMemoryPerNode().toBytes()), BYTE);
         builder.put(GENERAL_POOL, new MemoryPool(GENERAL_POOL, generalPoolSize));
