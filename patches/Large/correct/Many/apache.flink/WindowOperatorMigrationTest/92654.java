diff --git a/flink-streaming-java/src/test/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperatorMigrationTest.java b/flink-streaming-java/src/test/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperatorMigrationTest.java
index 19fa04f..1168eb0 100644
--- a/flink-streaming-java/src/test/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperatorMigrationTest.java
+++ b/flink-streaming-java/src/test/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperatorMigrationTest.java
@@ -826,7 +826,7 @@
 					if (comparison != 0) {
 						return comparison;
 					}
-					return (int) (sr0.getValue().f1 - sr1.getValue().f1);
+					return (int) (sr0.getValue().f2 - sr1.getValue().f2);
 				}
 			}
 		}
