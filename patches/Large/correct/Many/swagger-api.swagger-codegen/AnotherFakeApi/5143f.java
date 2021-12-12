diff --git a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/AnotherFakeApi.java b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/AnotherFakeApi.java
index c035961..9cf02d6 100644
--- a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/AnotherFakeApi.java
+++ b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/AnotherFakeApi.java
@@ -23,5 +23,5 @@
     @ApiOperation(value = "To test special tags", notes = "To test special tags", tags={ "$another-fake?" })
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
-    Client testSpecialTags(@Valid Client body);
+    Client testSpecialTags(@Valid Client body) throws Exception;
 }
