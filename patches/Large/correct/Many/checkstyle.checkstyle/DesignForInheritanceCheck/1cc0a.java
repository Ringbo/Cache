diff --git a/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/DesignForInheritanceCheck.java b/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/DesignForInheritanceCheck.java
index 5ff2ae1..88fe07e 100644
--- a/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/DesignForInheritanceCheck.java
+++ b/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/DesignForInheritanceCheck.java
@@ -53,7 +53,7 @@
  * </p>
  *
  * @author lkuehne
- * @version $Revision: 1.3 $
+ * @version $Revision: 1.4 $
  */
 public class DesignForInheritanceCheck extends Check
 {
@@ -75,7 +75,8 @@
         DetailAST modifiers = aAST.findFirstToken(TokenTypes.MODIFIERS);
         if (modifiers.branchContains(TokenTypes.LITERAL_PRIVATE)
             || modifiers.branchContains(TokenTypes.ABSTRACT)
-            || modifiers.branchContains(TokenTypes.FINAL))
+            || modifiers.branchContains(TokenTypes.FINAL)
+            || modifiers.branchContains(TokenTypes.LITERAL_STATIC))
         {
             return;
         }
