diff --git a/src/com/google/javascript/jscomp/RhinoErrorReporter.java b/src/com/google/javascript/jscomp/RhinoErrorReporter.java
index 978c547..6aa99ac 100644
--- a/src/com/google/javascript/jscomp/RhinoErrorReporter.java
+++ b/src/com/google/javascript/jscomp/RhinoErrorReporter.java
@@ -109,7 +109,7 @@
    * holder {0} with a wild card that matches all possible strings.
    * Also put the any non-place-holder in quotes for regex matching later.
    */
-  private Pattern replacePlaceHolders(String s) {
+  private static Pattern replacePlaceHolders(String s) {
     s = Pattern.quote(s);
     return Pattern.compile(s.replaceAll("\\{\\d+\\}", "\\\\E.*\\\\Q"));
   }
