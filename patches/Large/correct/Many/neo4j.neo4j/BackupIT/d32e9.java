diff --git a/enterprise/backup/src/test/java/org/neo4j/backup/BackupIT.java b/enterprise/backup/src/test/java/org/neo4j/backup/BackupIT.java
index 3d0cc4b..730964a 100644
--- a/enterprise/backup/src/test/java/org/neo4j/backup/BackupIT.java
+++ b/enterprise/backup/src/test/java/org/neo4j/backup/BackupIT.java
@@ -454,7 +454,7 @@
             {
                 try ( Transaction tx = db.beginTx() )
                 {
-                    db.createNode( indexedLabels.get( random.nextInt( numberOfIndexedLabels ) ) ).setProperty( "prop", random.propertyValue() );
+                    db.createNode( indexedLabels.get( random.nextInt( numberOfIndexedLabels ) ) ).setProperty( "prop", random.nextValue() );
                     tx.success();
                 }
             }
