diff --git a/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java b/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
index 3575811..d8596c6 100644
--- a/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
@@ -294,7 +294,7 @@
 		for (Locale locale : locales) {
 			String languageId = LocaleUtil.toLanguageId(locale);
 
-			map.put(locale, getLocalization(xml, languageId));
+			map.put(locale, getLocalization(xml, languageId, false));
 		}
 
 		return map;
