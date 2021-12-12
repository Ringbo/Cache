diff --git a/javamelody-core/src/main/java/net/bull/javamelody/I18N.java b/javamelody-core/src/main/java/net/bull/javamelody/I18N.java
index 61fb5c4..9aeb1a2 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/I18N.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/I18N.java
@@ -72,7 +72,7 @@
 	 * Retourne les traductions pour la locale courante.
 	 * @return Locale
 	 */
-	private static ResourceBundle getResourceBundle() {
+	static ResourceBundle getResourceBundle() {
 		final Locale currentLocale = getCurrentLocale();
 		if (Locale.ENGLISH.getLanguage().equals(currentLocale.getLanguage())) {
 			// there is no translations_en.properties because translations.properties is in English
