diff --git a/portal-service/src/com/liferay/portal/kernel/upgrade/v6_2_0/BaseUpgradeAttachments.java b/portal-service/src/com/liferay/portal/kernel/upgrade/v6_2_0/BaseUpgradeAttachments.java
index 07669a4..8f51dde 100644
--- a/portal-service/src/com/liferay/portal/kernel/upgrade/v6_2_0/BaseUpgradeAttachments.java
+++ b/portal-service/src/com/liferay/portal/kernel/upgrade/v6_2_0/BaseUpgradeAttachments.java
@@ -56,7 +56,7 @@
 
 			con = DataAccess.getUpgradeOptimizedConnection();
 
-			StringBundler sb = new StringBundler(10);
+			StringBundler sb = new StringBundler(9);
 
 			sb.append("insert into DLFileEntry (uuid_, fileEntryId, groupId, ");
 			sb.append("companyId, userId, userName, createDate, ");
@@ -270,7 +270,7 @@
 		try {
 			con = DataAccess.getUpgradeOptimizedConnection();
 
-			StringBundler sb = new StringBundler(8);
+			StringBundler sb = new StringBundler(5);
 
 			sb.append("insert into Repository (uuid_, repositoryId, groupId, ");
 			sb.append("companyId, userId, userName, createDate, ");
