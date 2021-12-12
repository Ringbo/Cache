diff --git a/core/server/src/test/java/alluxio/master/file/meta/AbstractInodeTest.java b/core/server/src/test/java/alluxio/master/file/meta/AbstractInodeTest.java
index c78fffb..c603e29 100644
--- a/core/server/src/test/java/alluxio/master/file/meta/AbstractInodeTest.java
+++ b/core/server/src/test/java/alluxio/master/file/meta/AbstractInodeTest.java
@@ -26,7 +26,7 @@
   public static final String TEST_GROUP_NAME = "group1";
 
   private static PermissionStatus sPermissionStatus =
-      new PermissionStatus(TEST_USER_NAME, TEST_GROUP_NAME, (short) 0755);
+      new PermissionStatus(TEST_USER_NAME, TEST_GROUP_NAME, (short) 0777);
   @Rule
   public ExpectedException mThrown = ExpectedException.none();
 
