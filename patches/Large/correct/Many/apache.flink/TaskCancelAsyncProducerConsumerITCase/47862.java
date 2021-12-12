diff --git a/flink-runtime/src/test/java/org/apache/flink/runtime/taskmanager/TaskCancelAsyncProducerConsumerITCase.java b/flink-runtime/src/test/java/org/apache/flink/runtime/taskmanager/TaskCancelAsyncProducerConsumerITCase.java
index 4ea6511..69f1a49 100644
--- a/flink-runtime/src/test/java/org/apache/flink/runtime/taskmanager/TaskCancelAsyncProducerConsumerITCase.java
+++ b/flink-runtime/src/test/java/org/apache/flink/runtime/taskmanager/TaskCancelAsyncProducerConsumerITCase.java
@@ -126,12 +126,12 @@
 					break;
 				} else {
 					// Retry
-					Thread.sleep(500);
+					Thread.sleep(500L);
 				}
 			}
 
 			// Verify that async producer is in blocking request
-			assertTrue("Producer thread is not blocked: " + Arrays.toString(ASYNC_CONSUMER_THREAD.getStackTrace()), producerBlocked);
+			assertTrue("Producer thread is not blocked: " + Arrays.toString(ASYNC_PRODUCER_THREAD.getStackTrace()), producerBlocked);
 
 			boolean consumerWaiting = false;
 			for (int i = 0; i < 50; i++) {
@@ -145,7 +145,7 @@
 					break;
 				} else {
 					// Retry
-					Thread.sleep(500);
+					Thread.sleep(500L);
 				}
 			}
 
