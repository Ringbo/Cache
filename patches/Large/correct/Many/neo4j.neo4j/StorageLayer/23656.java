diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/api/store/StorageLayer.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/api/store/StorageLayer.java
index b9f862f..374d864 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/api/store/StorageLayer.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/api/store/StorageLayer.java
@@ -239,9 +239,9 @@
     }
 
     @Override
-    public InternalIndexState indexGetState( LabelSchemaDescriptor descriptor ) throws IndexNotFoundKernelException
+    public InternalIndexState indexGetState( NewIndexDescriptor descriptor ) throws IndexNotFoundKernelException
     {
-        return indexService.getIndexProxy( NewIndexDescriptorFactory.forSchema( descriptor ) ).getState();
+        return indexService.getIndexProxy( descriptor ).getState();
     }
 
     @Override
