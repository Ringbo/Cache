diff --git a/plugins/pur/core/src/main/java/org/pentaho/di/repository/pur/PurRepository.java b/plugins/pur/core/src/main/java/org/pentaho/di/repository/pur/PurRepository.java
index d279cc8..2b66fef 100644
--- a/plugins/pur/core/src/main/java/org/pentaho/di/repository/pur/PurRepository.java
+++ b/plugins/pur/core/src/main/java/org/pentaho/di/repository/pur/PurRepository.java
@@ -1560,7 +1560,7 @@
     try {
 
       //RepositoryDirectoryInterface repDir = getRootDir().findDirectory( dirId );
-      RepositoryFile dirFile = pur.getFile( dirId.getId() );
+      RepositoryFile dirFile = pur.getFileById( dirId.getId() );
       RepositoryDirectory repDir = new RepositoryDirectory();
       repDir.setObjectId( dirId );
       repDir.setName( dirFile.getName() );
