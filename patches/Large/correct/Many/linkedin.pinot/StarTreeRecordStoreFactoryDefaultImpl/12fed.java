diff --git a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/storage/StarTreeRecordStoreFactoryDefaultImpl.java b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/storage/StarTreeRecordStoreFactoryDefaultImpl.java
index 98873d4..313ea03 100644
--- a/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/storage/StarTreeRecordStoreFactoryDefaultImpl.java
+++ b/thirdeye/thirdeye-core/src/main/java/com/linkedin/thirdeye/impl/storage/StarTreeRecordStoreFactoryDefaultImpl.java
@@ -254,7 +254,7 @@
       dimensionIndexByFile.get(fileDescriptor.getId()).add(entry);
     }
 
-    if (LOG.isDebugEnabled()) {
+    if (LOGGER.isDebugEnabled()) {
       LOGGER.debug("Loaded dimension index {}", indexFile);
     }
   }
@@ -278,7 +278,7 @@
       metricIndexByFile.get(fileDescriptor.getId()).add(entry);
     }
 
-    if (LOG.isDebugEnabled()) {
+    if (LOGGER.isDebugEnabled()) {
       LOGGER.debug("Loaded metric index {}", indexFile);
     }
   }
@@ -297,7 +297,7 @@
             new File(dimensionStore,
                 associatedDescriptor.toString(StarTreeConstants.BUFFER_FILE_SUFFIX));
         dimensionSegments.put(indexEntry.getFileId(), mapBuffer(bufferFile));
-        if (LOG.isDebugEnabled()) {
+        if (LOGGER.isDebugEnabled()) {
           LOGGER.debug("Loaded buffer file {}", bufferFile);
         }
       }
@@ -307,7 +307,7 @@
             new File(dimensionStore,
                 associatedDescriptor.toString(StarTreeConstants.DICT_FILE_SUFFIX));
         dictionarySegments.put(indexEntry.getFileId(), mapBuffer(bufferFile));
-        if (LOG.isDebugEnabled()) {
+        if (LOGGER.isDebugEnabled()) {
           LOGGER.debug("Loaded buffer file {}", bufferFile);
         }
       }
@@ -327,7 +327,7 @@
             new File(metricStore,
                 associatedDescriptor.toString(StarTreeConstants.BUFFER_FILE_SUFFIX));
         metricSegments.put(indexEntry.getFileId(), mapBuffer(bufferFile));
-        if (LOG.isDebugEnabled()) {
+        if (LOGGER.isDebugEnabled()) {
           LOGGER.debug("Loaded buffer file {}", bufferFile);
         }
       }
