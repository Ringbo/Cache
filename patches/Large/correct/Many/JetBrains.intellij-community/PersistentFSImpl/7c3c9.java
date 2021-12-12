diff --git a/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/PersistentFSImpl.java b/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/PersistentFSImpl.java
index 6099e3a..d14e704 100644
--- a/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/PersistentFSImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/PersistentFSImpl.java
@@ -837,7 +837,8 @@
     for (Map.Entry<VirtualDirectoryImpl, Collection<VFileDeleteEvent>> entry : deletions.entrySet()) {
       VirtualDirectoryImpl parent = entry.getKey();
       Collection<VFileDeleteEvent> deleteEvents = entry.getValue();
-      if (parent == null) {
+      // no valid containing directory, apply events the old way - one by one
+      if (parent == null || !parent.isValid()) {
         deleteEvents.forEach(this::applyEvent);
         return;
       }
