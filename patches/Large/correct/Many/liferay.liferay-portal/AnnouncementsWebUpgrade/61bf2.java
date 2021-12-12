diff --git a/modules/apps/collaboration/announcements/announcements-web/src/main/java/com/liferay/announcements/web/internal/upgrade/AnnouncementsWebUpgrade.java b/modules/apps/collaboration/announcements/announcements-web/src/main/java/com/liferay/announcements/web/internal/upgrade/AnnouncementsWebUpgrade.java
index 045e847..7667d73 100644
--- a/modules/apps/collaboration/announcements/announcements-web/src/main/java/com/liferay/announcements/web/internal/upgrade/AnnouncementsWebUpgrade.java
+++ b/modules/apps/collaboration/announcements/announcements-web/src/main/java/com/liferay/announcements/web/internal/upgrade/AnnouncementsWebUpgrade.java
@@ -90,7 +90,7 @@
 
 		registry.register(
 			"com.liferay.announcements.web", "1.0.1", "1.0.2",
-			new UpgradePermission());
+			new UpgradePermission(true));
 
 		// See LPS-69656
 
