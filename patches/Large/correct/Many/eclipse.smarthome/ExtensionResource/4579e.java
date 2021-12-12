diff --git a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/extensions/ExtensionResource.java b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/extensions/ExtensionResource.java
index 4177f57..9535b6f 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/extensions/ExtensionResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/extensions/ExtensionResource.java
@@ -160,7 +160,7 @@
                 postFailureEvent(extensionId, e.getMessage());
             }
         });
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @POST
@@ -179,7 +179,7 @@
             return JSONResponse.createErrorResponse(Status.BAD_REQUEST, "The given URL is malformed or not valid.");
         }
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @POST
@@ -196,7 +196,7 @@
                 postFailureEvent(extensionId, e.getMessage());
             }
         });
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     private void postFailureEvent(String extensionId, String msg) {
