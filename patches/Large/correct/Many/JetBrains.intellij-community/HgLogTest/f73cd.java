diff --git a/plugins/hg4idea/testSrc/hg4idea/test/history/HgLogTest.java b/plugins/hg4idea/testSrc/hg4idea/test/history/HgLogTest.java
index d003944..d6f9d7b 100644
--- a/plugins/hg4idea/testSrc/hg4idea/test/history/HgLogTest.java
+++ b/plugins/hg4idea/testSrc/hg4idea/test/history/HgLogTest.java
@@ -39,7 +39,7 @@
     myRepository.refresh(false, true);
     hg("commit -m a ");
     HgLogCommand logCommand = new HgLogCommand(myProject);
-    logCommand.setFollowCopies(true);
+    logCommand.setFollowCopies(false);
     VirtualFile copiedFile = myRepository.findChild(copiedFileName);
     assert copiedFile != null;
     final HgFile hgFile = new HgFile(myRepository, VfsUtilCore.virtualToIoFile(copiedFile));
