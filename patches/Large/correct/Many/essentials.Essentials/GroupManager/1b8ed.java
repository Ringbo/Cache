diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
index 2ad480f..c43c97b 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
@@ -1901,7 +1901,7 @@
 					auxString = auxString.substring(0, auxString.lastIndexOf(","));
 				}
 				if (auxString2.lastIndexOf(",") > 0) {
-					auxString2 = auxString.substring(0, auxString2.lastIndexOf(","));
+					auxString2 = auxString2.substring(0, auxString2.lastIndexOf(","));
 				}
 				sender.sendMessage(ChatColor.YELLOW + "Groups Available: " + ChatColor.WHITE + auxString);
 				sender.sendMessage(ChatColor.YELLOW + "GlobalGroups Available: " + ChatColor.WHITE + auxString2);
