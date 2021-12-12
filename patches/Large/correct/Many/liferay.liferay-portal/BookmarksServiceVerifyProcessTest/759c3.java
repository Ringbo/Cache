diff --git a/modules/apps/bookmarks/bookmarks-test/test/integration/com/liferay/bookmarks/verify/BookmarksServiceVerifyProcessTest.java b/modules/apps/bookmarks/bookmarks-test/test/integration/com/liferay/bookmarks/verify/BookmarksServiceVerifyProcessTest.java
index 39223f4..1897741 100644
--- a/modules/apps/bookmarks/bookmarks-test/test/integration/com/liferay/bookmarks/verify/BookmarksServiceVerifyProcessTest.java
+++ b/modules/apps/bookmarks/bookmarks-test/test/integration/com/liferay/bookmarks/verify/BookmarksServiceVerifyProcessTest.java
@@ -145,7 +145,7 @@
 
 	@Override
 	protected VerifyProcess getVerifyProcess() {
-		return new VerifyBookmarks();
+		return new BookmarksServiceVerifyProcess();
 	}
 
 	@DeleteAfterTestRun
