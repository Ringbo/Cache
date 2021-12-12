diff --git a/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/RewardForMissionEndImplementation.java b/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/RewardForMissionEndImplementation.java
index d490c8e..7687b99 100755
--- a/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/RewardForMissionEndImplementation.java
+++ b/Minecraft/src/main/java/com/microsoft/Malmo/MissionHandlers/RewardForMissionEndImplementation.java
@@ -78,7 +78,7 @@
                     if (merc.getDescription().equalsIgnoreCase(s))
                     {
                         float this_reward = merc.getReward().floatValue();
-                        float adjusted_reward = adjustAndDistributeReward(this_reward, this.params.getDimension(), merc.getDescription());
+                        float adjusted_reward = adjustAndDistributeReward(this_reward, this.params.getDimension(), merc.getDistribution());
                         reward += adjusted_reward;
                     }
                 }
