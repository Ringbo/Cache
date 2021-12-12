diff --git a/src/com/owncloud/android/ui/fragment/OCFileListFragment.java b/src/com/owncloud/android/ui/fragment/OCFileListFragment.java
index e6f7b13..c751575 100644
--- a/src/com/owncloud/android/ui/fragment/OCFileListFragment.java
+++ b/src/com/owncloud/android/ui/fragment/OCFileListFragment.java
@@ -171,7 +171,7 @@
                 directory = storageManager.getFileById(directory.getParentId());
             }
 
-            mAdapter.swapDirectory(mFile, storageManager);
+            mAdapter.swapDirectory(directory, storageManager);
             if (mFile == null || !mFile.equals(directory)) {
                 mList.setSelectionFromTop(0, 0);
             }
