diff --git a/core/server/src/test/java/alluxio/master/file/meta/InodeFileTest.java b/core/server/src/test/java/alluxio/master/file/meta/InodeFileTest.java
index 85b76bf..e96dfb6 100644
--- a/core/server/src/test/java/alluxio/master/file/meta/InodeFileTest.java
+++ b/core/server/src/test/java/alluxio/master/file/meta/InodeFileTest.java
@@ -150,6 +150,6 @@
     InodeFile inode1 = createInodeFile(1);
     Assert.assertEquals(AbstractInodeTest.TEST_USER_NAME, inode1.getUserName());
     Assert.assertEquals(AbstractInodeTest.TEST_GROUP_NAME, inode1.getGroupName());
-    Assert.assertEquals((short) 0644, inode1.getPermission());
+    Assert.assertEquals((short) 0777, inode1.getPermission());
   }
 }
