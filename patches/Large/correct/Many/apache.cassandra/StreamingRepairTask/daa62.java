diff --git a/src/java/org/apache/cassandra/streaming/StreamingRepairTask.java b/src/java/org/apache/cassandra/streaming/StreamingRepairTask.java
index 4a93f92..6cee195 100644
--- a/src/java/org/apache/cassandra/streaming/StreamingRepairTask.java
+++ b/src/java/org/apache/cassandra/streaming/StreamingRepairTask.java
@@ -78,7 +78,7 @@
 
     public static StreamingRepairTask create(InetAddress ep1, InetAddress ep2, String tableName, String cfName, Collection<Range> ranges, Runnable callback)
     {
-        InetAddress local = FBUtilities.getLocalAddress();
+        InetAddress local = FBUtilities.getBroadcastAddress();
         UUID id = UUIDGen.makeType1UUIDFromHost(local);
         // We can take anyone of the node as source or destination, however if one is localhost, we put at source to avoid a forwarding
         InetAddress src = ep2.equals(local) ? ep2 : ep1;
@@ -99,7 +99,7 @@
 
     public void run()
     {
-        if (src.equals(FBUtilities.getLocalAddress()))
+        if (src.equals(FBUtilities.getBroadcastAddress()))
         {
             initiateStreaming();
         }
@@ -205,7 +205,7 @@
                 throw new IOError(e);
             }
 
-            assert task.src.equals(FBUtilities.getLocalAddress());
+            assert task.src.equals(FBUtilities.getBroadcastAddress());
             assert task.owner.equals(message.getFrom());
 
             logger.info(String.format("[streaming task #%s] Received task from %s to stream %d ranges to %s", task.id, message.getFrom(), task.ranges.size(), task.dst));
@@ -219,7 +219,7 @@
             ByteArrayOutputStream bos = new ByteArrayOutputStream();
             DataOutputStream dos = new DataOutputStream(bos);
             StreamingRepairTask.serializer.serialize(task, dos, version);
-            Message msg = new Message(FBUtilities.getLocalAddress(), StorageService.Verb.STREAMING_REPAIR_REQUEST, bos.toByteArray(), version);
+            Message msg = new Message(FBUtilities.getBroadcastAddress(), StorageService.Verb.STREAMING_REPAIR_REQUEST, bos.toByteArray(), version);
             MessagingService.instance().sendOneWay(msg, task.src);
         }
     }
@@ -248,7 +248,7 @@
                 return;
             }
 
-            assert task.owner.equals(FBUtilities.getLocalAddress());
+            assert task.owner.equals(FBUtilities.getBroadcastAddress());
 
             logger.info(String.format("[streaming task #%s] task succeeded", task.id));
             if (task.callback != null)
@@ -262,7 +262,7 @@
             ByteArrayOutputStream bos = new ByteArrayOutputStream();
             DataOutputStream dos = new DataOutputStream(bos);
             UUIDGen.write(taskid, dos);
-            Message msg = new Message(FBUtilities.getLocalAddress(), StorageService.Verb.STREAMING_REPAIR_RESPONSE, bos.toByteArray(), version);
+            Message msg = new Message(FBUtilities.getBroadcastAddress(), StorageService.Verb.STREAMING_REPAIR_RESPONSE, bos.toByteArray(), version);
             MessagingService.instance().sendOneWay(msg, remote);
         }
     }
