diff --git a/portal-service/src/com/liferay/portal/kernel/util/LocaleUtil.java b/portal-service/src/com/liferay/portal/kernel/util/LocaleUtil.java
index 0f6592a..910fbb1 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/LocaleUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/LocaleUtil.java
@@ -257,7 +257,7 @@
 				}
 			}
 
-			if (validate && !LanguageUtil.isAvailableLanguageCode(languageId)) {
+			if (validate && !LanguageUtil.isAvailableLocale(languageId)) {
 				throw new IllegalArgumentException("Invalid locale " + locale);
 			}
 
