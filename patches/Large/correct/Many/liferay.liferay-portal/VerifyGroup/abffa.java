diff --git a/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java b/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
index 42dd2b3..44ad3fd 100644
--- a/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
+++ b/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
@@ -247,7 +247,7 @@
 				"false-robots.txt", publicLayoutSetRobots);
 
 			GroupLocalServiceUtil.updateGroup(
-				group.getGroupId(), typeSettingsProperties.toString());
+				group.getGroupId(), typeSettingsProperties.toSortedString());
 		}
 	}
 
@@ -290,7 +290,7 @@
 				"stagedRemotely", Boolean.FALSE.toString());
 
 			GroupLocalServiceUtil.updateGroup(
-				group.getGroupId(), typeSettingsProperties.toString());
+				group.getGroupId(), typeSettingsProperties.toSortedString());
 
 			Group stagingGroup = group.getStagingGroup();
 
