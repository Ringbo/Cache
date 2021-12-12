diff --git a/core/server/master/src/main/java/alluxio/master/file/meta/LockedInodePath.java b/core/server/master/src/main/java/alluxio/master/file/meta/LockedInodePath.java
index 4e45ec6..69036a6 100644
--- a/core/server/master/src/main/java/alluxio/master/file/meta/LockedInodePath.java
+++ b/core/server/master/src/main/java/alluxio/master/file/meta/LockedInodePath.java
@@ -231,15 +231,17 @@
    * it does not close the existing path.
    *
    * @param child the inode of the direct child
+   * @param lockMode the desired locking mode for the child
    * @return a {@link LockedInodePath} for the direct child
    * @throws InvalidPathException if the path is invalid
    * @throws FileDoesNotExistException if the file does not exist
    */
-  public synchronized LockedInodePath createTempPathForExistingChild(Inode<?> child)
+  public synchronized LockedInodePath createTempPathForExistingChild(
+      Inode<?> child, InodeTree.LockMode lockMode)
       throws InvalidPathException, FileDoesNotExistException {
     InodeLockList lockList = new CompositeInodeLockList(mLockList);
     LockedInodePath lockedDescendantPath;
-    if (mLockMode == InodeTree.LockMode.READ) {
+    if (lockMode == InodeTree.LockMode.READ) {
       lockList.lockReadAndCheckParent(child, getInode());
       lockedDescendantPath = new MutableLockedInodePath(
           getUri().join(child.getName()), this, lockList);
