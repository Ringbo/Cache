diff --git a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/PetApi.java b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/PetApi.java
index bd166d6..271d68e 100644
--- a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/PetApi.java
+++ b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/PetApi.java
@@ -29,7 +29,7 @@
     }, tags={ "pet",  })
     @ApiResponses(value = { 
         @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
-    void addPet(@Valid Pet body);
+    void addPet(@Valid Pet body) throws Exception;
 
     @DELETE
     @Path("/{petId}")
@@ -42,7 +42,7 @@
     }, tags={ "pet",  })
     @ApiResponses(value = { 
         @ApiResponse(code = 400, message = "Invalid pet value", response = Void.class) })
-    void deletePet(@PathParam("petId") @ApiParam("Pet id to delete") Long petId,@HeaderParam("api_key")   String apiKey);
+    void deletePet(@PathParam("petId") @ApiParam("Pet id to delete") Long petId,@HeaderParam("api_key")   String apiKey) throws Exception;
 
     @GET
     @Path("/findByStatus")
@@ -56,7 +56,7 @@
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
         @ApiResponse(code = 400, message = "Invalid status value", response = Void.class, responseContainer = "List") })
-    List<List<Pet>> findPetsByStatus(@QueryParam("status") @NotNull   @ApiParam("Status values that need to be considered for filter")  List<String> status);
+    List<Pet> findPetsByStatus(@QueryParam("status") @NotNull   @ApiParam("Status values that need to be considered for filter")  List<String> status) throws Exception;
 
     @GET
     @Path("/findByTags")
@@ -70,7 +70,7 @@
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
         @ApiResponse(code = 400, message = "Invalid tag value", response = Void.class, responseContainer = "List") })
-    List<List<Pet>> findPetsByTags(@QueryParam("tags") @NotNull   @ApiParam("Tags to filter by")  List<String> tags);
+    List<Pet> findPetsByTags(@QueryParam("tags") @NotNull   @ApiParam("Tags to filter by")  List<String> tags) throws Exception;
 
     @GET
     @Path("/{petId}")
@@ -82,7 +82,7 @@
         @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
         @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
         @ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
-    Pet getPetById(@PathParam("petId") @ApiParam("ID of pet to return") Long petId);
+    Pet getPetById(@PathParam("petId") @ApiParam("ID of pet to return") Long petId) throws Exception;
 
     @PUT
     @Consumes({ "application/json", "application/xml" })
@@ -97,7 +97,7 @@
         @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
         @ApiResponse(code = 404, message = "Pet not found", response = Void.class),
         @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
-    void updatePet(@Valid Pet body);
+    void updatePet(@Valid Pet body) throws Exception;
 
     @POST
     @Path("/{petId}")
@@ -111,7 +111,7 @@
     }, tags={ "pet",  })
     @ApiResponses(value = { 
         @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
-    void updatePetWithForm(@PathParam("petId") @ApiParam("ID of pet that needs to be updated") Long petId,@FormParam(value = "name")  String name,@FormParam(value = "status")  String status);
+    void updatePetWithForm(@PathParam("petId") @ApiParam("ID of pet that needs to be updated") Long petId,@FormParam(value = "name")  String name,@FormParam(value = "status")  String status) throws Exception;
 
     @POST
     @Path("/{petId}/uploadImage")
@@ -126,5 +126,5 @@
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
     ModelApiResponse uploadFile(@PathParam("petId") @ApiParam("ID of pet to update") Long petId,@FormParam(value = "additionalMetadata")  String additionalMetadata, @FormParam(value = "file") InputStream fileInputStream,
-   @FormParam(value = "file") Attachment fileDetail);
+   @FormParam(value = "file") Attachment fileDetail) throws Exception;
 }
