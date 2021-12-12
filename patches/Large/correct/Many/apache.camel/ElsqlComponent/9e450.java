diff --git a/components/camel-elsql/src/main/java/org/apache/camel/component/elsql/ElsqlComponent.java b/components/camel-elsql/src/main/java/org/apache/camel/component/elsql/ElsqlComponent.java
index 3fbcfaa..1c3d001 100644
--- a/components/camel-elsql/src/main/java/org/apache/camel/component/elsql/ElsqlComponent.java
+++ b/components/camel-elsql/src/main/java/org/apache/camel/component/elsql/ElsqlComponent.java
@@ -90,7 +90,7 @@
         ElsqlEndpoint endpoint = new ElsqlEndpoint(uri, this, jdbcTemplate, target, elsqlName, resUri);
         endpoint.setElSqlConfig(elSqlConfig);
         endpoint.setDatabaseVendor(databaseVendor);
-        endpoint.setDataSource(ds);
+        endpoint.setDataSource(target);
         endpoint.setDataSourceRef(dataSourceRef);
         endpoint.setOnConsume(onConsume);
         endpoint.setOnConsumeFailed(onConsumeFailed);
