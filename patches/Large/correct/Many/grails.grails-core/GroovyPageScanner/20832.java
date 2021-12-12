diff --git a/src/java/org/codehaus/groovy/grails/web/pages/GroovyPageScanner.java b/src/java/org/codehaus/groovy/grails/web/pages/GroovyPageScanner.java
index 0ad27b4..f019196 100644
--- a/src/java/org/codehaus/groovy/grails/web/pages/GroovyPageScanner.java
+++ b/src/java/org/codehaus/groovy/grails/web/pages/GroovyPageScanner.java
@@ -246,7 +246,7 @@
     private boolean skipComment(char c3, char c4) {
         int ix = end1 + 3;
         for (int ixz = len - 4; ; ix++) {
-            if (ix >= ixz) return false;
+            if (ix > ixz) return false;
             if (text.charAt(ix) == '-' && text.charAt(ix + 1) == '-' && text.charAt(ix + 2) == c3 &&
                     text.charAt(ix + 3) == c4) {
                 break;
