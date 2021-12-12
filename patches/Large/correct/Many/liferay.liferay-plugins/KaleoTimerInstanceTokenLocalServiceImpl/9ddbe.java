diff --git a/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/service/impl/KaleoTimerInstanceTokenLocalServiceImpl.java b/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/service/impl/KaleoTimerInstanceTokenLocalServiceImpl.java
index 60a8736..3e1438a 100644
--- a/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/service/impl/KaleoTimerInstanceTokenLocalServiceImpl.java
+++ b/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/service/impl/KaleoTimerInstanceTokenLocalServiceImpl.java
@@ -283,7 +283,7 @@
 		SchedulerEventMessageListenerWrapper schedulerEventListenerWrapper =
 			new SchedulerEventMessageListenerWrapper();
 
-		schedulerEventListenerWrapper.setGroupName(groupName);
+		schedulerEventListenerWrapper.setClassName(groupName);
 		schedulerEventListenerWrapper.setMessageListener(timerMessageListener);
 
 		schedulerEventListenerWrapper.afterPropertiesSet();
