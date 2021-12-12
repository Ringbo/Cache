diff --git a/portal-impl/src/com/liferay/portlet/journal/service/impl/JournalArticleLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/journal/service/impl/JournalArticleLocalServiceImpl.java
index cc60eb9..32cf676 100644
--- a/portal-impl/src/com/liferay/portlet/journal/service/impl/JournalArticleLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/journal/service/impl/JournalArticleLocalServiceImpl.java
@@ -6305,7 +6305,7 @@
 		}
 
 		subscriptionSender.addPersistedSubscribers(
-			JournalFolder.class.getName(), article.getGroupId());
+			JournalArticle.class.getName(), article.getGroupId());
 
 		subscriptionSender.flushNotificationsAsync();
 	}
