diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
index c43c97b..08cfd2f 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
@@ -675,7 +675,7 @@
 				}
 				auxGroup = dataHolder.getGroup(args[0]);
 				if (auxGroup != null) {
-					sender.sendMessage(ChatColor.RED + "'" + args[0] + "' Group already exist!");
+					sender.sendMessage(ChatColor.RED + "'" + args[0] + "' Group already exists!");
 					return true;
 				}
 				// Seems OK
@@ -697,7 +697,7 @@
 				}
 				auxGroup = dataHolder.getGroup(args[0]);
 				if (auxGroup == null) {
-					sender.sendMessage(ChatColor.RED + "" + args[0] + " Group doesnt exist!");
+					sender.sendMessage(ChatColor.RED + "'" + args[0] + "' Group doesnt exist!");
 					return true;
 				}
 				// Seems OK
@@ -1929,7 +1929,7 @@
 				}
 				auxGroup = dataHolder.getGroup(args[1]);
 				if (auxGroup == null) {
-					sender.sendMessage(ChatColor.RED + "'" + args[0] + "' Group doesnt exist!");
+					sender.sendMessage(ChatColor.RED + "'" + args[1] + "' Group doesnt exist!");
 					return true;
 				}
 				if (auxGroup.isGlobal()) {
@@ -1985,7 +1985,7 @@
 				}
 				auxGroup = dataHolder.getGroup(args[1]);
 				if (auxGroup == null) {
-					sender.sendMessage(ChatColor.RED + "'" + args[0] + "' Group doesnt exist!");
+					sender.sendMessage(ChatColor.RED + "'" + args[1] + "' Group doesnt exist!");
 					return true;
 				}
 				if (auxGroup.isGlobal()) {
