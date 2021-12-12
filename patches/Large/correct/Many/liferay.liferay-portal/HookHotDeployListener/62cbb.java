diff --git a/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java b/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
index 5846147..666b0c0 100644
--- a/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
+++ b/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
@@ -604,7 +604,7 @@
 
 		Locale locale = null;
 
-		if ((x != -1) && (y != 1)) {
+		if ((x != -1) && (y != -1)) {
 			String localeKey = languagePropertiesLocation.substring(x + 1, y);
 
 			locale = LocaleUtil.fromLanguageId(localeKey, true, false);
