diff --git a/portal-impl/test/integration/com/liferay/portlet/journal/search/JournalArticleSearchTest.java b/portal-impl/test/integration/com/liferay/portlet/journal/search/JournalArticleSearchTest.java
index 7313ce9..f5a477d 100644
--- a/portal-impl/test/integration/com/liferay/portlet/journal/search/JournalArticleSearchTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/journal/search/JournalArticleSearchTest.java
@@ -108,7 +108,7 @@
 		}
 
 		return JournalTestUtil.addArticleWithWorkflow(
-			folder.getGroupId(), folderId, keywords, keywords, approved,
+			group.getGroupId(), folderId, keywords, keywords, approved,
 			serviceContext);
 	}
 
