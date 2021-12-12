diff --git a/server/src/test/java/io/druid/segment/realtime/FireDepartmentTest.java b/server/src/test/java/io/druid/segment/realtime/FireDepartmentTest.java
index 2da5854..19c104a 100644
--- a/server/src/test/java/io/druid/segment/realtime/FireDepartmentTest.java
+++ b/server/src/test/java/io/druid/segment/realtime/FireDepartmentTest.java
@@ -63,7 +63,7 @@
                         null
                     )
                 ),
-                null, null, null
+                null, null, null, null
             ),
             new AggregatorFactory[]{
                 new CountAggregatorFactory("count")
