diff --git a/portal-impl/src/com/liferay/portal/portletfilerepository/PortletFileRepositoryImpl.java b/portal-impl/src/com/liferay/portal/portletfilerepository/PortletFileRepositoryImpl.java
index 61722a5..44f65e2 100644
--- a/portal-impl/src/com/liferay/portal/portletfilerepository/PortletFileRepositoryImpl.java
+++ b/portal-impl/src/com/liferay/portal/portletfilerepository/PortletFileRepositoryImpl.java
@@ -398,7 +398,7 @@
 			boolean absoluteURL)
 		throws PortalException, SystemException {
 
-		StringBundler sb = new StringBundler(17);
+		StringBundler sb = new StringBundler(11);
 
 		if (themeDisplay != null) {
 			if (absoluteURL) {
