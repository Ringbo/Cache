diff --git a/runelite-api/src/main/java/net/runelite/api/Actor.java b/runelite-api/src/main/java/net/runelite/api/Actor.java
index 62c96a7..311c3e7 100644
--- a/runelite-api/src/main/java/net/runelite/api/Actor.java
+++ b/runelite-api/src/main/java/net/runelite/api/Actor.java
@@ -58,14 +58,12 @@
 			return null;
 		}
 
-		// logic taken from runeloader.
-		if (i < 32767)
+		if (i < 0x8000)
 		{
 			return client.getNpcs()[i];
 		}
 
-		// XXX is this correct for i = 32767 ?
-		i = i - 32767 - 1;
+		i -= 0x8000;
 		return client.getPlayers()[i];
 	}
 
