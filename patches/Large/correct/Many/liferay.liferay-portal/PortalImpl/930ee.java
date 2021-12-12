diff --git a/portal-impl/src/com/liferay/portal/util/PortalImpl.java b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
index a246748..367e0e4 100644
--- a/portal-impl/src/com/liferay/portal/util/PortalImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/PortalImpl.java
@@ -853,7 +853,7 @@
 		String[] canonicalURLParts = canonicalURL.split(
 			virtualHost.concat("(:\\d{1,5})?"), 2);
 
-		if ((canonicalURLParts.length > 0) &&
+		if ((canonicalURLParts.length > 1) &&
 			Validator.isNotNull(canonicalURLParts[1])) {
 
 			int pos = canonicalURL.indexOf(
@@ -5624,7 +5624,9 @@
 						virtualHostname = company.getVirtualHostname();
 					}
 
-					if (!virtualHostname.equalsIgnoreCase(_LOCALHOST)) {
+					if (canonicalURL ||
+						!virtualHostname.equalsIgnoreCase(_LOCALHOST)) {
+
 						portalURL = getPortalURL(
 							virtualHostname, themeDisplay.getServerPort(),
 							themeDisplay.isSecure());
