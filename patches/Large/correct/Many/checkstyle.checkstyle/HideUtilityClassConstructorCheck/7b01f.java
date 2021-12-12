diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/HideUtilityClassConstructorCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/HideUtilityClassConstructorCheck.java
index a610765..eb3dc09 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/HideUtilityClassConstructorCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/HideUtilityClassConstructorCheck.java
@@ -127,7 +127,7 @@
         /** c-tor
          * @param ast class ast
          * */
-        public Details(DetailAST ast) {
+        Details(DetailAST ast) {
             this.ast = ast;
         }
 
