diff --git a/grails-bootstrap/src/main/groovy/grails/build/logging/GrailsConsole.java b/grails-bootstrap/src/main/groovy/grails/build/logging/GrailsConsole.java
index 6f9746d..8297e4d 100644
--- a/grails-bootstrap/src/main/groovy/grails/build/logging/GrailsConsole.java
+++ b/grails-bootstrap/src/main/groovy/grails/build/logging/GrailsConsole.java
@@ -547,7 +547,7 @@
      */
     private String showPrompt(String prompt) {
         try {
-            cursorMove = 1;
+            cursorMove = 0;
             userInputActive = true;
             try {
                 return reader.readLine(prompt);
