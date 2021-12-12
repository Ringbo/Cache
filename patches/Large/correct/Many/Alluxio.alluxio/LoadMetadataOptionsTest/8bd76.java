diff --git a/core/server/master/src/test/java/alluxio/master/file/options/LoadMetadataOptionsTest.java b/core/server/master/src/test/java/alluxio/master/file/options/LoadMetadataOptionsTest.java
index ddcccac..513e792 100644
--- a/core/server/master/src/test/java/alluxio/master/file/options/LoadMetadataOptionsTest.java
+++ b/core/server/master/src/test/java/alluxio/master/file/options/LoadMetadataOptionsTest.java
@@ -40,7 +40,8 @@
     LoadMetadataOptions options = LoadMetadataOptions.defaults();
     options.setCreateAncestors(isCreateAncestors);
     options.setLoadDirectChildren(isLoadDirectChildren);
-    options.setUnderFileStatus(new UnderFileStatus("dummy", isDirectory));
+    options.setUnderFileStatus(
+        new UnderFileStatus("dummy", 0L, isDirectory, 0L, "owner", "group", (short) 077));
     Assert.assertEquals(isCreateAncestors, options.isCreateAncestors());
     Assert.assertEquals(isLoadDirectChildren, options.isLoadDirectChildren());
     Assert.assertEquals(isDirectory, options.getUnderFileStatus().isDirectory());
