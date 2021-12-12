diff --git a/subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java b/subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java
index 922eaae..e161180 100644
--- a/subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java
+++ b/subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java
@@ -324,7 +324,7 @@
     }
 
     private static String getText(BufferedReader reader) throws IOException {
-        StringBuffer answer = new StringBuffer();
+        StringBuilder answer = new StringBuilder();
         // reading the content of the file within a char buffer allow to keep the correct line endings
         char[] charBuffer = new char[4096];
         int nbCharRead = 0;
@@ -350,7 +350,7 @@
     protected void runStatements(Reader reader, PrintStream out)
             throws IOException {
         log.debug("runStatements()");
-        StringBuffer txt = new StringBuffer();
+        StringBuilder txt = new StringBuilder();
         String line = "";
         BufferedReader in = new BufferedReader(reader);
 
@@ -633,7 +633,7 @@
      */
     protected void printResults(PrintStream out) {
         log.debug("printResults()");
-        StringBuffer line = new StringBuffer();
+        StringBuilder line = new StringBuilder();
         out.println(line);
         out.println();
     }
