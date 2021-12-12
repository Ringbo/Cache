diff --git a/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClientS3.java b/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClientS3.java
index dbbff72..831173e 100644
--- a/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClientS3.java
+++ b/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClientS3.java
@@ -250,10 +250,10 @@
             assertEquals(row.getField(0), 1L);
 
             row = result.getMaterializedRows().get(1);
-            assertEquals(row.getField(0), 2L);
+            assertEquals(row.getField(0), 3L);
 
             row = result.getMaterializedRows().get(2);
-            assertEquals(row.getField(0), 3L);
+            assertEquals(row.getField(0), 2L);
         }
     }
 
