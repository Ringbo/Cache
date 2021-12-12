diff --git a/portal-impl/src/com/liferay/portal/util/PortalImpl.java b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
index 7c00db1..b2cbc6f 100644
--- a/portal-impl/src/com/liferay/portal/util/PortalImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
@@ -5112,16 +5112,16 @@
 		}
 
 		return getSiteAdministrationURL(
-			request, themeDisplay, portlet.getPortletName());
+			request, themeDisplay, portlet.getPortletId());
 	}
 
 	@Override
 	public PortletURL getSiteAdministrationURL(
 		HttpServletRequest request, ThemeDisplay themeDisplay,
-		String portletName) {
+		String portletId) {
 
 		LiferayPortletURL siteAdministrationURL = PortletURLFactoryUtil.create(
-			request, portletName, themeDisplay.getPlid(),
+			request, portletId, themeDisplay.getPlid(),
 			PortletRequest.RENDER_PHASE);
 
 		siteAdministrationURL.setControlPanelCategory(
@@ -5144,7 +5144,7 @@
 		}
 
 		return getSiteAdministrationURL(
-			portletResponse, themeDisplay, portlet.getPortletName());
+			portletResponse, themeDisplay, portlet.getPortletId());
 	}
 
 	@Override
