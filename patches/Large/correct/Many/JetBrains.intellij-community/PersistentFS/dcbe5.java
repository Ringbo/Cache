diff --git a/source/com/intellij/openapi/vfs/newvfs/persistent/PersistentFS.java b/source/com/intellij/openapi/vfs/newvfs/persistent/PersistentFS.java
index 4af12a8..e9793d9 100644
--- a/source/com/intellij/openapi/vfs/newvfs/persistent/PersistentFS.java
+++ b/source/com/intellij/openapi/vfs/newvfs/persistent/PersistentFS.java
@@ -316,7 +316,7 @@
     final NewVirtualFileSystem delegate = getDelegate(file);
     delegate.renameFile(requestor, file, newName);
 
-    if (!delegate.exists(file)) {
+    if (newName.equalsIgnoreCase(file.getName()) || !delegate.exists(file)) {
       processEvent(new VFilePropertyChangeEvent(requestor, file, VirtualFile.PROP_NAME, file.getName(), newName, false));
     }
     else {
