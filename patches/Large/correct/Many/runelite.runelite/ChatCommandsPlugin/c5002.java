diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/chatcommands/ChatCommandsPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/chatcommands/ChatCommandsPlugin.java
index 1f25355..5c32955 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/chatcommands/ChatCommandsPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/chatcommands/ChatCommandsPlugin.java
@@ -136,7 +136,7 @@
 		chatCommandManager.registerCommandAsync(LEVEL_COMMAND_STRING, this::playerSkillLookup);
 		chatCommandManager.registerCommandAsync(CLUES_COMMAND_STRING, this::clueLookup);
 		chatCommandManager.registerCommandAsync(KILLCOUNT_COMMAND_STRING, this::killCountLookup, this::killCountSubmit);
-		chatCommandManager.registerCommand(QP_COMMAND_STRING, this::questPointsLookup, this::questPointsSubmit);
+		chatCommandManager.registerCommandAsync(QP_COMMAND_STRING, this::questPointsLookup, this::questPointsSubmit);
 	}
 
 	@Override
