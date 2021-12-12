diff --git a/portal-impl/test/integration/com/liferay/portlet/journal/service/persistence/JournalArticleFinderTest.java b/portal-impl/test/integration/com/liferay/portlet/journal/service/persistence/JournalArticleFinderTest.java
index 26ecda5..50a9dbd 100644
--- a/portal-impl/test/integration/com/liferay/portlet/journal/service/persistence/JournalArticleFinderTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/journal/service/persistence/JournalArticleFinderTest.java
@@ -386,7 +386,7 @@
 		int actualCount =
 			JournalArticleFinderUtil.countByC_G_F_C_A_V_T_D_C_T_S_T_D_R(
 				companyId, groupId, folderIds, classNameId, articleId, version,
-				title, description, content, type, ddmStructureKey,
+				title, description, content, ddmStructureKey,
 				ddmTemplateKey, displayDateGT, displayDateLT, reviewDate,
 				andOperator, queryDefinition);
 
@@ -395,7 +395,7 @@
 		List<JournalArticle> articles =
 			JournalArticleFinderUtil.findByC_G_F_C_A_V_T_D_C_T_S_T_D_R(
 				companyId, groupId, folderIds, classNameId, articleId, version,
-				title, description, content, type, ddmStructureKey,
+				title, description, content, ddmStructureKey,
 				ddmTemplateKey, displayDateGT, displayDateLT, reviewDate,
 				andOperator, queryDefinition);
 
