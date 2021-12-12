diff --git a/core/cas-server-core-authentication-attributes/src/main/java/org/apereo/cas/services/ReturnMappedAttributeReleasePolicy.java b/core/cas-server-core-authentication-attributes/src/main/java/org/apereo/cas/services/ReturnMappedAttributeReleasePolicy.java
index 10f809b..bec9614 100644
--- a/core/cas-server-core-authentication-attributes/src/main/java/org/apereo/cas/services/ReturnMappedAttributeReleasePolicy.java
+++ b/core/cas-server-core-authentication-attributes/src/main/java/org/apereo/cas/services/ReturnMappedAttributeReleasePolicy.java
@@ -75,7 +75,7 @@
                                                      final Object attributeValue, final Map<String, Object> resolvedAttributes,
                                                      final Map<String, Object> attributesToRelease) {
         final Matcher matcherInline = ScriptingUtils.getMatcherForInlineGroovyScript(mappedAttributeName);
-        final Matcher matcherFile = ScriptingUtils.getMatcherForInlineGroovyScript(mappedAttributeName);
+        final Matcher matcherFile = ScriptingUtils.getMatcherForExternalGroovyScript(mappedAttributeName);
         if (matcherInline.find()) {
             LOGGER.debug("Mapped attribute [{}] is an inlined groovy script", mappedAttributeName);
             processInlineGroovyAttribute(resolvedAttributes, attributesToRelease, matcherInline, attributeName);
