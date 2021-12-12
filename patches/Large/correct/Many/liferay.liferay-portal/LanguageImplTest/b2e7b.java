diff --git a/portal-impl/test/integration/com/liferay/portal/language/LanguageImplTest.java b/portal-impl/test/integration/com/liferay/portal/language/LanguageImplTest.java
index d5baad5..5a88a86 100644
--- a/portal-impl/test/integration/com/liferay/portal/language/LanguageImplTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/language/LanguageImplTest.java
@@ -62,7 +62,7 @@
 
 			try {
 				String expectedValue = _languageImpl.format(
-					nullableLocale, _LANG_KEY_WITH_ARGUMENT, "31");
+					defaultLocale, _LANG_KEY_WITH_ARGUMENT, "31");
 				String actualValue = _languageImpl.format(
 					nullableLocale, _LANG_KEY_WITH_ARGUMENT, "31");
 
