diff --git a/portal-impl/src/com/liferay/portal/lar/PortletDataContextImpl.java b/portal-impl/src/com/liferay/portal/lar/PortletDataContextImpl.java
index 7e5b7ce..dcbf937 100644
--- a/portal-impl/src/com/liferay/portal/lar/PortletDataContextImpl.java
+++ b/portal-impl/src/com/liferay/portal/lar/PortletDataContextImpl.java
@@ -293,11 +293,11 @@
 	}
 
 	public String getImportLayoutPath(long layoutId) {
-		return getImportGroupId() + ROOT_PATH_LAYOUTS + layoutId;
+		return getImportRootPath() + ROOT_PATH_LAYOUTS + layoutId;
 	}
 
 	public String getImportPortletPath(String portletId) {
-		return getImportGroupId() + ROOT_PATH_PORTLETS + portletId;
+		return getImportRootPath() + ROOT_PATH_PORTLETS + portletId;
 	}
 
 	public String getImportRootPath() {
