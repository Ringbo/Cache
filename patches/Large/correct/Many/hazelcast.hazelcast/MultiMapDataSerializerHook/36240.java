diff --git a/hazelcast/src/main/java/com/hazelcast/multimap/MultiMapDataSerializerHook.java b/hazelcast/src/main/java/com/hazelcast/multimap/MultiMapDataSerializerHook.java
index fbfd0b7..bd55b61 100644
--- a/hazelcast/src/main/java/com/hazelcast/multimap/MultiMapDataSerializerHook.java
+++ b/hazelcast/src/main/java/com/hazelcast/multimap/MultiMapDataSerializerHook.java
@@ -211,7 +211,7 @@
                 return new TxnRemoveAllOperation();
             }
         };
-        constructors[TXN_REMOVE_ALL] = new ConstructorFunction<Integer, IdentifiedDataSerializable>() {
+        constructors[TXN_REMOVE_ALL_BACKUP] = new ConstructorFunction<Integer, IdentifiedDataSerializable>() {
             public IdentifiedDataSerializable createNew(Integer arg) {
                 return new TxnRemoveAllBackupOperation();
             }
