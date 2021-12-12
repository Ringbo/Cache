diff --git a/presto-main/src/main/java/com/facebook/presto/operator/HttpPageBufferClient.java b/presto-main/src/main/java/com/facebook/presto/operator/HttpPageBufferClient.java
index 4a66231..ed0182a 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/HttpPageBufferClient.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/HttpPageBufferClient.java
@@ -355,7 +355,7 @@
 
             // if sequenceId is after the end of this response, return and empty list
             int startOffset = Ints.saturatedCast(sequenceId - startingSequenceId);
-            if (startOffset > pages.size()) {
+            if (startOffset >= pages.size()) {
                 // most likely a duplicate of an old request
                 return ImmutableList.of();
             }
