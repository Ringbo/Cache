diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
index a6312ae..f2a43d1 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
@@ -155,7 +155,7 @@
 		// Search for a LastName match
 		for (User usr : getUserList()) {
 			
-			if (usr.getLastName().equalsIgnoreCase(currentName) && !usr.getUUID().equalsIgnoreCase(usr.getLastName())) {
+			if (usr.getLastName().equalsIgnoreCase(currentName) && usr.getUUID().equalsIgnoreCase(usr.getLastName())) {
 				
 				// Clone this user so we can set it's uUID
 				user = usr.clone(uUID, currentName);
