diff --git a/test/com/google/javascript/jscomp/StrictModeCheckTest.java b/test/com/google/javascript/jscomp/StrictModeCheckTest.java
index 6f39ba1..bf09cbd 100644
--- a/test/com/google/javascript/jscomp/StrictModeCheckTest.java
+++ b/test/com/google/javascript/jscomp/StrictModeCheckTest.java
@@ -340,7 +340,7 @@
         "}"), StrictModeCheck.ARGUMENTS_CALLER_FORBIDDEN);
   }
 
-  private String inFn(String body) {
+  private static String inFn(String body) {
     return "function func() {" + body + "}";
   }
 }
