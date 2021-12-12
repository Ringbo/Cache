diff --git a/integration/admin-client/src/main/java/org/keycloak/admin/client/resource/UsersResource.java b/integration/admin-client/src/main/java/org/keycloak/admin/client/resource/UsersResource.java
index dc53fdf..9b70421 100755
--- a/integration/admin-client/src/main/java/org/keycloak/admin/client/resource/UsersResource.java
+++ b/integration/admin-client/src/main/java/org/keycloak/admin/client/resource/UsersResource.java
@@ -17,7 +17,7 @@
 
     @GET
     @Produces(MediaType.APPLICATION_JSON)
-    public List<UserRepresentation> search(@QueryParam("username") String username,
+    List<UserRepresentation> search(@QueryParam("username") String username,
                                            @QueryParam("firstName") String firstName,
                                            @QueryParam("lastName") String lastName,
                                            @QueryParam("email") String email,
@@ -26,7 +26,7 @@
 
     @GET
     @Produces(MediaType.APPLICATION_JSON)
-    public List<UserRepresentation> search(@QueryParam("search") String search,
+    List<UserRepresentation> search(@QueryParam("search") String search,
                                            @QueryParam("first") Integer firstResult,
                                            @QueryParam("max") Integer maxResults);
 
@@ -34,7 +34,7 @@
     @Consumes(MediaType.APPLICATION_JSON)
     Response create(UserRepresentation userRepresentation);
 
-    @Path("{username}")
-    public UserResource get(@PathParam("username") String username);
+    @Path("{id}")
+    UserResource get(@PathParam("id") String id);
 
 }
