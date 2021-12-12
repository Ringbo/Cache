diff --git a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
index ce1693f..80291d0 100644
--- a/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
+++ b/EssentialsGroupManager/src/org/anjocaido/groupmanager/dataholder/WorldDataHolder.java
@@ -669,7 +669,7 @@
         ph.removeGroupsChangedFlag();
         // Update the LastModified time.
         ph.groupsFile = groupsFile;
-        ph.setTimeStamps();
+        ph.setTimeStampGroups(groupsFile.lastModified());
 
         //return ph;
     }
@@ -776,7 +776,7 @@
         ph.removeUsersChangedFlag();
         // Update the LastModified time.
         ph.usersFile = usersFile;
-        ph.setTimeStamps();
+        ph.setTimeStampUsers(usersFile.lastModified());
         
         //return ph;
     }
