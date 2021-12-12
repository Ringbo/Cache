diff --git a/src/main/java/reactor/core/support/QueueSupplier.java b/src/main/java/reactor/core/support/QueueSupplier.java
index 37bbce9..89d52e4 100644
--- a/src/main/java/reactor/core/support/QueueSupplier.java
+++ b/src/main/java/reactor/core/support/QueueSupplier.java
@@ -64,6 +64,6 @@
 		else if(batchSize == 1){
 			return new ArrayBlockingQueue<>(1);
 		}
-		return RingBuffer.newWriteQueue(RingBuffer.<T>createSingleProducer((int) batchSize));
+		return RingBuffer.newSequencedQueue(RingBuffer.<T>createSingleProducer((int) batchSize));
 	}
 }
