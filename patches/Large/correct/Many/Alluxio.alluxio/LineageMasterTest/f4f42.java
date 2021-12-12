diff --git a/core/server/master/src/test/java/alluxio/master/lineage/LineageMasterTest.java b/core/server/master/src/test/java/alluxio/master/lineage/LineageMasterTest.java
index 150785c..5873135 100644
--- a/core/server/master/src/test/java/alluxio/master/lineage/LineageMasterTest.java
+++ b/core/server/master/src/test/java/alluxio/master/lineage/LineageMasterTest.java
@@ -75,7 +75,7 @@
     JournalFactory factory =
         new MutableJournal.Factory(new URI(mTestFolder.newFolder().getAbsolutePath()));
     mFileSystemMaster = Mockito.mock(DefaultFileSystemMaster.class);
-    registry.add(DefaultFileSystemMaster.class, mFileSystemMaster);
+    registry.add(FileSystemMaster.class, mFileSystemMaster);
     ThreadFactory threadPool = ThreadFactoryUtils.build("LineageMasterTest-%d", true);
     mExecutorService = Executors.newFixedThreadPool(2, threadPool);
     mLineageMaster = new LineageMaster(registry, factory,
