diff --git a/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java b/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
index 44ad3fd..42dd2b3 100644
--- a/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
+++ b/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
@@ -247,7 +247,7 @@
 				"false-robots.txt", publicLayoutSetRobots);
 
 			GroupLocalServiceUtil.updateGroup(
-				group.getGroupId(), typeSettingsProperties.toSortedString());
+				group.getGroupId(), typeSettingsProperties.toString());
 		}
 	}
 
@@ -290,7 +290,7 @@
 				"stagedRemotely", Boolean.FALSE.toString());
 
 			GroupLocalServiceUtil.updateGroup(
-				group.getGroupId(), typeSettingsProperties.toSortedString());
+				group.getGroupId(), typeSettingsProperties.toString());
 
 			Group stagingGroup = group.getStagingGroup();
 
