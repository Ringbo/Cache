diff --git a/community/kernel/src/main/java/org/neo4j/storageengine/api/StoreReadLayer.java b/community/kernel/src/main/java/org/neo4j/storageengine/api/StoreReadLayer.java
index 8bc8e30..8843e8a 100644
--- a/community/kernel/src/main/java/org/neo4j/storageengine/api/StoreReadLayer.java
+++ b/community/kernel/src/main/java/org/neo4j/storageengine/api/StoreReadLayer.java
@@ -151,7 +151,7 @@
      * @return {@link InternalIndexState} for index.
      * @throws IndexNotFoundKernelException if index not found.
      */
-    InternalIndexState indexGetState( LabelSchemaDescriptor descriptor ) throws IndexNotFoundKernelException;
+    InternalIndexState indexGetState( NewIndexDescriptor descriptor ) throws IndexNotFoundKernelException;
 
     /**
      * @param descriptor {@link LabelSchemaDescriptor} to get population progress for.
