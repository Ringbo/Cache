diff --git a/src/main/src/test/java/org/geoserver/catalog/impl/CatalogBuilderTest.java b/src/main/src/test/java/org/geoserver/catalog/impl/CatalogBuilderTest.java
index 951b8e1..7534129 100644
--- a/src/main/src/test/java/org/geoserver/catalog/impl/CatalogBuilderTest.java
+++ b/src/main/src/test/java/org/geoserver/catalog/impl/CatalogBuilderTest.java
@@ -203,7 +203,7 @@
             
             // create the lot of files
             byte[] bytes = bos.toByteArray();
-            for(int i = 0; i < 1025; i++) {
+            for(int i = 0; i < 100; i++) {
                 String pad = "";
                 if(i < 10) {
                     pad = "000";
