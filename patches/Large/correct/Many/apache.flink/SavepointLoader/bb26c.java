diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointLoader.java b/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointLoader.java
index 1819120..66740c7 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointLoader.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/checkpoint/savepoint/SavepointLoader.java
@@ -74,12 +74,12 @@
 					String msg = String.format("Failed to rollback to savepoint %s. " +
 									"Max parallelism mismatch between savepoint state and new program. " +
 									"Cannot map operator %s with max parallelism %d to new program with " +
-									"parallelism %d. This indicates that the program has been changed " +
+									"max parallelism %d. This indicates that the program has been changed " +
 									"in a non-compatible way after the savepoint.",
 							savepoint,
 							taskState.getJobVertexID(),
 							taskState.getMaxParallelism(),
-							executionJobVertex.getParallelism());
+							executionJobVertex.getMaxParallelism());
 
 					throw new IllegalStateException(msg);
 				}
