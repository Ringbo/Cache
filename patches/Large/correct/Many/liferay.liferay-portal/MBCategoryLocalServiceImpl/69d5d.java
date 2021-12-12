diff --git a/portal-ejb/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java b/portal-ejb/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
index e45fe6c..bf3e073 100644
--- a/portal-ejb/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
+++ b/portal-ejb/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
@@ -280,7 +280,7 @@
 					String content = message.getBody();
 
 					try {
-						Indexer.addMessage(
+						IndexerImpl.addMessage(
 							companyId, groupId, categoryId, threadId, messageId,
 							title, content);
 					}
