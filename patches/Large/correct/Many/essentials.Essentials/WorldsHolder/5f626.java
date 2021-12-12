diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
index a24e534..234806a 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
@@ -540,7 +540,7 @@
      * @return true if world is loaded or mirrored. false if not listed
      */
     public boolean isInList(String worldName) {
-        if (worldsData.containsKey(worldName.toLowerCase()) || mirrorsGroup.containsKey(worldName.toLowerCase())) {
+        if (worldsData.containsKey(worldName.toLowerCase()) || mirrorsGroup.containsKey(worldName.toLowerCase()) || mirrorsUser.containsKey(worldName.toLowerCase())) {
             return true;
         }
         return false;
