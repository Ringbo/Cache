diff --git a/core/server/src/test/java/alluxio/master/file/meta/InodeDirectoryTest.java b/core/server/src/test/java/alluxio/master/file/meta/InodeDirectoryTest.java
index 3e3aac9..2f98d4f 100644
--- a/core/server/src/test/java/alluxio/master/file/meta/InodeDirectoryTest.java
+++ b/core/server/src/test/java/alluxio/master/file/meta/InodeDirectoryTest.java
@@ -233,7 +233,7 @@
     InodeDirectory inode2 = createInodeDirectory();
     Assert.assertEquals(AbstractInodeTest.TEST_USER_NAME, inode2.getUserName());
     Assert.assertEquals(AbstractInodeTest.TEST_GROUP_NAME, inode2.getGroupName());
-    Assert.assertEquals((short) 0755, inode2.getPermission());
+    Assert.assertEquals((short) 0777, inode2.getPermission());
   }
 
   /**
