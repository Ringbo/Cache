diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/i18n/I18n.java b/sonar-plugin-api/src/main/java/org/sonar/api/i18n/I18n.java
index 6e25699..f05288b 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/i18n/I18n.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/i18n/I18n.java
@@ -42,6 +42,6 @@
    * @param parameters   the parameters used to format the message from the translated pattern.
    * @return the message formatted with the translated pattern and the given parameters
    */
-  public abstract String message(final Locale locale, final String key, final String defaultValue, final Object... parameters);
+  String message(final Locale locale, final String key, final String defaultValue, final Object... parameters);
 
 }
