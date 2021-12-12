diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/specialcounter/Boss.java b/runelite-client/src/main/java/net/runelite/client/plugins/specialcounter/Boss.java
index 1e1ff68..13bdd72 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/specialcounter/Boss.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/specialcounter/Boss.java
@@ -49,7 +49,7 @@
 	private final String name;
 	private final double modifier; // Some NPCs have a modifier to the experience a player receives.
 
-	public static Boss getBoss(String name)
+	static Boss getBoss(String name)
 	{
 		for (Boss boss : values())
 		{
