diff --git a/server/src/test/java/io/druid/segment/realtime/FireDepartmentTest.java b/server/src/test/java/io/druid/segment/realtime/FireDepartmentTest.java
index d212342..5fca643 100644
--- a/server/src/test/java/io/druid/segment/realtime/FireDepartmentTest.java
+++ b/server/src/test/java/io/druid/segment/realtime/FireDepartmentTest.java
@@ -61,8 +61,7 @@
                         Arrays.asList("dim1", "dim2"),
                         null,
                         null
-                    ),
-                    JSONParseSpec.JSON
+                    )
                 ),
                 null, null, null, null
             ),
