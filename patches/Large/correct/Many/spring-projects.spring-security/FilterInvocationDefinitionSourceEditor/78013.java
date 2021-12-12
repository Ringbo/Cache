diff --git a/core/src/main/java/org/acegisecurity/intercept/web/FilterInvocationDefinitionSourceEditor.java b/core/src/main/java/org/acegisecurity/intercept/web/FilterInvocationDefinitionSourceEditor.java
index 17986da..7e881c2 100644
--- a/core/src/main/java/org/acegisecurity/intercept/web/FilterInvocationDefinitionSourceEditor.java
+++ b/core/src/main/java/org/acegisecurity/intercept/web/FilterInvocationDefinitionSourceEditor.java
@@ -53,7 +53,7 @@
 
         if ((s == null) || "".equals(s)) {
             // Leave target object empty
-            source.setDecorated(new PathBasedFilterInvocationDefinitionMap());
+            source.setDecorated(new RegExpBasedFilterInvocationDefinitionMap());
         } else {
             // Check if we need to override the default definition map
             if (s.lastIndexOf(DIRECTIVE_PATTERN_TYPE_APACHE_ANT) != -1) {
