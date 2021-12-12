diff --git a/portlets/akismet-portlet/docroot/WEB-INF/src/com/liferay/akismet/hook/upgrade/UpgradeProcess_1_0_0.java b/portlets/akismet-portlet/docroot/WEB-INF/src/com/liferay/akismet/hook/upgrade/UpgradeProcess_1_0_0.java
index 52ef0bc..e368e67 100644
--- a/portlets/akismet-portlet/docroot/WEB-INF/src/com/liferay/akismet/hook/upgrade/UpgradeProcess_1_0_0.java
+++ b/portlets/akismet-portlet/docroot/WEB-INF/src/com/liferay/akismet/hook/upgrade/UpgradeProcess_1_0_0.java
@@ -28,7 +28,7 @@
 
 	@Override
 	protected void doUpgrade() throws Exception {
-		if (!tableHasColumn("Akismet_AkismetData", "mbMessageId")) {
+		if (!hasColumn("Akismet_AkismetData", "mbMessageId")) {
 			return;
 		}
 
