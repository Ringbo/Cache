diff --git a/src/main/org/codehaus/groovy/bsf/GroovyEngine.java b/src/main/org/codehaus/groovy/bsf/GroovyEngine.java
index 75ce9d7..3771471 100644
--- a/src/main/org/codehaus/groovy/bsf/GroovyEngine.java
+++ b/src/main/org/codehaus/groovy/bsf/GroovyEngine.java
@@ -129,7 +129,9 @@
      */
     public void exec(String source, int lineNo, int columnNo, Object script) throws BSFException {
         try {
-            shell.run(script.toString(), source, EMPTY_ARGS);
+            // use evaluate to pass in the BSF variables
+            shell.evaluate(script.toString(), source);
+            //shell.run(script.toString(), source, EMPTY_ARGS);
         }
         catch (Exception e) {
             e.printStackTrace();
