diff --git a/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java b/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
index 8085ccf..31c650c 100644
--- a/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
@@ -597,7 +597,7 @@
 		String parameter, String defaultValue) {
 
 		return getLocalizationXmlFromPreferences(
-			preferences, portletRequest, parameter, defaultValue, null);
+			preferences, portletRequest, parameter, null, defaultValue);
 	}
 
 	@Override
