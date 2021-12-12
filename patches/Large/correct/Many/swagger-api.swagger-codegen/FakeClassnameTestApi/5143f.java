diff --git a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/FakeClassnameTestApi.java b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/FakeClassnameTestApi.java
index 710ea4c..7a1df7e 100644
--- a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/FakeClassnameTestApi.java
+++ b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/FakeClassnameTestApi.java
@@ -24,5 +24,5 @@
     }, tags={ "fake_classname_tags 123#$%^" })
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
-    Client testClassname(@Valid Client body);
+    Client testClassname(@Valid Client body) throws Exception;
 }
