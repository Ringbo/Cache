diff --git a/portal-impl/src/com/liferay/portal/lar/messaging/LayoutsRemotePublisherMessageListener.java b/portal-impl/src/com/liferay/portal/lar/messaging/LayoutsRemotePublisherMessageListener.java
index 5a73249..6aa6928 100644
--- a/portal-impl/src/com/liferay/portal/lar/messaging/LayoutsRemotePublisherMessageListener.java
+++ b/portal-impl/src/com/liferay/portal/lar/messaging/LayoutsRemotePublisherMessageListener.java
@@ -82,7 +82,7 @@
 
 		initThreadLocals(userId, parameterMap);
 
-		User user = UserLocalServiceUtil.fetchUserById(userId);
+		User user = UserLocalServiceUtil.getUserById(userId);
 
 		CompanyThreadLocal.setCompanyId(user.getCompanyId());
 
