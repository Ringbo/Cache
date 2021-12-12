diff --git a/src/main/java/org/terasology/game/modes/loadProcesses/PrepareLocalWorld.java b/src/main/java/org/terasology/game/modes/loadProcesses/PrepareLocalWorld.java
index d962318..b2934c2 100644
--- a/src/main/java/org/terasology/game/modes/loadProcesses/PrepareLocalWorld.java
+++ b/src/main/java/org/terasology/game/modes/loadProcesses/PrepareLocalWorld.java
@@ -78,7 +78,7 @@
         if (spawningPlayer) {
             spawnZoneEntity = entityManager.create();
             spawnZoneEntity.addComponent(new LocationComponent(new Vector3f(Chunk.SIZE_X / 2, Chunk.SIZE_Y / 2, Chunk.SIZE_Z / 2)));
-            worldRenderer.getChunkProvider().addRegionEntity(spawnZoneEntity, 1);
+            worldRenderer.getChunkProvider().addRegionEntity(spawnZoneEntity, 4);
             targetPos = Vector3i.zero();
         } else {
             CoreRegistry.get(LocalPlayer.class).setEntity(iterator.next());
