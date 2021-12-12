diff --git a/json-path/src/main/java/com/jayway/jsonpath/internal/PathCompiler.java b/json-path/src/main/java/com/jayway/jsonpath/internal/PathCompiler.java
index d59c171..15775dc 100644
--- a/json-path/src/main/java/com/jayway/jsonpath/internal/PathCompiler.java
+++ b/json-path/src/main/java/com/jayway/jsonpath/internal/PathCompiler.java
@@ -109,7 +109,7 @@
                         break;
                     case PERIOD:
                         i++;
-                        if (path.charAt(i) == PERIOD) {
+                        if ( i < path.length() && path.charAt(i) == PERIOD) {
                             //This is a deep scan
                             fragment = "..";
                             i++;
