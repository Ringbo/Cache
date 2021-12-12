diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPageScanner.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPageScanner.java
index b19a6fd..326e35b 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPageScanner.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/pages/GroovyPageScanner.java
@@ -141,7 +141,7 @@
                     levelTokens.push('}');
                 } else if(c == '(') {
                     levelTokens.push(')');
-                } else if(c == '[') {
+                } else if(c == '[' && !levelTokens.empty()) {
                     levelTokens.push(']');
                 }
                 continue;
