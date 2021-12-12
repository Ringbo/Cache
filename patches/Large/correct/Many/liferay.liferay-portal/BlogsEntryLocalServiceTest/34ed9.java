diff --git a/modules/apps/collaboration/blogs/blogs-test/src/testIntegration/java/com/liferay/blogs/service/test/BlogsEntryLocalServiceTest.java b/modules/apps/collaboration/blogs/blogs-test/src/testIntegration/java/com/liferay/blogs/service/test/BlogsEntryLocalServiceTest.java
index 0cd15ea..64f158b 100644
--- a/modules/apps/collaboration/blogs/blogs-test/src/testIntegration/java/com/liferay/blogs/service/test/BlogsEntryLocalServiceTest.java
+++ b/modules/apps/collaboration/blogs/blogs-test/src/testIntegration/java/com/liferay/blogs/service/test/BlogsEntryLocalServiceTest.java
@@ -656,7 +656,7 @@
 	}
 
 	@Test
-	public void testURLTitleIsNotSavedWhenAddingDraftEntry() throws Exception {
+	public void testURLTitleIsSavedWhenAddingDraftEntry() throws Exception {
 		ServiceContext serviceContext =
 			ServiceContextTestUtil.getServiceContext(_group, _user.getUserId());
 
@@ -666,11 +666,11 @@
 			_user.getUserId(), RandomTestUtil.randomString(),
 			RandomTestUtil.randomString(), serviceContext);
 
-		Assert.assertTrue(Validator.isNull(entry.getUrlTitle()));
+		Assert.assertTrue(Validator.isNotNull(entry.getUrlTitle()));
 	}
 
 	@Test
-	public void testURLTitleIsNotSavedWhenAddingDraftEntryWithWorkflow()
+	public void testURLTitleIsSavedWhenAddingDraftEntryWithWorkflow()
 		throws Exception {
 
 		ServiceContext serviceContext =
@@ -680,7 +680,7 @@
 			_user.getUserId(), RandomTestUtil.randomString(), false,
 			serviceContext);
 
-		Assert.assertTrue(Validator.isNull(entry.getUrlTitle()));
+		Assert.assertTrue(Validator.isNotNull(entry.getUrlTitle()));
 	}
 
 	@Test
