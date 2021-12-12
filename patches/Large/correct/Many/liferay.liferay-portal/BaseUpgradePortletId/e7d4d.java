diff --git a/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradePortletId.java b/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradePortletId.java
index 164afbf..0303aac 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradePortletId.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradePortletId.java
@@ -414,7 +414,7 @@
 		List<String> actionIds = new ArrayList<>();
 
 		try (PreparedStatement ps = connection.prepareStatement(
-				"select actionId from ResourceAction where name = '" + oldName +
+				"select actionId from ResourceAction where name = '" + newName +
 					"'");
 			ResultSet rs = ps.executeQuery()) {
 
