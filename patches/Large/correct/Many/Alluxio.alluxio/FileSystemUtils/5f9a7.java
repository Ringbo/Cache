diff --git a/core/client/src/main/java/alluxio/client/file/FileSystemUtils.java b/core/client/src/main/java/alluxio/client/file/FileSystemUtils.java
index 9e9be66..ff54336 100644
--- a/core/client/src/main/java/alluxio/client/file/FileSystemUtils.java
+++ b/core/client/src/main/java/alluxio/client/file/FileSystemUtils.java
@@ -170,7 +170,7 @@
       URIStatus uriStatus = fs.getStatus(uri);
       Permission perm = new Permission(uriStatus.getOwner(), uriStatus.getGroup(),
           (short) uriStatus.getMode());
-      OutputStream out = closer.register(ufs.create(dstPath.getPath(),
+      OutputStream out = closer.register(ufs.create(dstPath.toString(),
           new CreateOptions().setPermission(perm)));
       ret = IOUtils.copyLarge(in, out);
     } catch (Exception e) {
