diff --git a/library/src/main/java/com/pokegoapi/api/PokemonGo.java b/library/src/main/java/com/pokegoapi/api/PokemonGo.java
index fdd9a49..f7e9e40 100644
--- a/library/src/main/java/com/pokegoapi/api/PokemonGo.java
+++ b/library/src/main/java/com/pokegoapi/api/PokemonGo.java
@@ -167,7 +167,7 @@
 	 * @throws IllegalArgumentException if value exceeds +-180
 	 */
 	public void setLongitude(double value) {
-		if (value > 1800 || value < -180) {
+		if (value > 180 || value < -180) {
 			throw new IllegalArgumentException("longitude can not exceed +/- 180");
 		}
 		longitude = value;
