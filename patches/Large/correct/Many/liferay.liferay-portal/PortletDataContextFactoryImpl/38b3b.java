diff --git a/portal-impl/src/com/liferay/portal/lar/PortletDataContextFactoryImpl.java b/portal-impl/src/com/liferay/portal/lar/PortletDataContextFactoryImpl.java
index 6a53f82..548e556 100644
--- a/portal-impl/src/com/liferay/portal/lar/PortletDataContextFactoryImpl.java
+++ b/portal-impl/src/com/liferay/portal/lar/PortletDataContextFactoryImpl.java
@@ -46,10 +46,10 @@
 
 		portletDataContextClone.setCompanyId(portletDataContext.getCompanyId());
 
-		portletDataContext.setCompanyGroupId(
+		portletDataContextClone.setCompanyGroupId(
 			portletDataContext.getCompanyGroupId());
 
-		portletDataContext.setDataStrategy(
+		portletDataContextClone.setDataStrategy(
 			portletDataContext.getDataStrategy());
 
 		portletDataContextClone.setEndDate(portletDataContext.getEndDate());
