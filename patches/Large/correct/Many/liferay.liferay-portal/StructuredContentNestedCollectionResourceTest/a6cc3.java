diff --git a/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceTest.java b/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceTest.java
index 9c2694a..18cb806 100644
--- a/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceTest.java
+++ b/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceTest.java
@@ -98,7 +98,7 @@
 			null, true, true, serviceContext);
 
 		JournalArticleWrapper journalArticleWrapper = getJournalArticleWrapper(
-			journalArticle.getId(),
+			journalArticle.getResourcePrimKey(),
 			getThemeDisplay(_group, LocaleUtil.getDefault()));
 
 		Assert.assertEquals(
