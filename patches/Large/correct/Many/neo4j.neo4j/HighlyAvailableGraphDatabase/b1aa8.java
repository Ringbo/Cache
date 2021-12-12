diff --git a/enterprise/ha/src/main/java/org/neo4j/kernel/HighlyAvailableGraphDatabase.java b/enterprise/ha/src/main/java/org/neo4j/kernel/HighlyAvailableGraphDatabase.java
index 85253d3..5d5fbea 100644
--- a/enterprise/ha/src/main/java/org/neo4j/kernel/HighlyAvailableGraphDatabase.java
+++ b/enterprise/ha/src/main/java/org/neo4j/kernel/HighlyAvailableGraphDatabase.java
@@ -214,7 +214,7 @@
                     
                     // Exclude any previous branched-??? directories, otherwise this
                     // becomes like a linked list of old directories.
-                    (file.isDirectory() && file.getName().startsWith( "branched-" ) ) )
+                    (file.isDirectory() && !file.getName().startsWith( "branched-" ) ) )
             {
                 File dest = new File( oldDir, file.getName() );
                 if ( !file.renameTo( dest ) )
