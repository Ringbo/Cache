diff --git a/modules/apps/site/site-api/src/main/java/com/liferay/site/util/RecentGroupManager.java b/modules/apps/site/site-api/src/main/java/com/liferay/site/util/RecentGroupManager.java
index 7423a99..7c5e116 100644
--- a/modules/apps/site/site-api/src/main/java/com/liferay/site/util/RecentGroupManager.java
+++ b/modules/apps/site/site-api/src/main/java/com/liferay/site/util/RecentGroupManager.java
@@ -71,7 +71,7 @@
 		for (long groupId : groupIds) {
 			Group group = _groupLocalService.fetchGroup(groupId);
 
-			if (!group.isActive()) {
+			if ((group == null) || !group.isActive()) {
 				continue;
 			}
 
