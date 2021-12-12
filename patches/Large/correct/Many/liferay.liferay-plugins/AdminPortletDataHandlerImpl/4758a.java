diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/lar/AdminPortletDataHandlerImpl.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/lar/AdminPortletDataHandlerImpl.java
index e9392fa..5f1bcd5 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/lar/AdminPortletDataHandlerImpl.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/admin/lar/AdminPortletDataHandlerImpl.java
@@ -472,8 +472,7 @@
 					portletDataContext.getCompanyId(),
 					CompanyConstants.SYSTEM_STRING,
 					GroupConstants.DEFAULT_PARENT_GROUP_ID,
-					CompanyConstants.SYSTEM, fileName, 0, StringPool.BLANK,
-					serviceContext.getCreateDate(null), serviceContext, bytes);
+					CompanyConstants.SYSTEM, fileName, serviceContext, bytes);
 			}
 
 			dirNames.put(resourcePrimKey, dirName);
