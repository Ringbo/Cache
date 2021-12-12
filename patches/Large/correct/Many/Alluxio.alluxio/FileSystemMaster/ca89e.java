diff --git a/core/server/src/main/java/alluxio/master/file/FileSystemMaster.java b/core/server/src/main/java/alluxio/master/file/FileSystemMaster.java
index 3e6c8a8..79939ab 100644
--- a/core/server/src/main/java/alluxio/master/file/FileSystemMaster.java
+++ b/core/server/src/main/java/alluxio/master/file/FileSystemMaster.java
@@ -2294,14 +2294,14 @@
         for (Inode<?> inode : inodeChildren) {
           // the path to inode for getPath should already be locked.
           tempInodePath.setDescendant(inode, mInodeTree.getPath(inode));
-          List<Inode<?>> persistedInodes = setAttributeInternal(tempInodePath, true, opTimeMs,
+          List<Inode<?>> persistedInodes = setAttributeInternal(tempInodePath, false, opTimeMs,
               options);
           journalPersistedInodes(persistedInodes);
           journalSetAttribute(tempInodePath, opTimeMs, options);
         }
       }
     }
-    List<Inode<?>> persistedInodes = setAttributeInternal(inodePath, true, opTimeMs, options);
+    List<Inode<?>> persistedInodes = setAttributeInternal(inodePath, false, opTimeMs, options);
     journalPersistedInodes(persistedInodes);
     return journalSetAttribute(inodePath, opTimeMs, options);
   }
@@ -2529,7 +2529,7 @@
     }
     try (LockedInodePath inodePath = mInodeTree
         .lockFullInodePath(entry.getId(), InodeTree.LockMode.WRITE)) {
-      setAttributeInternal(inodePath, false, entry.getOpTimeMs(), options);
+      setAttributeInternal(inodePath, true, entry.getOpTimeMs(), options);
       // Intentionally not journaling the persisted inodes from setAttributeInternal
     }
   }
