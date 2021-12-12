diff --git a/servers/src/main/java/tachyon/master/file/meta/InodeTree.java b/servers/src/main/java/tachyon/master/file/meta/InodeTree.java
index 3d98dba..96dd724 100644
--- a/servers/src/main/java/tachyon/master/file/meta/InodeTree.java
+++ b/servers/src/main/java/tachyon/master/file/meta/InodeTree.java
@@ -255,7 +255,7 @@
       currentInodeDirectory.addChild(dir);
       currentInodeDirectory.setLastModificationTimeMs(options.getOperationTimeMs());
       if (options.isPersisted()) {
-        String ufsPath = mMountTable.resolve(getPath(dir)).getPath();
+        String ufsPath = mMountTable.resolve(getPath(dir)).toString();
         UnderFileSystem ufs = UnderFileSystem.get(ufsPath, MasterContext.getConf());
         ufs.mkdirs(ufsPath, false);
       }
@@ -282,7 +282,7 @@
               .setParentId(currentInodeDirectory.getId()).setPersisted(options.isPersisted())
               .build();
       if (options.isPersisted()) {
-        String ufsPath = mMountTable.resolve(getPath(lastInode)).getPath();
+        String ufsPath = mMountTable.resolve(getPath(lastInode)).toString();
         UnderFileSystem ufs = UnderFileSystem.get(ufsPath, MasterContext.getConf());
         ufs.mkdirs(ufsPath, false);
       }
@@ -545,7 +545,7 @@
         if (persist && !next.isPersisted()) {
           next.setPersisted(true);
           persisted.add(next);
-          String ufsPath = mMountTable.resolve(getPath(next)).getPath();
+          String ufsPath = mMountTable.resolve(getPath(next)).toString();
           UnderFileSystem ufs = UnderFileSystem.get(ufsPath, MasterContext.getConf());
           ufs.mkdirs(ufsPath, false);
         }
