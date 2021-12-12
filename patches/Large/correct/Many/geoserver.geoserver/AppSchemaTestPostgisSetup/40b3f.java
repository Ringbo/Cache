diff --git a/src/extension/app-schema/app-schema-test/src/test/java/org/geoserver/test/onlineTest/setup/AppSchemaTestPostgisSetup.java b/src/extension/app-schema/app-schema-test/src/test/java/org/geoserver/test/onlineTest/setup/AppSchemaTestPostgisSetup.java
index 1c33098..613cf99 100644
--- a/src/extension/app-schema/app-schema-test/src/test/java/org/geoserver/test/onlineTest/setup/AppSchemaTestPostgisSetup.java
+++ b/src/extension/app-schema/app-schema-test/src/test/java/org/geoserver/test/onlineTest/setup/AppSchemaTestPostgisSetup.java
@@ -125,7 +125,7 @@
         buf.append("DROP SCHEMA IF EXISTS ").append(ONLINE_DB_SCHEMA).append(" CASCADE;\n");
         buf.append("CREATE SCHEMA ").append(ONLINE_DB_SCHEMA).append(";\n");
         for (String fileName : propertyFiles.keySet()) {
-            File file = new File(fileName);
+            File file = new File(propertyFiles.get(fileName), fileName);
             
             try (PropertyFeatureReader reader = new PropertyFeatureReader("test", file ) ){
                 SimpleFeatureType schema = reader.getFeatureType();
