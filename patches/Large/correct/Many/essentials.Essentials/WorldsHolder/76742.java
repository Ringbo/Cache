diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
index bf7b290..6544bb1 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/worlds/WorldsHolder.java
@@ -200,8 +200,8 @@
             	//Check for newer file as no local changes.
             	if (w.getTimeStampGroups() < w.getGroupsFile().lastModified()) {
             		System.out.print("Newer Groups file found (Loading changes)!");
-            		// Backup Users file
-	            	backupFile(w,false);
+            		// Backup Groups file
+	            	backupFile(w,true);
             		w.reloadGroups();
             	}
             }
