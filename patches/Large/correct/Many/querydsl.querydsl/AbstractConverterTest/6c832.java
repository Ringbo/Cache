diff --git a/querydsl-sql/src/test/java/com/mysema/query/sql/spatial/AbstractConverterTest.java b/querydsl-sql/src/test/java/com/mysema/query/sql/spatial/AbstractConverterTest.java
index ecb4375..dee8f0e 100644
--- a/querydsl-sql/src/test/java/com/mysema/query/sql/spatial/AbstractConverterTest.java
+++ b/querydsl-sql/src/test/java/com/mysema/query/sql/spatial/AbstractConverterTest.java
@@ -45,7 +45,7 @@
         // linestring
         data.add(LineString.createEmpty());
         for (int i = 0; i < 6; i++) {
-            data.add(new LineString(createSequence(crs, (Point)data.get(i))));
+            data.add(new LineString(createSequence(crs, (Point)data.get(i), (Point)data.get(i))));
         }
 
         // polgyon
