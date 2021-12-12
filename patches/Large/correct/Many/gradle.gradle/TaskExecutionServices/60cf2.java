diff --git a/subprojects/core/src/main/groovy/org/gradle/internal/service/scopes/TaskExecutionServices.java b/subprojects/core/src/main/groovy/org/gradle/internal/service/scopes/TaskExecutionServices.java
index bf3a769..6103257 100644
--- a/subprojects/core/src/main/groovy/org/gradle/internal/service/scopes/TaskExecutionServices.java
+++ b/subprojects/core/src/main/groovy/org/gradle/internal/service/scopes/TaskExecutionServices.java
@@ -98,7 +98,7 @@
         SerializerRegistry<FileCollectionSnapshot> serializerRegistry = new DefaultSerializerRegistry<FileCollectionSnapshot>();
         fileCollectionSnapshotter.registerSerializers(serializerRegistry);
         outputFilesSnapshotter.registerSerializers(serializerRegistry);
-        fileCollectionSnapshotter.registerSerializers(serializerRegistry);
+        discoveredFileCollectionSnapshotter.registerSerializers(serializerRegistry);
 
         TaskHistoryRepository taskHistoryRepository = new CacheBackedTaskHistoryRepository(cacheAccess,
             new CacheBackedFileSnapshotRepository(cacheAccess,
