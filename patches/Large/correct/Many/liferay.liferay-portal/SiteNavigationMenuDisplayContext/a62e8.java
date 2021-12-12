diff --git a/modules/apps/web-experience/site-navigation/site-navigation-menu-web/src/main/java/com/liferay/site/navigation/menu/web/internal/display/context/SiteNavigationMenuDisplayContext.java b/modules/apps/web-experience/site-navigation/site-navigation-menu-web/src/main/java/com/liferay/site/navigation/menu/web/internal/display/context/SiteNavigationMenuDisplayContext.java
index dcc8c84..6053e1e 100644
--- a/modules/apps/web-experience/site-navigation/site-navigation-menu-web/src/main/java/com/liferay/site/navigation/menu/web/internal/display/context/SiteNavigationMenuDisplayContext.java
+++ b/modules/apps/web-experience/site-navigation/site-navigation-menu-web/src/main/java/com/liferay/site/navigation/menu/web/internal/display/context/SiteNavigationMenuDisplayContext.java
@@ -323,7 +323,7 @@
 		_navigationMenuType = ParamUtil.getInteger(
 			_request, "siteNavigationMenuType",
 			_siteNavigationMenuPortletInstanceConfiguration.
-				navigationMenuType());
+				siteNavigationMenuType());
 
 		return _navigationMenuType;
 	}
