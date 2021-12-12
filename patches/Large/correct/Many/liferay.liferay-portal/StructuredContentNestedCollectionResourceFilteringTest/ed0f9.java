diff --git a/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java b/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
index 5c82983..59217e8 100644
--- a/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
+++ b/modules/apps/headless-apio/structured-content/structured-content-apio-test/src/testIntegration/java/com/liferay/structured/content/apio/internal/architect/resource/test/StructuredContentNestedCollectionResourceFilteringTest.java
@@ -438,7 +438,7 @@
 			serviceContext);
 
 		PageItems<JournalArticle> pageItems = getPageItems(
-			PaginationTestUtil.of(10, 1), _group.getGroupId(),
+			PaginationRequest.of(10, 1), _group.getGroupId(),
 			getThemeDisplay(_group, LocaleUtil.getDefault()),
 			new Filter(
 				_filterParser.parse(
@@ -480,7 +480,7 @@
 			serviceContext);
 
 		PageItems<JournalArticle> pageItems = getPageItems(
-			PaginationTestUtil.of(10, 1), _group.getGroupId(),
+			PaginationRequest.of(10, 1), _group.getGroupId(),
 			getThemeDisplay(_group, LocaleUtil.getDefault()),
 			new Filter(
 				_filterParser.parse(
@@ -959,7 +959,7 @@
 			serviceContext);
 
 		PageItems<JournalArticle> pageItems = getPageItems(
-			PaginationTestUtil.of(10, 1), _group.getGroupId(),
+			PaginationRequest.of(10, 1), _group.getGroupId(),
 			getThemeDisplay(_group, LocaleUtil.getDefault()),
 			new Filter(_filterParser.parse("(title lt 'title2')")),
 			Sort.emptySort());
@@ -1272,7 +1272,7 @@
 			serviceContext);
 
 		PageItems<JournalArticle> pageItems = getPageItems(
-			PaginationTestUtil.of(10, 1), _group.getGroupId(),
+			PaginationRequest.of(10, 1), _group.getGroupId(),
 			getThemeDisplay(_group, LocaleUtil.getDefault()),
 			new Filter(_filterParser.parse("(title gt 'title1')")),
 			Sort.emptySort());
