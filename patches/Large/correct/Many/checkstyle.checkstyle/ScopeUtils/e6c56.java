diff --git a/src/checkstyle/com/puppycrawl/tools/checkstyle/api/ScopeUtils.java b/src/checkstyle/com/puppycrawl/tools/checkstyle/api/ScopeUtils.java
index e409996..491983c 100644
--- a/src/checkstyle/com/puppycrawl/tools/checkstyle/api/ScopeUtils.java
+++ b/src/checkstyle/com/puppycrawl/tools/checkstyle/api/ScopeUtils.java
@@ -115,8 +115,11 @@
              token = token.getParent())
         {
             final int type = token.getType();
-            if (type == TokenTypes.CLASS_DEF) {
-                break; // in a class
+            if (type == TokenTypes.CLASS_DEF
+                || type == TokenTypes.ENUM_DEF
+                || type == TokenTypes.ANNOTATION_DEF)
+            {
+                break; // in a class, enum or annotation
             }
             else if (type == TokenTypes.LITERAL_NEW) {
                 break; // inner implementation
@@ -147,8 +150,11 @@
              token = token.getParent())
         {
             final int type = token.getType();
-            if (type == TokenTypes.CLASS_DEF) {
-                break; // in a class
+            if (type == TokenTypes.CLASS_DEF
+                || type == TokenTypes.ENUM_DEF
+                || type == TokenTypes.INTERFACE_DEF)
+            {
+                break; // in a class, enum or interface
             }
             else if (type == TokenTypes.LITERAL_NEW) {
                 break; // inner implementation
