diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
index 199c99b..afdb0e1 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
@@ -612,7 +612,7 @@
 				throw new IllegalArgumentException("Users file for world '" + worldName + "' doesnt exist: " + usersFile.getPath());
 			}
 
-			WorldDataHolder tempHolder = new WorldDataHolder(worldName);
+			WorldDataHolder tempHolder = new WorldDataHolder(worldNameLowered);
 
 			// Map the group object for any mirror
 			if (mirrorsGroup.containsKey(worldNameLowered))
