diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/BaseCheckTestSupport.java b/src/test/java/com/puppycrawl/tools/checkstyle/BaseCheckTestSupport.java
index 67f89b8..c3b3ebf 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/BaseCheckTestSupport.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/BaseCheckTestSupport.java
@@ -100,7 +100,7 @@
                 + filename).getCanonicalPath();
     }
 
-    protected void verifyAst(String expectedTextPrintFileName, String actualJavaFileName)
+    protected static void verifyAst(String expectedTextPrintFileName, String actualJavaFileName)
             throws Exception {
         verifyAst(expectedTextPrintFileName, actualJavaFileName, false);
     }
