diff --git a/modules/apps/microblogs/microblogs-service/src/main/java/com/liferay/microblogs/upgrade/v1_0_0/UpgradeMicroblogsEntry.java b/modules/apps/microblogs/microblogs-service/src/main/java/com/liferay/microblogs/upgrade/v1_0_0/UpgradeMicroblogsEntry.java
index a5f5f2a..2cc42fa 100644
--- a/modules/apps/microblogs/microblogs-service/src/main/java/com/liferay/microblogs/upgrade/v1_0_0/UpgradeMicroblogsEntry.java
+++ b/modules/apps/microblogs/microblogs-service/src/main/java/com/liferay/microblogs/upgrade/v1_0_0/UpgradeMicroblogsEntry.java
@@ -29,8 +29,8 @@
 	}
 
 	protected void updateMicroBlogsEntry() throws Exception {
-		if (tableHasColumn("MicroblogsEntry", "creatorClassNameId") ||
-			tableHasColumn("MicroblogsEntry", "creatorClassPK")) {
+		if (hasColumn("MicroblogsEntry", "creatorClassNameId") ||
+			hasColumn("MicroblogsEntry", "creatorClassPK")) {
 
 			return;
 		}
