diff --git a/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java b/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
index cfdd822..1814b15 100644
--- a/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
+++ b/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
@@ -387,7 +387,7 @@
 				_filterParser.parse(
 					String.format(
 						"(datePublished eq %s)",
-						ISO8601Utils.format(journalArticle.getCreateDate())))),
+						ISO8601Utils.format(journalArticle.getDisplayDate())))),
 			Sort.emptySort());
 
 		Assert.assertEquals(1, pageItems.getTotalCount());
