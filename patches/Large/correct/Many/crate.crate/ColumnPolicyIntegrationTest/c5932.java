diff --git a/sql/src/test/java/io/crate/integrationtests/ColumnPolicyIntegrationTest.java b/sql/src/test/java/io/crate/integrationtests/ColumnPolicyIntegrationTest.java
index 62660b8..b73dbcf 100644
--- a/sql/src/test/java/io/crate/integrationtests/ColumnPolicyIntegrationTest.java
+++ b/sql/src/test/java/io/crate/integrationtests/ColumnPolicyIntegrationTest.java
@@ -233,7 +233,7 @@
         execute("insert into dynamic_table (my_object) values ({a=['a','b']}),({b=['a']})");
         execute("refresh table dynamic_table");
 
-        waitForMappingUpdateOnAll("dynamic_table", "my_object.a");
+        waitForMappingUpdateOnAll("dynamic_table", "my_object.a", "my_object.b");
         Map<String, Object> sourceMap = getSourceMap("dynamic_table");
         assertThat(String.valueOf(nestedValue(sourceMap, "properties.my_object.properties.a.type")), is("array"));
         assertThat(String.valueOf(nestedValue(sourceMap, "properties.my_object.properties.a.inner.type")), is("string"));
