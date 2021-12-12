diff --git a/flink-core/src/main/java/org/apache/flink/core/memory/MemorySegment.java b/flink-core/src/main/java/org/apache/flink/core/memory/MemorySegment.java
index af3efe7..d8315c5 100644
--- a/flink-core/src/main/java/org/apache/flink/core/memory/MemorySegment.java
+++ b/flink-core/src/main/java/org/apache/flink/core/memory/MemorySegment.java
@@ -161,7 +161,7 @@
 		}
 		if (offHeapAddress >= Long.MAX_VALUE - Integer.MAX_VALUE) {
 			// this is necessary to make sure the collapsed checks are safe against numeric overflows
-			throw new IllegalArgumentException("Segment initialized with too large address: " + address
+			throw new IllegalArgumentException("Segment initialized with too large address: " + offHeapAddress
 					+ " ; Max allowed address is " + (Long.MAX_VALUE - Integer.MAX_VALUE - 1));
 		}
 		
