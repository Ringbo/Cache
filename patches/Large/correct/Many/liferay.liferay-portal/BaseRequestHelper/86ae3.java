diff --git a/portal-service/src/com/liferay/portal/kernel/display/context/util/BaseRequestHelper.java b/portal-service/src/com/liferay/portal/kernel/display/context/util/BaseRequestHelper.java
index 79acaee..5c24185 100644
--- a/portal-service/src/com/liferay/portal/kernel/display/context/util/BaseRequestHelper.java
+++ b/portal-service/src/com/liferay/portal/kernel/display/context/util/BaseRequestHelper.java
@@ -205,7 +205,7 @@
 		if (_resourcePortletName == null) {
 			String portletResource = getPortletResource();
 
-			if (Validator.isNull(portletResource)) {
+			if (Validator.isNotNull(portletResource)) {
 				_resourcePortletName = portletResource;
 			}
 			else {
