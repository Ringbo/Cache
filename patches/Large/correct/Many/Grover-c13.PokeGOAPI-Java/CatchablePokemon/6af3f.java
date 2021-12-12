diff --git a/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java b/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
index ef773ba..221f1ef 100644
--- a/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
+++ b/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
@@ -267,7 +267,7 @@
 	public CatchResult catchPokemon(Pokeball pokeball, int amount, int razberryLimit)
 			throws LoginFailedException, RemoteServerException {
 		return catchPokemon(1.0, 1.95 + Math.random() * 0.05,
-				0.85 + Math.random() * 0.15, pokeball, razberryLimit);
+				0.85 + Math.random() * 0.15, pokeball,amount, razberryLimit);
 	}
 
 	/**
