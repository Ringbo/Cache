diff --git a/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java b/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
index 6da6dca..b5fb8f9 100644
--- a/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/LocalizationImpl.java
@@ -114,7 +114,7 @@
 			return contentDefaultLocale;
 		}
 
-		Locale defaultLocale = LocaleUtil.getDefault();
+		Locale defaultLocale = LocaleUtil.getSiteDefault();
 
 		if (ArrayUtil.contains(contentAvailableLocales, defaultLocale)) {
 			return defaultLocale;
@@ -147,7 +147,7 @@
 
 	@Override
 	public String getDefaultLanguageId(Document document) {
-		return getDefaultLanguageId(document, LocaleUtil.getDefault());
+		return getDefaultLanguageId(document, LocaleUtil.getSiteDefault());
 	}
 
 	@Override
@@ -162,7 +162,7 @@
 
 	@Override
 	public String getDefaultLanguageId(String xml) {
-		return getDefaultLanguageId(xml, LocaleUtil.getDefault());
+		return getDefaultLanguageId(xml, LocaleUtil.getSiteDefault());
 	}
 
 	@Override
@@ -191,7 +191,7 @@
 		String defaultValue) {
 
 		String systemDefaultLanguageId = LocaleUtil.toLanguageId(
-			LocaleUtil.getDefault());
+			LocaleUtil.getSiteDefault());
 
 		if (!Validator.isXml(xml)) {
 			if (useDefault ||
@@ -741,7 +741,7 @@
 		xml = _sanitizeXML(xml);
 
 		String systemDefaultLanguageId = LocaleUtil.toLanguageId(
-			LocaleUtil.getDefault());
+			LocaleUtil.getSiteDefault());
 
 		XMLStreamReader xmlStreamReader = null;
 		XMLStreamWriter xmlStreamWriter = null;
@@ -1137,7 +1137,7 @@
 
 	private String _getDefaultLocalizedName(String name) {
 		String defaultLanguageId = LocaleUtil.toLanguageId(
-			LocaleUtil.getDefault());
+			LocaleUtil.getSiteDefault());
 
 		return getLocalizedName(name, defaultLanguageId);
 	}
