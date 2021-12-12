diff --git a/spring-data-mongodb/src/test/java/org/springframework/data/document/mongodb/GeoSpatialTests.java b/spring-data-mongodb/src/test/java/org/springframework/data/document/mongodb/GeoSpatialTests.java
index 948ae04..4c9db82 100644
--- a/spring-data-mongodb/src/test/java/org/springframework/data/document/mongodb/GeoSpatialTests.java
+++ b/spring-data-mongodb/src/test/java/org/springframework/data/document/mongodb/GeoSpatialTests.java
@@ -55,7 +55,7 @@
 
   private void addVenues() {
     // Data taken from https://github.com/deftlabs/mongo-java-geospatial-example
-    template.insert(new Venue("Penn Station", 73.99408, 40.75057));
+    template.insert(new Venue("Penn Station", -73.99408, 40.75057));
     template.insert(new Venue("10gen Office", -73.99171, 40.738868));
     template.insert(new Venue("Flatiron Building", -73.988135, 40.741404));
     template.insert(new Venue("Players Club", -73.997812, 40.739128));
