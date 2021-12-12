diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
index c6a91c6..8c6b49e 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
@@ -721,7 +721,7 @@
 					auxUser = dataHolder.getUser(args[0]);
 				}
 				// Validating your permissions
-				if (!isConsole && (senderGroup != null ? permissionHandler.inGroup(auxUser.getName(), senderGroup.getName()) : false)) {
+				if (!isConsole && !isOpOverride && (senderGroup != null ? permissionHandler.inGroup(auxUser.getName(), senderGroup.getName()) : false)) {
 					sender.sendMessage(ChatColor.RED + "Can't modify player with same group than you, or higher.");
 					return false;
 				}
@@ -954,7 +954,7 @@
 				}
 				// Validating your permissions
 				permissionResult = permissionHandler.checkFullUserPermission(senderUser, args[1]);
-				if (!isConsole && (permissionResult.resultType.equals(PermissionCheckResult.Type.NOTFOUND) || permissionResult.resultType.equals(PermissionCheckResult.Type.NEGATION))) {
+				if (!isConsole && !isOpOverride && (permissionResult.resultType.equals(PermissionCheckResult.Type.NOTFOUND) || permissionResult.resultType.equals(PermissionCheckResult.Type.NEGATION))) {
 					sender.sendMessage(ChatColor.RED + "You can't add a permission you don't have.");
 					return false;
 				}
@@ -1545,7 +1545,7 @@
 					auxUser = dataHolder.getUser(args[0]);
 				}
 				// Validating permission
-				if (!isConsole && (senderGroup != null ? permissionHandler.inGroup(auxUser.getName(), senderGroup.getName()) : false)) {
+				if (!isConsole && !isOpOverride && (senderGroup != null ? permissionHandler.inGroup(auxUser.getName(), senderGroup.getName()) : false)) {
 					sender.sendMessage(ChatColor.RED + "Can't modify player with same permissions than you, or higher.");
 					return false;
 				}
@@ -1579,7 +1579,7 @@
 					auxUser = dataHolder.getUser(args[0]);
 				}
 				// Validating permission
-				if (!isConsole && (senderGroup != null ? permissionHandler.inGroup(auxUser.getName(), senderGroup.getName()) : false)) {
+				if (!isConsole && !isOpOverride && (senderGroup != null ? permissionHandler.inGroup(auxUser.getName(), senderGroup.getName()) : false)) {
 					sender.sendMessage(ChatColor.RED + "You can't modify a player with same permissions as you, or higher.");
 					return false;
 				}
