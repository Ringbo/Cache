diff --git a/src/tck/src/org/codehaus/groovy/tck/ClassicGroovyTestGeneratorHelper.java b/src/tck/src/org/codehaus/groovy/tck/ClassicGroovyTestGeneratorHelper.java
index dd9b955..bbb1496 100644
--- a/src/tck/src/org/codehaus/groovy/tck/ClassicGroovyTestGeneratorHelper.java
+++ b/src/tck/src/org/codehaus/groovy/tck/ClassicGroovyTestGeneratorHelper.java
@@ -48,7 +48,7 @@
         try {
             BufferedReader reader = new BufferedReader(new StringReader(theSrcText));
             String line = null;
-            StringBuffer numberedSrcTextBuffer = new StringBuffer();
+            StringBuilder numberedSrcTextBuffer = new StringBuilder();
             int lineNum = 1;
             while ((line = reader.readLine() ) != null) {
                 numberedSrcTextBuffer.append(lineNum);
@@ -58,7 +58,7 @@
 
                 if (parseException != null) {
                     if (lineNum == parseException.getLine()) {
-                        StringBuffer padding = new StringBuffer("\t");
+                        StringBuilder padding = new StringBuilder("\t");
                         for (int col=1; col<parseException.getColumn();col++) {
                             padding.append(" ");
                         }
