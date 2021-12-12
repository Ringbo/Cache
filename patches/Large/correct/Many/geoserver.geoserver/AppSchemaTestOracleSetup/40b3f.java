diff --git a/src/extension/app-schema/app-schema-test/src/test/java/org/geoserver/test/onlineTest/setup/AppSchemaTestOracleSetup.java b/src/extension/app-schema/app-schema-test/src/test/java/org/geoserver/test/onlineTest/setup/AppSchemaTestOracleSetup.java
index 0ffdfd9..f9675d8 100644
--- a/src/extension/app-schema/app-schema-test/src/test/java/org/geoserver/test/onlineTest/setup/AppSchemaTestOracleSetup.java
+++ b/src/extension/app-schema/app-schema-test/src/test/java/org/geoserver/test/onlineTest/setup/AppSchemaTestOracleSetup.java
@@ -163,7 +163,7 @@
                 .append("END DROP_TABLE_OR_VIEW;\n"); 
 
         for (String fileName : propertyFiles.keySet()) {
-            File file = new File(fileName);
+            File file = new File(propertyFiles.get(fileName), fileName);
             
             try ( PropertyFeatureReader reader = new PropertyFeatureReader("test", file ) ){            
                 SimpleFeatureType schema = reader.getFeatureType();
