diff --git a/astrid/src/com/todoroo/astrid/service/MetadataService.java b/astrid/src/com/todoroo/astrid/service/MetadataService.java
index 0425db8..1e71fb4 100644
--- a/astrid/src/com/todoroo/astrid/service/MetadataService.java
+++ b/astrid/src/com/todoroo/astrid/service/MetadataService.java
@@ -88,6 +88,6 @@
      * @param metadata
      */
     public void save(Metadata metadata) {
-        metadataDao.saveItem(metadata);
+        metadataDao.persist(metadata);
     }
 }
