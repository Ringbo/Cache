diff --git a/exec/jdbc/src/test/java/org/apache/drill/jdbc/test/TestMetadataDDL.java b/exec/jdbc/src/test/java/org/apache/drill/jdbc/test/TestMetadataDDL.java
index 918a547..948f600 100644
--- a/exec/jdbc/src/test/java/org/apache/drill/jdbc/test/TestMetadataDDL.java
+++ b/exec/jdbc/src/test/java/org/apache/drill/jdbc/test/TestMetadataDDL.java
@@ -83,7 +83,9 @@
             "TABLE_SCHEMA=hive_test.default; TABLE_NAME=infoschematest",
             "TABLE_SCHEMA=hive_test.default; TABLE_NAME=hiveview",
             "TABLE_SCHEMA=hive_test.default; TABLE_NAME=kv",
-            "TABLE_SCHEMA=hive_test.default; TABLE_NAME=foodate")
+            "TABLE_SCHEMA=hive_test.default; TABLE_NAME=foodate",
+            "TABLE_SCHEMA=hive_test.default; TABLE_NAME=partition_pruning_test"
+            )
         );
   }
 
@@ -106,7 +108,8 @@
             "TABLE_SCHEMA=hive_test.default; TABLE_NAME=infoschematest",
             "TABLE_SCHEMA=hive_test.default; TABLE_NAME=hiveview",
             "TABLE_SCHEMA=hive_test.default; TABLE_NAME=kv",
-            "TABLE_SCHEMA=hive_test.default; TABLE_NAME=foodate"));
+            "TABLE_SCHEMA=hive_test.default; TABLE_NAME=foodate",
+            "TABLE_SCHEMA=hive_test.default; TABLE_NAME=partition_pruning_test"));
   }
 
   @Test
