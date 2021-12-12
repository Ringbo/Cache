diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/description/AbstractSwaggerServiceDescriptionTest.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/description/AbstractSwaggerServiceDescriptionTest.java
index 10a2cec..203d977 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/description/AbstractSwaggerServiceDescriptionTest.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/description/AbstractSwaggerServiceDescriptionTest.java
@@ -202,8 +202,8 @@
                     .add(Json.createObjectBuilder()
                         .add("path", "/bookstore/{id}")
                         .add("operations", Json.createArrayBuilder()
-                            .add(DELETE_METHOD_SPEC)
-                            .add(GET_BY_ID_METHOD_SPEC)))
+                            .add(GET_BY_ID_METHOD_SPEC)
+                            .add(DELETE_METHOD_SPEC)))
                     .add(Json.createObjectBuilder()
                         .add("path", "/bookstore")
                         .add("operations", Json.createArrayBuilder().add(GET_METHOD_SPEC))))
