diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/api/DetailASTTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/api/DetailASTTest.java
index 9192678..fd4c23e 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/api/DetailASTTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/api/DetailASTTest.java
@@ -129,7 +129,7 @@
         }
     }
 
-    private void checkFile(String filename) throws Exception {
+    private static void checkFile(String filename) throws Exception {
         final FileText text = new FileText(new File(filename),
                            System.getProperty("file.encoding", "UTF-8"));
         final FileContents contents = new FileContents(text);
@@ -139,7 +139,7 @@
         }
     }
 
-    private void checkTree(final DetailAST node,
+    private static void checkTree(final DetailAST node,
                            final DetailAST parent,
                            final DetailAST prev,
                            final String filename,
