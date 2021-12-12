diff --git a/cache/src/main/java/net/runelite/cache/NpcDumper.java b/cache/src/main/java/net/runelite/cache/NpcDumper.java
index 0291182..defea82 100644
--- a/cache/src/main/java/net/runelite/cache/NpcDumper.java
+++ b/cache/src/main/java/net/runelite/cache/NpcDumper.java
@@ -74,7 +74,7 @@
 		File out = new File(args[1]);
 		File java = new File(args[2]);
 
-		ItemDumper dumper = new ItemDumper(cache, out, java);
+		NpcDumper dumper = new NpcDumper(cache, out, java);
 		dumper.load();
 		dumper.dump();
 		dumper.java();
