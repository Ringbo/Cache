diff --git a/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/activities/portlet/ActivitiesPortlet.java b/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/activities/portlet/ActivitiesPortlet.java
index e653661..48d9238 100644
--- a/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/activities/portlet/ActivitiesPortlet.java
+++ b/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/activities/portlet/ActivitiesPortlet.java
@@ -265,7 +265,7 @@
 				mbMessage = MBMessageServiceUtil.addDiscussionMessage(
 					groupId, className, classPK, className, classPK,
 					themeDisplay.getUserId(), mbThread.getThreadId(),
-					mbRootMessage.getMessageId(), StringPool.BLANK, body,
+					rootMBMessage.getMessageId(), StringPool.BLANK, body,
 					serviceContext);
 			}
 
