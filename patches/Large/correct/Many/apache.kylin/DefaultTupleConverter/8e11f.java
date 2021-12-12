diff --git a/engine-spark/src/main/java/org/apache/kylin/engine/spark/cube/DefaultTupleConverter.java b/engine-spark/src/main/java/org/apache/kylin/engine/spark/cube/DefaultTupleConverter.java
index 9c1d681..8da1519 100644
--- a/engine-spark/src/main/java/org/apache/kylin/engine/spark/cube/DefaultTupleConverter.java
+++ b/engine-spark/src/main/java/org/apache/kylin/engine/spark/cube/DefaultTupleConverter.java
@@ -83,7 +83,7 @@
         }
 
         byte[] rowKey = rowkeyEncoder.createBuf();
-        rowkeyEncoder.encode(new ByteArray(rowKeyBodyBuf), new ByteArray(rowKey));
+        rowkeyEncoder.encode(new ByteArray(rowKeyBodyBuf, 0, offSet), new ByteArray(rowKey));
 
         ByteBuffer valueBuf = getValueBuf();
         valueBuf.clear();
