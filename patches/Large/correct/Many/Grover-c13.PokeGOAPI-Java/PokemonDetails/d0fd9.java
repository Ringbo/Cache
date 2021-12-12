diff --git a/library/src/main/java/com/pokegoapi/api/pokemon/PokemonDetails.java b/library/src/main/java/com/pokegoapi/api/pokemon/PokemonDetails.java
index 254c60a..f4b6c5a 100644
--- a/library/src/main/java/com/pokegoapi/api/pokemon/PokemonDetails.java
+++ b/library/src/main/java/com/pokegoapi/api/pokemon/PokemonDetails.java
@@ -340,7 +340,7 @@
 		if (asList(VAPOREON, JOLTEON, FLAREON).contains(getPokemonId())) {
 			return getCp();
 		}
-		PokemonIdOuterClass.PokemonId highestUpgradedFamily = PokemonMetaRegistry.getHightestForFamily(getPokemonFamily());
+		PokemonIdOuterClass.PokemonId highestUpgradedFamily = PokemonMetaRegistry.getHighestForFamily(getPokemonFamily());
 		if (getPokemonId() == highestUpgradedFamily) {
 			return getCp();
 		}
