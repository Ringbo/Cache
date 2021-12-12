diff --git a/portlets/microblogs-portlet/docroot/WEB-INF/src/com/liferay/microblogs/hook/upgrade/v1_0_0/UpgradeMicroblogsEntry.java b/portlets/microblogs-portlet/docroot/WEB-INF/src/com/liferay/microblogs/hook/upgrade/v1_0_0/UpgradeMicroblogsEntry.java
index dc238ec..05fdae8 100644
--- a/portlets/microblogs-portlet/docroot/WEB-INF/src/com/liferay/microblogs/hook/upgrade/v1_0_0/UpgradeMicroblogsEntry.java
+++ b/portlets/microblogs-portlet/docroot/WEB-INF/src/com/liferay/microblogs/hook/upgrade/v1_0_0/UpgradeMicroblogsEntry.java
@@ -32,8 +32,8 @@
 	}
 
 	protected void updateMicroBlogsEntry() throws Exception {
-		if (tableHasColumn("MicroblogsEntry", "creatorClassNameId") ||
-			tableHasColumn("MicroblogsEntry", "creatorClassPK")) {
+		if (hasColumn("MicroblogsEntry", "creatorClassNameId") ||
+			hasColumn("MicroblogsEntry", "creatorClassPK")) {
 
 			return;
 		}
