diff --git a/integration/fuse/src/test/java/alluxio/fuse/AlluxioFuseFileSystemTest.java b/integration/fuse/src/test/java/alluxio/fuse/AlluxioFuseFileSystemTest.java
index 4329f43..b6d3c46 100644
--- a/integration/fuse/src/test/java/alluxio/fuse/AlluxioFuseFileSystemTest.java
+++ b/integration/fuse/src/test/java/alluxio/fuse/AlluxioFuseFileSystemTest.java
@@ -137,14 +137,14 @@
 
     FileStat stat = new FileStat(Runtime.getSystemRuntime());
     assertEquals(0, mFuseFs.getattr("/foo", stat));
-    assertEquals(status.getLength(), stat.st_size.get());
+    assertEquals(status.getLength(), stat.st_size.longValue());
     assertEquals(status.getLastModificationTimeMs() / 1000, stat.st_ctim.tv_sec.get());
-    assertEquals((status.getLastModificationTimeMs() % 1000) * 1000, stat.st_ctim.tv_nsec.get());
+    assertEquals((status.getLastModificationTimeMs() % 1000) * 1000, stat.st_ctim.tv_nsec.longValue());
     assertEquals(status.getLastModificationTimeMs() / 1000, stat.st_mtim.tv_sec.get());
-    assertEquals((status.getLastModificationTimeMs() % 1000) * 1000, stat.st_mtim.tv_nsec.get());
+    assertEquals((status.getLastModificationTimeMs() % 1000) * 1000, stat.st_mtim.tv_nsec.longValue());
     assertEquals(AlluxioFuseUtils.getUid(System.getProperty("user.name")), stat.st_uid.get());
     assertEquals(AlluxioFuseUtils.getGid(System.getProperty("user.name")), stat.st_gid.get());
-    assertEquals(123 | FileStat.S_IFDIR, stat.st_mode.get());
+    assertEquals(123 | FileStat.S_IFDIR, stat.st_mode.intValue());
   }
 
   @Test
