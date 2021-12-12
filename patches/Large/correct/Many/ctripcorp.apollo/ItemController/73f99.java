diff --git a/apollo-portal/src/main/java/com/ctrip/framework/apollo/openapi/v1/controller/ItemController.java b/apollo-portal/src/main/java/com/ctrip/framework/apollo/openapi/v1/controller/ItemController.java
index 5dff756..8e86980 100644
--- a/apollo-portal/src/main/java/com/ctrip/framework/apollo/openapi/v1/controller/ItemController.java
+++ b/apollo-portal/src/main/java/com/ctrip/framework/apollo/openapi/v1/controller/ItemController.java
@@ -100,7 +100,7 @@
       throw new BadRequestException("user(operator) not exists");
     }
 
-    ItemDTO toDeleteItem = itemService.loadItem(Env.valueOf(env), appId, clusterName, namespaceName, key);
+    ItemDTO toDeleteItem = itemService.loadItem(Env.fromString(env), appId, clusterName, namespaceName, key);
     if (toDeleteItem == null){
       throw new BadRequestException("item not exists");
     }
