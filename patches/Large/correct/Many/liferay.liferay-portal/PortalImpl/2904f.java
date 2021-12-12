diff --git a/portal-impl/src/com/liferay/portal/util/PortalImpl.java b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
index 163ee4f..defd5a6 100644
--- a/portal-impl/src/com/liferay/portal/util/PortalImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
@@ -679,7 +679,9 @@
 	@Override
 	public void addUserLocaleOptionsMessage(HttpServletRequest request) {
 		boolean ignoreUserLocaleOptions = GetterUtil.getBoolean(
-			SessionClicks.get(request.getSession(), "ignoreUserLocaleOptions"));
+			SessionClicks.get(
+				request.getSession(), "ignoreUserLocaleOptions",
+				Boolean.FALSE.toString()));
 
 		if (ignoreUserLocaleOptions) {
 			return;
