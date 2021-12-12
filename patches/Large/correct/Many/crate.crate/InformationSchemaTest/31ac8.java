diff --git a/sql/src/test/java/io/crate/integrationtests/InformationSchemaTest.java b/sql/src/test/java/io/crate/integrationtests/InformationSchemaTest.java
index 8fc6b82..db03f5e 100644
--- a/sql/src/test/java/io/crate/integrationtests/InformationSchemaTest.java
+++ b/sql/src/test/java/io/crate/integrationtests/InformationSchemaTest.java
@@ -656,7 +656,7 @@
                     put("last_name", "Adams");
                 }}
         });
-        refresh();
+        execute("refresh table t4");
 
         execute("select column_name, ordinal_position from information_schema.columns where table_name='t4'");
         assertEquals(5, response.rowCount());
