diff --git a/common/buildcraft/BuildCraftCore.java b/common/buildcraft/BuildCraftCore.java
index cd70262..f368cf6 100644
--- a/common/buildcraft/BuildCraftCore.java
+++ b/common/buildcraft/BuildCraftCore.java
@@ -480,7 +480,7 @@
 		builderAchievement = new Achievement("achievement.builder", "builderAchievement", 13, 2, BuildCraftBuilders.builderBlock, architectAchievement).registerStat();
         	blueprintAchievement = new Achievement("achievement.blueprint", "blueprintAchievement", 11, 4, BuildCraftBuilders.blueprintItem, architectAchievement).registerStat();
         	templateAchievement = new Achievement("achievement.template", "templateAchievement", 13, 4, BuildCraftBuilders.templateItem, blueprintAchievement).registerStat();
-        	blueprintLibraryAchievement = new Achievement("achievement.blueprintLibrary", "blueprintLibraryAchievement", 15, 2, BuildCraftBuilders.libraryBlock, builderAchievement).registerStat();
+        	libraryAchievement = new Achievement("achievement.blueprintLibrary", "blueprintLibraryAchievement", 15, 2, BuildCraftBuilders.libraryBlock, builderAchievement).registerStat();
 
 		BuildcraftAchievements = new AchievementPage("Buildcraft", woodenGearAchievement, stoneGearAchievement, ironGearAchievement, goldGearAchievement, diamondGearAchievement, wrenchAchievement, engineAchievement1, engineAchievement2, engineAchievement3, aLotOfCraftingAchievement, straightDownAchievement, chunkDestroyerAchievement, fasterFillingAchievement, timeForSomeLogicAchievement, refineAndRedefineAchievement, tinglyLaserAchievement, architectAchievement, builderAchievement, blueprintAchievement, templateAchievement, libraryAchievement);
 		AchievementPage.registerAchievementPage(BuildcraftAchievements);
