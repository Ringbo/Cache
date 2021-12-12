diff --git a/engine/src/main/java/org/terasology/logic/players/FirstPersonClientSystem.java b/engine/src/main/java/org/terasology/logic/players/FirstPersonClientSystem.java
index 672d41e..b134d37 100644
--- a/engine/src/main/java/org/terasology/logic/players/FirstPersonClientSystem.java
+++ b/engine/src/main/java/org/terasology/logic/players/FirstPersonClientSystem.java
@@ -206,7 +206,7 @@
         // ensure that there are no lingering items that are marked as still held. This situation happens with client side predicted items
         for (EntityRef entityRef : entityManager.getEntitiesWith(ItemIsHeldComponent.class)) {
             if (!entityRef.equals(currentHeldItem) && !entityRef.equals(handEntity)) {
-                entityRef.removeComponent(ItemIsHeldComponent.class);
+                entityRef.destroy();
             }
         }
 
