diff --git a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/link/ItemChannelLinkResource.java b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/link/ItemChannelLinkResource.java
index f92de82..8f5b48c 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/link/ItemChannelLinkResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/link/ItemChannelLinkResource.java
@@ -116,7 +116,7 @@
         } else {
             itemChannelLinkRegistry.update(link);
         }
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @DELETE
@@ -136,7 +136,7 @@
         ItemChannelLink result = itemChannelLinkRegistry
                 .remove(AbstractLink.getIDFor(itemName, new ChannelUID(channelUid)));
         if (result != null) {
-            return Response.ok().build();
+            return Response.ok(null, MediaType.TEXT_PLAIN).build();
         } else {
             return JSONResponse.createErrorResponse(Status.METHOD_NOT_ALLOWED, "Channel is read-only.");
         }
