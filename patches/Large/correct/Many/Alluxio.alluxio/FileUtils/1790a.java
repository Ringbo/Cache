diff --git a/core/common/src/main/java/alluxio/util/io/FileUtils.java b/core/common/src/main/java/alluxio/util/io/FileUtils.java
index 1f63b2e..9f77a30 100644
--- a/core/common/src/main/java/alluxio/util/io/FileUtils.java
+++ b/core/common/src/main/java/alluxio/util/io/FileUtils.java
@@ -98,7 +98,7 @@
     PosixFileAttributeView view =
         Files.getFileAttributeView(Paths.get(path), PosixFileAttributeView.class,
             LinkOption.NOFOLLOW_LINKS);
-    UserPrincipal userPrincipal = lookupService.lookupPrincipalByGroupName(user);
+    UserPrincipal userPrincipal = lookupService.lookupPrincipalByName(user);
     view.setOwner(userPrincipal);
   }
 
