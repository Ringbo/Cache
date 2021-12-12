diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/storemigration/legacylogs/LegacyLogs.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/storemigration/legacylogs/LegacyLogs.java
index 65f4054..6cf386c 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/storemigration/legacylogs/LegacyLogs.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/storemigration/legacylogs/LegacyLogs.java
@@ -175,7 +175,7 @@
             final String oldName = file.getName();
             final long version = getLegacyLogVersion( oldName );
             final String newName = DEFAULT_NAME + DEFAULT_VERSION_SUFFIX + version;
-            fs.move( file, new File( file.getParent(), newName ) );
+            fs.renameFile( file, new File( file.getParent(), newName ) );
         }
 
         deleteUnusedLogFiles( storeDir );
