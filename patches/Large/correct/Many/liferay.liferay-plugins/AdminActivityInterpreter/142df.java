diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/social/AdminActivityInterpreter.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/social/AdminActivityInterpreter.java
index ced954d..9893dd4 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/social/AdminActivityInterpreter.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/social/AdminActivityInterpreter.java
@@ -127,7 +127,7 @@
 			}
 		}
 
-		String articleTitle = getValue(
+		String articleTitle = getJSONValue(
 			activity.getExtraData(), "title", kbArticle.getTitle());
 
 		Object[] titleArguments = {
@@ -210,11 +210,11 @@
 		String entityTitle = null;
 
 		if (kbArticle != null) {
-			entityTitle = getValue(
+			entityTitle = getJSONValue(
 				activity.getExtraData(), "title", kbArticle.getTitle());
 		}
 		else if (kbTemplate != null) {
-			entityTitle = getValue(
+			entityTitle = getJSONValue(
 				activity.getExtraData(), "title", kbTemplate.getTitle());
 		}
 
@@ -284,7 +284,7 @@
 			}
 		}
 
-		String articleTitle = getValue(
+		String articleTitle = getJSONValue(
 			activity.getExtraData(), "title", kbTemplate.getTitle());
 
 		Object[] titleArguments = {creatorUserName, articleTitle, groupName};
