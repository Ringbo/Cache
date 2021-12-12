diff --git a/astrid/plugin-src/com/todoroo/astrid/tags/TagService.java b/astrid/plugin-src/com/todoroo/astrid/tags/TagService.java
index aa79245..4db00e7 100644
--- a/astrid/plugin-src/com/todoroo/astrid/tags/TagService.java
+++ b/astrid/plugin-src/com/todoroo/astrid/tags/TagService.java
@@ -299,7 +299,8 @@
     public void deleteLink(String taskUuid, String tagUuid) {
         Metadata deleteTemplate = new Metadata();
         deleteTemplate.setValue(Metadata.DELETION_DATE, DateUtilities.now());
-        metadataDao.update(Criterion.and(TagMetadata.TASK_UUID.eq(taskUuid), TagMetadata.TAG_UUID.eq(tagUuid)), deleteTemplate);
+        metadataDao.update(Criterion.and(MetadataCriteria.withKey(TagMetadata.KEY), Metadata.DELETION_DATE.eq(0),
+                TagMetadata.TASK_UUID.eq(taskUuid), TagMetadata.TAG_UUID.eq(tagUuid)), deleteTemplate);
     }
 
     /**
@@ -310,7 +311,8 @@
     public void deleteLinks(String taskUuid, String[] tagUuids) {
         Metadata deleteTemplate = new Metadata();
         deleteTemplate.setValue(Metadata.DELETION_DATE, DateUtilities.now());
-        metadataDao.update(Criterion.and(TagMetadata.TASK_UUID.eq(taskUuid), TagMetadata.TAG_UUID.in(tagUuids)), deleteTemplate);
+        metadataDao.update(Criterion.and(MetadataCriteria.withKey(TagMetadata.KEY), Metadata.DELETION_DATE.eq(0),
+                TagMetadata.TASK_UUID.eq(taskUuid), TagMetadata.TAG_UUID.in(tagUuids)), deleteTemplate);
     }
 
     /**
@@ -498,8 +500,7 @@
         // Mark as deleted links that don't exist anymore
         Metadata deletedLinkTemplate = new Metadata();
         deletedLinkTemplate.setValue(Metadata.DELETION_DATE, DateUtilities.now());
-        metadataDao.update(Criterion.and(MetadataCriteria.withKey(TagMetadata.KEY), TagMetadata.TASK_UUID.eq(taskUuid),
-                TagMetadata.TAG_UUID.in(existingLinks.toArray(new Long[existingLinks.size()]))), deletedLinkTemplate);
+        deleteLinks(taskUuid, existingLinks.toArray(new String[existingLinks.size()]));
 
         return true;
     }
