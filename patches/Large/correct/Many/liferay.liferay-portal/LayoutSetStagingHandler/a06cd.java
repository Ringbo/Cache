diff --git a/portal-service/src/com/liferay/portal/model/LayoutSetStagingHandler.java b/portal-service/src/com/liferay/portal/model/LayoutSetStagingHandler.java
index ab874c9..b336f28 100644
--- a/portal-service/src/com/liferay/portal/model/LayoutSetStagingHandler.java
+++ b/portal-service/src/com/liferay/portal/model/LayoutSetStagingHandler.java
@@ -122,7 +122,7 @@
 		ServiceContext serviceContext =
 			ServiceContextThreadLocal.getServiceContext();
 
-		if (!serviceContext.isSignedIn()) {
+		if ((serviceContext == null) || !serviceContext.isSignedIn()) {
 			return null;
 		}
 
