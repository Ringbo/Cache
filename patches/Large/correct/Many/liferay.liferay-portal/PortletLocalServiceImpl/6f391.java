diff --git a/portal-ejb/src/com/liferay/portal/service/impl/PortletLocalServiceImpl.java b/portal-ejb/src/com/liferay/portal/service/impl/PortletLocalServiceImpl.java
index 3e72b78..86c47cd 100644
--- a/portal-ejb/src/com/liferay/portal/service/impl/PortletLocalServiceImpl.java
+++ b/portal-ejb/src/com/liferay/portal/service/impl/PortletLocalServiceImpl.java
@@ -116,7 +116,8 @@
 		portletId = PortalUtil.getJsSafePortletName(portletId);
 
 		if (companyId.equals(UserImpl.DEFAULT)) {
-			throw new SystemException();
+			throw new SystemException(
+				"Company id should never be " + UserImpl.DEFAULT);
 		}
 
 		Portlet portlet = null;
