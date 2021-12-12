diff --git a/samples/java-jaxrs/src/main/java/com/wordnik/swagger/sample/resource/PetResource.java b/samples/java-jaxrs/src/main/java/com/wordnik/swagger/sample/resource/PetResource.java
index b98bf0f..9637b54 100644
--- a/samples/java-jaxrs/src/main/java/com/wordnik/swagger/sample/resource/PetResource.java
+++ b/samples/java-jaxrs/src/main/java/com/wordnik/swagger/sample/resource/PetResource.java
@@ -34,16 +34,16 @@
   @GET
   @Path("/{petId}")
   @ApiOperation(value = "Find pet by ID", 
-    notes = "Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions", 
-    response = Pet.class)
+    notes = "Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions"
+  )
   @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
       @ApiResponse(code = 404, message = "Pet not found") })
-  public Response getPetById(
+  public Pet getPetById(
       @ApiParam(value = "ID of pet that needs to be fetched", allowableValues = "range[1,5]", required = true) @PathParam("petId") String petId)
       throws NotFoundException {
     Pet pet = petData.getPetbyId(ru.getLong(0, 100000, 0, petId));
     if (null != pet) {
-      return Response.ok().entity(pet).build();
+      return pet;
     } else {
       throw new NotFoundException(404, "Pet not found");
     }
