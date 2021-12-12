diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/cluescrolls/ClueScrollPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/cluescrolls/ClueScrollPlugin.java
index 9b3a00e..02a0b6f 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/cluescrolls/ClueScrollPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/cluescrolls/ClueScrollPlugin.java
@@ -163,7 +163,7 @@
 
 			if (objectId != -1)
 			{
-				GameObjectQuery query = new GameObjectQuery().idEquals();
+				GameObjectQuery query = new GameObjectQuery().idEquals(objectId);
 				objectsToMark = queryRunner.runQuery(query);
 			}
 		}
