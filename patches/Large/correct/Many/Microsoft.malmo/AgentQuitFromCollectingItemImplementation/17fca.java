diff --git a/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/AgentQuitFromCollectingItemImplementation.java b/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/AgentQuitFromCollectingItemImplementation.java
index 2f383bc..547a701 100644
--- a/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/AgentQuitFromCollectingItemImplementation.java
+++ b/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/AgentQuitFromCollectingItemImplementation.java
@@ -45,7 +45,7 @@
         
         this.params = (AgentQuitFromCollectingItem)params;
         this.matchers = new ArrayList<ItemQuitMatcher>();
-        for (BlockOrItemSpecWithDescription bs : this.params.getBlock())
+        for (BlockOrItemSpecWithDescription bs : this.params.getItem())
             this.matchers.add(new ItemQuitMatcher(bs));
         return true;
     }
