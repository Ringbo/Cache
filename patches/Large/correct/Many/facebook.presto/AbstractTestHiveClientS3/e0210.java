diff --git a/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClientS3.java b/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClientS3.java
index 7f0e6fb..a67c4e2 100644
--- a/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClientS3.java
+++ b/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClientS3.java
@@ -451,7 +451,7 @@
         public Optional<Database> getDatabase(String databaseName)
         {
             return super.getDatabase(databaseName)
-                    .map(database -> Database.builder()
+                    .map(database -> Database.builder(database)
                             .setLocation(Optional.of("s3://" + writableBucket + "/"))
                             .build());
         }
