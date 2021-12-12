diff --git a/src/main/java/com/pokegoapi/api/map/fort/Pokestop.java b/src/main/java/com/pokegoapi/api/map/fort/Pokestop.java
index 233a667..3383fd8 100644
--- a/src/main/java/com/pokegoapi/api/map/fort/Pokestop.java
+++ b/src/main/java/com/pokegoapi/api/map/fort/Pokestop.java
@@ -188,7 +188,7 @@
 	 */
 	@Deprecated
 	public boolean hasLurePokemon() {
-		return fortData.hasLureInfo() && fortData.getLureInfo().getLureExpiresTimestampMs() < api.currentTimeMillis();
+		return fortData.hasLureInfo() && fortData.getLureInfo().getLureExpiresTimestampMs() > api.currentTimeMillis();
 	}
 
 	/**
