diff --git a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/UserApi.java b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/UserApi.java
index d6c30a1..0619dbc 100644
--- a/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/UserApi.java
+++ b/samples/server/petstore/jaxrs-spec-interface/src/gen/java/io/swagger/api/UserApi.java
@@ -22,7 +22,7 @@
     @ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", tags={ "user",  })
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
-    void createUser(@Valid User body);
+    void createUser(@Valid User body) throws Exception;
 
     @POST
     @Path("/createWithArray")
@@ -30,7 +30,7 @@
     @ApiOperation(value = "Creates list of users with given input array", notes = "", tags={ "user",  })
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
-    void createUsersWithArrayInput(@Valid List<User> body);
+    void createUsersWithArrayInput(@Valid List<User> body) throws Exception;
 
     @POST
     @Path("/createWithList")
@@ -38,7 +38,7 @@
     @ApiOperation(value = "Creates list of users with given input array", notes = "", tags={ "user",  })
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
-    void createUsersWithListInput(@Valid List<User> body);
+    void createUsersWithListInput(@Valid List<User> body) throws Exception;
 
     @DELETE
     @Path("/{username}")
@@ -47,7 +47,7 @@
     @ApiResponses(value = { 
         @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
         @ApiResponse(code = 404, message = "User not found", response = Void.class) })
-    void deleteUser(@PathParam("username") @ApiParam("The name that needs to be deleted") String username);
+    void deleteUser(@PathParam("username") @ApiParam("The name that needs to be deleted") String username) throws Exception;
 
     @GET
     @Path("/{username}")
@@ -57,7 +57,7 @@
         @ApiResponse(code = 200, message = "successful operation", response = User.class),
         @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
         @ApiResponse(code = 404, message = "User not found", response = Void.class) })
-    User getUserByName(@PathParam("username") @ApiParam("The name that needs to be fetched. Use user1 for testing. ") String username);
+    User getUserByName(@PathParam("username") @ApiParam("The name that needs to be fetched. Use user1 for testing. ") String username) throws Exception;
 
     @GET
     @Path("/login")
@@ -66,7 +66,7 @@
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = String.class),
         @ApiResponse(code = 400, message = "Invalid username/password supplied", response = Void.class) })
-    String loginUser(@QueryParam("username") @NotNull   @ApiParam("The user name for login")  String username,@QueryParam("password") @NotNull   @ApiParam("The password for login in clear text")  String password);
+    String loginUser(@QueryParam("username") @NotNull   @ApiParam("The user name for login")  String username,@QueryParam("password") @NotNull   @ApiParam("The password for login in clear text")  String password) throws Exception;
 
     @GET
     @Path("/logout")
@@ -74,7 +74,7 @@
     @ApiOperation(value = "Logs out current logged in user session", notes = "", tags={ "user",  })
     @ApiResponses(value = { 
         @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
-    void logoutUser();
+    void logoutUser() throws Exception;
 
     @PUT
     @Path("/{username}")
@@ -83,5 +83,5 @@
     @ApiResponses(value = { 
         @ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
         @ApiResponse(code = 404, message = "User not found", response = Void.class) })
-    void updateUser(@PathParam("username") @ApiParam("name that need to be deleted") String username,@Valid User body);
+    void updateUser(@PathParam("username") @ApiParam("name that need to be deleted") String username,@Valid User body) throws Exception;
 }
