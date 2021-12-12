diff --git a/portal-impl/test/integration/com/liferay/portlet/journal/service/JournalArticleServiceTest.java b/portal-impl/test/integration/com/liferay/portlet/journal/service/JournalArticleServiceTest.java
index 1cb30c4..722ccda 100644
--- a/portal-impl/test/integration/com/liferay/portlet/journal/service/JournalArticleServiceTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/journal/service/JournalArticleServiceTest.java
@@ -536,7 +536,7 @@
 		return JournalArticleLocalServiceUtil.searchCount(
 			TestPropsValues.getCompanyId(), _group.getGroupId(), folderIds,
 			JournalArticleConstants.CLASSNAME_ID_DEFAULT, null, null, null,
-			null, keyword, "general", "", "", null, null, status, null, true);
+			null, keyword, "", "", null, null, status, null, true);
 	}
 
 	protected List<JournalArticle> createArticlesWithKeyword(int count)
@@ -592,7 +592,7 @@
 		return JournalArticleLocalServiceUtil.search(
 			TestPropsValues.getCompanyId(), _group.getGroupId(), folderIds,
 			JournalArticleConstants.CLASSNAME_ID_DEFAULT, null, null, null,
-			null, keyword, "general", "", "", null, null, status, null, false,
+			null, keyword, "", "", null, null, status, null, false,
 			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
 	}
 
