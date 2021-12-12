diff --git a/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasWebAppConfiguration.java b/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasWebAppConfiguration.java
index 3bb1031..70e34ca 100644
--- a/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasWebAppConfiguration.java
+++ b/cas-server-webapp-config/src/main/java/org/apereo/cas/config/CasWebAppConfiguration.java
@@ -70,7 +70,7 @@
             protected Locale determineDefaultLocale(final HttpServletRequest request) {
                 final Locale locale = request.getLocale();
                 if (StringUtils.isBlank(casProperties.getLocale().getDefaultValue())
-                        || locale.getLanguage().equals(casProperties.getLocale().getDefaultValue())) {
+                        || !locale.getLanguage().equals(casProperties.getLocale().getDefaultValue())) {
                     return locale;
                 }
                 return new Locale(casProperties.getLocale().getDefaultValue());
