diff --git a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/item/ItemResource.java b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/item/ItemResource.java
index 220b18b..4ac6b87 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/item/ItemResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/item/ItemResource.java
@@ -371,7 +371,7 @@
             genericMemberItem.addGroupName(groupItem.getName());
             managedItemProvider.update(genericMemberItem);
 
-            return Response.ok().build();
+            return Response.ok(null, MediaType.TEXT_PLAIN).build();
         } catch (ItemNotFoundException e) {
             return Response.status(Status.NOT_FOUND).build();
         }
@@ -409,7 +409,7 @@
             genericMemberItem.removeGroupName(groupItem.getName());
             managedItemProvider.update(genericMemberItem);
 
-            return Response.ok().build();
+            return Response.ok(null, MediaType.TEXT_PLAIN).build();
         } catch (ItemNotFoundException e) {
             return Response.status(Status.NOT_FOUND).build();
         }
@@ -427,7 +427,7 @@
             return Response.status(Status.NOT_FOUND).build();
         }
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @PUT
@@ -453,7 +453,7 @@
         ((ActiveItem) item).addTag(tag);
         managedItemProvider.update(item);
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @DELETE
@@ -479,7 +479,7 @@
         ((ActiveItem) item).removeTag(tag);
         managedItemProvider.update(item);
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     /**
