diff --git a/engine/src/main/java/org/terasology/world/internal/EntityAwareWorldProvider.java b/engine/src/main/java/org/terasology/world/internal/EntityAwareWorldProvider.java
index 48096a1..d749919 100644
--- a/engine/src/main/java/org/terasology/world/internal/EntityAwareWorldProvider.java
+++ b/engine/src/main/java/org/terasology/world/internal/EntityAwareWorldProvider.java
@@ -223,7 +223,7 @@
         EntityRef oldEntitySample = oldEntityBuilder.buildWithoutLifecycleEvents();
 
         EntityBuilder newEntityBuilder = entityManager.newBuilder(type.getPrefab());
-        oldEntityBuilder.addComponent(new BlockComponent(type, new Vector3i(blockComponent.getPosition())));
+        newEntityBuilder.addComponent(new BlockComponent(type, new Vector3i(blockComponent.getPosition())));
         EntityRef newEntitySample = newEntityBuilder.buildWithoutLifecycleEvents();
 
         try {
