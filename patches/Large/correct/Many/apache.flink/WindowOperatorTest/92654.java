diff --git a/flink-streaming-java/src/test/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperatorTest.java b/flink-streaming-java/src/test/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperatorTest.java
index 1137c6a..474548c 100644
--- a/flink-streaming-java/src/test/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperatorTest.java
+++ b/flink-streaming-java/src/test/java/org/apache/flink/streaming/runtime/operators/windowing/WindowOperatorTest.java
@@ -2560,7 +2560,7 @@
 					if (comparison != 0) {
 						return comparison;
 					}
-					return (int) (sr0.getValue().f1 - sr1.getValue().f1);
+					return (int) (sr0.getValue().f2 - sr1.getValue().f2);
 				}
 			}
 		}
