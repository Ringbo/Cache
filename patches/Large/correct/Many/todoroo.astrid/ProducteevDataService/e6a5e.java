diff --git a/astrid/plugin-src/com/todoroo/astrid/producteev/sync/ProducteevDataService.java b/astrid/plugin-src/com/todoroo/astrid/producteev/sync/ProducteevDataService.java
index bba4fc2..bf97033 100644
--- a/astrid/plugin-src/com/todoroo/astrid/producteev/sync/ProducteevDataService.java
+++ b/astrid/plugin-src/com/todoroo/astrid/producteev/sync/ProducteevDataService.java
@@ -154,7 +154,8 @@
         task.metadata.add(task.pdvTask);
         metadataService.synchronizeMetadata(task.task.getId(), task.metadata,
                 Criterion.or(MetadataCriteria.withKey(ProducteevTask.METADATA_KEY),
-                        MetadataCriteria.withKey(TagService.KEY)));
+                        MetadataCriteria.withKey(TagService.KEY),
+                        MetadataCriteria.withKey(NoteMetadata.METADATA_KEY)));
     }
 
     /**
