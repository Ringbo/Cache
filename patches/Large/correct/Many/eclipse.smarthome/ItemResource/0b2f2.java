diff --git a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/item/ItemResource.java b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/item/ItemResource.java
index 586b465..016fe81 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/item/ItemResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/item/ItemResource.java
@@ -281,7 +281,7 @@
             if (command != null) {
                 logger.debug("Received HTTP POST request at '{}' with value '{}'.", uriInfo.getPath(), value);
                 eventPublisher.post(ItemEventFactory.createCommandEvent(itemname, command));
-                return Response.created(localUriInfo.getAbsolutePathBuilder().path("state").build()).build();
+                return Response.ok().build();
             } else {
                 logger.warn("Received HTTP POST request at '{}' with an invalid status value '{}'.", uriInfo.getPath(),
                         value);
