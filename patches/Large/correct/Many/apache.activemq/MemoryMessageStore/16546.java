diff --git a/activemq-core/src/main/java/org/apache/activemq/store/memory/MemoryMessageStore.java b/activemq-core/src/main/java/org/apache/activemq/store/memory/MemoryMessageStore.java
index 8816514..a54634d 100755
--- a/activemq-core/src/main/java/org/apache/activemq/store/memory/MemoryMessageStore.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/memory/MemoryMessageStore.java
@@ -77,7 +77,7 @@
     public void removeMessage(MessageId msgId) throws IOException{
         synchronized(messageTable){
             messageTable.remove(msgId);
-            if(lastBatchId!=null&lastBatchId.equals(msgId)){
+            if(lastBatchId!=null && lastBatchId.equals(msgId)){
                 lastBatchId=null;
             }
         }
