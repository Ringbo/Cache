diff --git a/modules/apps/layout/layout-admin-web/src/main/java/com/liferay/layout/admin/web/internal/display/context/LayoutsAdminDisplayContext.java b/modules/apps/layout/layout-admin-web/src/main/java/com/liferay/layout/admin/web/internal/display/context/LayoutsAdminDisplayContext.java
index f16c73f..8614dc5 100644
--- a/modules/apps/layout/layout-admin-web/src/main/java/com/liferay/layout/admin/web/internal/display/context/LayoutsAdminDisplayContext.java
+++ b/modules/apps/layout/layout-admin-web/src/main/java/com/liferay/layout/admin/web/internal/display/context/LayoutsAdminDisplayContext.java
@@ -1012,7 +1012,8 @@
 				add(
 					dropdownItem -> {
 						dropdownItem.setActive(isPublicPages());
-						dropdownItem.setHref(getPortletURL());
+						dropdownItem.setHref(
+							getPortletURL(), "navigation", "public-pages");
 						dropdownItem.setLabel(
 							LanguageUtil.get(_request, "public-pages"));
 					});
@@ -1020,7 +1021,8 @@
 				add(
 					dropdownItem -> {
 						dropdownItem.setActive(isPrivatePages());
-						dropdownItem.setHref(getPortletURL());
+						dropdownItem.setHref(
+							getPortletURL(), "navigation", "private-pages");
 						dropdownItem.setLabel(
 							LanguageUtil.get(_request, "private-pages"));
 					});
