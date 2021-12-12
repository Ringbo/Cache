diff --git a/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/AbstractAlterOperation.java b/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/AbstractAlterOperation.java
index 5662272..75b81da 100644
--- a/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/AbstractAlterOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/concurrent/atomicreference/operations/AbstractAlterOperation.java
@@ -58,13 +58,13 @@
     @Override
     protected void writeInternal(ObjectDataOutput out) throws IOException {
         super.writeInternal(out);
-        out.writeObject(function);
+        out.writeData(function);
     }
 
     @Override
     protected void readInternal(ObjectDataInput in) throws IOException {
         super.readInternal(in);
-        function = in.readObject();
+        function = in.readData();
     }
 
     @Override
