diff --git a/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/AtomicReferenceReplicationOperation.java b/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/AtomicReferenceReplicationOperation.java
index fc1fd62..02c36ee 100644
--- a/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/AtomicReferenceReplicationOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/AtomicReferenceReplicationOperation.java
@@ -72,7 +72,7 @@
         out.writeInt(migrationData.size());
         for (Map.Entry<String, Data> entry : migrationData.entrySet()) {
             out.writeUTF(entry.getKey());
-            out.writeObject(entry.getValue());
+            out.writeData(entry.getValue());
         }
     }
 
@@ -82,7 +82,7 @@
         migrationData = new HashMap<String, Data>(mapSize);
         for (int i = 0; i < mapSize; i++) {
             String name = in.readUTF();
-            Data data = in.readObject();
+            Data data = in.readData();
             migrationData.put(name, data);
         }
     }
