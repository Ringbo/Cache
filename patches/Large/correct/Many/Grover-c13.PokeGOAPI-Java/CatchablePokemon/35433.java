diff --git a/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java b/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
index b1a5f5f..ede99f0 100644
--- a/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
+++ b/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
@@ -383,7 +383,7 @@
 		UseItemCaptureMessage reqMsg = UseItemCaptureMessage
 				.newBuilder()
 				.setEncounterId(this.getEncounterId())
-				.setSpawnPointGuid(this.getSpawnPointId())
+				.setSpawnPointId(this.getSpawnPointId())
 				.setItemId(item)
 				.build();
 
