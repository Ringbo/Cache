diff --git a/Essentials/src/com/earth2me/essentials/SpawnMob.java b/Essentials/src/com/earth2me/essentials/SpawnMob.java
index cdb00cb..06259b9 100644
--- a/Essentials/src/com/earth2me/essentials/SpawnMob.java
+++ b/Essentials/src/com/earth2me/essentials/SpawnMob.java
@@ -238,15 +238,15 @@
 
 		if (type == EntityType.OCELOT)
 		{
-			if (data.contains("siamese"))
+			if (data.contains("siamese") || data.contains("white"))
 			{
 				((Ocelot)spawned).setCatType(Ocelot.Type.SIAMESE_CAT);
 			}
-			else if (data.contains("red"))
+			else if (data.contains("red") || data.contains("orange") || data.contains("tabby"))
 			{
 				((Ocelot)spawned).setCatType(Ocelot.Type.RED_CAT);
 			}
-			else if (data.contains("black"))
+			else if (data.contains("black") || data.contains("tuxedo"))
 			{
 				((Ocelot)spawned).setCatType(Ocelot.Type.BLACK_CAT);
 			}
