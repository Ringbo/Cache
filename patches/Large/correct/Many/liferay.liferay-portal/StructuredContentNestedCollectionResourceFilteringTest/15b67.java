diff --git a/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java b/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
index 2b37ed6..826772a 100644
--- a/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
+++ b/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
@@ -967,7 +967,7 @@
 			serviceContext);
 
 		PageItems<JournalArticle> pageItems = getPageItems(
-			PaginationRequest.of(10, 1), _group.getGroupId(),
+			PaginationRequest.of(10, 1), _group.getGroupId(), _acceptLanguage,
 			getThemeDisplay(_group, LocaleUtil.getDefault()),
 			new Filter(_filterParser.parse("contains(title,'title')")),
 			Sort.emptySort());
