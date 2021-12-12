diff --git a/core/server/master/src/main/java/alluxio/master/file/meta/InodeDirectoryIdGenerator.java b/core/server/master/src/main/java/alluxio/master/file/meta/InodeDirectoryIdGenerator.java
index 7f2a52f..1749a8b 100644
--- a/core/server/master/src/main/java/alluxio/master/file/meta/InodeDirectoryIdGenerator.java
+++ b/core/server/master/src/main/java/alluxio/master/file/meta/InodeDirectoryIdGenerator.java
@@ -40,7 +40,8 @@
    * @param containerIdGenerator the container id generator to use
    */
   public InodeDirectoryIdGenerator(ContainerIdGenerable containerIdGenerator) {
-    mContainerIdGenerator = Preconditions.checkNotNull(containerIdGenerator);
+    mContainerIdGenerator =
+            Preconditions.checkNotNull(containerIdGenerator, "containerIdGenerator");
   }
 
   /**
