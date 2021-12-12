diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
index fbe0378..0e7f56d 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/GroupManager.java
@@ -56,7 +56,7 @@
 	private Runnable commiter;
 	private ScheduledThreadPoolExecutor scheduler;
 	private Map<String, ArrayList<User>> overloadedUsers = new HashMap<String, ArrayList<User>>();
-	private Map<CommandSender, String> selectedWorlds = new HashMap<CommandSender, String>();
+	private Map<String, String> selectedWorlds = new HashMap<String, String>();
 	private WorldsHolder worldsHolder;
 	private boolean validateOnlinePlayer = true;
 	
@@ -142,7 +142,7 @@
 			 * reset local variables.
 			 */
 			overloadedUsers = new HashMap<String, ArrayList<User>>();
-			selectedWorlds = new HashMap<CommandSender, String>();
+			selectedWorlds = new HashMap<String, String>();
 			lastError = "";
 			
 			/*
@@ -431,7 +431,7 @@
 			dataHolder = worldsHolder.getWorldData(senderPlayer);
 		}
 
-		String selectedWorld = selectedWorlds.get(sender);
+		String selectedWorld = selectedWorlds.get(sender.getName());
 		if (selectedWorld != null) {
 			dataHolder = worldsHolder.getWorldData(selectedWorld);
 		}
@@ -1950,7 +1950,7 @@
 				}
 				return true;
 			case manworld:
-				auxString = selectedWorlds.get(sender);
+				auxString = selectedWorlds.get(sender.getName());
 				if (auxString != null) {
 					sender.sendMessage(ChatColor.YELLOW + "You have the world '" + dataHolder.getName() + "' in your selection.");
 				} else {
@@ -1993,7 +1993,7 @@
 				}
 				dataHolder = worldsHolder.getWorldData(auxString);
 				permissionHandler = dataHolder.getPermissionsHandler();
-				selectedWorlds.put(sender, dataHolder.getName());
+				selectedWorlds.put(sender.getName(), dataHolder.getName());
 				sender.sendMessage(ChatColor.YELLOW + "You have selected world '" + dataHolder.getName() + "'.");
 
 				return true;
@@ -2061,7 +2061,7 @@
 		permissionHandler = dataHolder.getPermissionsHandler();
 
 		if ((dataHolder != null) && (permissionHandler != null)) {
-			selectedWorlds.put(sender, dataHolder.getName());
+			selectedWorlds.put(sender.getName(), dataHolder.getName());
 			sender.sendMessage(ChatColor.RED + "Couldn't retrieve your world. Default world '" + worldsHolder.getDefaultWorld().getName() + "' selected.");
 			return true;
 		}
