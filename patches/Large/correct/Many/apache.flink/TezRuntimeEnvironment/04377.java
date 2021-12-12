diff --git a/flink-staging/flink-tez/src/main/java/org/apache/flink/tez/runtime/TezRuntimeEnvironment.java b/flink-staging/flink-tez/src/main/java/org/apache/flink/tez/runtime/TezRuntimeEnvironment.java
index 39386e6..4cf855a 100644
--- a/flink-staging/flink-tez/src/main/java/org/apache/flink/tez/runtime/TezRuntimeEnvironment.java
+++ b/flink-staging/flink-tez/src/main/java/org/apache/flink/tez/runtime/TezRuntimeEnvironment.java
@@ -36,7 +36,7 @@
 	public TezRuntimeEnvironment(long totalMemory) {
 		int pageSize = DEFAULT_PAGE_SIZE;
 		int numSlots = DEFAULT_NUM_SLOTS;
-		this.memoryManager = new DefaultMemoryManager(totalMemory, numSlots, pageSize);
+		this.memoryManager = new DefaultMemoryManager(totalMemory, numSlots, pageSize, true);
 		this.ioManager = new IOManagerAsync();
 	}
 
