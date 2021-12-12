diff --git a/community/security/src/main/java/org/neo4j/server/security/auth/FileRepositorySerializer.java b/community/security/src/main/java/org/neo4j/server/security/auth/FileRepositorySerializer.java
index 1c10c4c..a3c057a 100644
--- a/community/security/src/main/java/org/neo4j/server/security/auth/FileRepositorySerializer.java
+++ b/community/security/src/main/java/org/neo4j/server/security/auth/FileRepositorySerializer.java
@@ -78,7 +78,7 @@
         try
         {
             writeToFile( fileSystem, tempFile, serialize( records ) );
-            fileSystem.move( tempFile, recordsFile, ATOMIC_MOVE, REPLACE_EXISTING );
+            fileSystem.renameFile( tempFile, recordsFile, ATOMIC_MOVE, REPLACE_EXISTING );
         }
         catch ( Throwable e )
         {
