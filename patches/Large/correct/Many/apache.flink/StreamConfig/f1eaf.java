diff --git a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/graph/StreamConfig.java b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/graph/StreamConfig.java
index 85c676c..457eee2 100644
--- a/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/graph/StreamConfig.java
+++ b/flink-streaming-java/src/main/java/org/apache/flink/streaming/api/graph/StreamConfig.java
@@ -233,7 +233,7 @@
 							"\nClass was actually found in classloader - deserialization issue." :
 							"\nClass not resolvable through given classloader.");
 
-			throw new StreamTaskException(exceptionMessage);
+			throw new StreamTaskException(exceptionMessage, e);
 		}
 		catch (Exception e) {
 			throw new StreamTaskException("Cannot instantiate user function.", e);
