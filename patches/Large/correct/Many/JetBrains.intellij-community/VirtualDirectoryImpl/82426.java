diff --git a/source/com/intellij/openapi/vfs/newvfs/impl/VirtualDirectoryImpl.java b/source/com/intellij/openapi/vfs/newvfs/impl/VirtualDirectoryImpl.java
index aad9286..31533b1 100644
--- a/source/com/intellij/openapi/vfs/newvfs/impl/VirtualDirectoryImpl.java
+++ b/source/com/intellij/openapi/vfs/newvfs/impl/VirtualDirectoryImpl.java
@@ -168,21 +168,21 @@
   }
 
   @Nullable
-  private VirtualFile[] asArray() {
+  private synchronized VirtualFile[] asArray() {
     if (myChildren instanceof VirtualFile[]) return (VirtualFile[])myChildren;
     return null;
   }
 
   @Nullable
   @SuppressWarnings({"unchecked"})
-  private Map<String, VirtualFile> asMap() {
+  private synchronized Map<String, VirtualFile> asMap() {
     if (myChildren instanceof Map) return (Map<String, VirtualFile>)myChildren;
     return null;
   }
 
   @NotNull
   @SuppressWarnings({"unchecked"})
-  private Map<String, VirtualFile> ensureAsMap() {
+  private synchronized Map<String, VirtualFile> ensureAsMap() {
     assert !(myChildren instanceof VirtualFile[]);
 
     if (myChildren == null) {
