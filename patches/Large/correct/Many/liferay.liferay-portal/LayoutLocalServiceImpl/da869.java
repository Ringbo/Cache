diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index 1737d2b..de06e48 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -99,6 +99,7 @@
  * The implementation of the layout local service.
  *
  * @author Brian Wing Shun Chan
+ * @author Jorge Ferrer
  * @author Joel Kozikowski
  * @author Charles May
  * @author Raymond Augé
@@ -1627,7 +1628,7 @@
 		String layoutPrototypeUuid = ParamUtil.getString(
 			serviceContext, "layoutPrototypeUuid");
 		boolean layoutPrototypeLinkEnabled = ParamUtil.getBoolean(
-			serviceContext, "layoutPrototypeLinkEnabled", false);
+			serviceContext, "layoutPrototypeLinkEnabled");
 
 		if (Validator.isNotNull(layoutPrototypeUuid)) {
 			layout.setLayoutPrototypeUuid(layoutPrototypeUuid);
