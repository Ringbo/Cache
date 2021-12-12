diff --git a/clients/src/main/java/org/apache/kafka/common/network/ByteBufferSend.java b/clients/src/main/java/org/apache/kafka/common/network/ByteBufferSend.java
index a8e0413..9305b61 100644
--- a/clients/src/main/java/org/apache/kafka/common/network/ByteBufferSend.java
+++ b/clients/src/main/java/org/apache/kafka/common/network/ByteBufferSend.java
@@ -45,7 +45,7 @@
 
     @Override
     public boolean complete() {
-        return remaining > 0;
+        return remaining <= 0;
     }
 
     @Override
