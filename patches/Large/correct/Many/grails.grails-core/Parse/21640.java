diff --git a/src/web/org/codehaus/groovy/grails/web/pages/Parse.java b/src/web/org/codehaus/groovy/grails/web/pages/Parse.java
index 3c8afc1..8722e90 100644
--- a/src/web/org/codehaus/groovy/grails/web/pages/Parse.java
+++ b/src/web/org/codehaus/groovy/grails/web/pages/Parse.java
@@ -230,7 +230,7 @@
             for (int i = 0; i < lines.length; i++) {
                 String line = lines[i];
                 final String content = escapeGroovy(line);
-                if(!StringUtils.isBlank(content)) {
+                if(!StringUtils.isEmpty(content)) {
                     if(!hasContent) {
                         hasContent = true;
                     }
