diff --git a/portal-web/test/com/liferay/portalweb/portal/permissions/messageboards/MessageBoardsTests.java b/portal-web/test/com/liferay/portalweb/portal/permissions/messageboards/MessageBoardsTests.java
index 6dd1ba2..7cf6d0bf 100644
--- a/portal-web/test/com/liferay/portalweb/portal/permissions/messageboards/MessageBoardsTests.java
+++ b/portal-web/test/com/liferay/portalweb/portal/permissions/messageboards/MessageBoardsTests.java
@@ -47,7 +47,7 @@
 		testSuite.addTestSuite(MA_DeleteMessageTest.class);
 		testSuite.addTestSuite(MA_DeleteCategoryTest.class);
 		testSuite.addTestSuite(MA_AddCategoryTest.class);
-		testSuite.addTestSuite(MA_AddMessageTest.class);
+		testSuite.addTestSuite(MA_AddThreadTest.class);
 		testSuite.addTestSuite(LogoutTest.class);
 		testSuite.addTestSuite(Member_LoginTest.class);
 		testSuite.addTestSuite(Member_AssertActionsTest.class);
