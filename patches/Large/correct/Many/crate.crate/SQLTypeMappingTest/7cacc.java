diff --git a/sql/src/test/java/org/cratedb/integrationtests/SQLTypeMappingTest.java b/sql/src/test/java/org/cratedb/integrationtests/SQLTypeMappingTest.java
index 9bb276e..262f58f 100644
--- a/sql/src/test/java/org/cratedb/integrationtests/SQLTypeMappingTest.java
+++ b/sql/src/test/java/org/cratedb/integrationtests/SQLTypeMappingTest.java
@@ -125,7 +125,7 @@
                 "  dynamic_again object(dynamic) as (field timestamp)" +
                 " )" +
                 ") clustered into 2 shards replicas 0");
-        refresh();
+        ensureGreen();
     }
 
     @Test
@@ -153,8 +153,7 @@
         });
         refresh();
 
-        SQLResponse response = execute("select object_field, strict_field, " +
-                "no_dynamic_field from test12");
+        SQLResponse response = execute("select object_field, strict_field, no_dynamic_field from test12");
         assertEquals(1, response.rowCount());
         assertThat(response.rows()[0][0], instanceOf(Map.class));
         @SuppressWarnings("unchecked")
