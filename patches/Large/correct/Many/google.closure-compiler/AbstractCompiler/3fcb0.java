diff --git a/src/com/google/javascript/jscomp/AbstractCompiler.java b/src/com/google/javascript/jscomp/AbstractCompiler.java
index fbdc146..994bc39 100644
--- a/src/com/google/javascript/jscomp/AbstractCompiler.java
+++ b/src/com/google/javascript/jscomp/AbstractCompiler.java
@@ -184,7 +184,7 @@
   /**
    * Report an internal error.
    */
-  abstract void throwInternalError(String msg, Exception cause);
+  abstract void throwInternalError(String msg, Throwable cause);
 
   /**
    * Gets the current coding convention.
@@ -590,13 +590,13 @@
 
    /**
     * Stores a map of default @define values.  These values
-    * can be overriden by values specifically set in the CompilerOptions.
+    * can be overridden by values specifically set in the CompilerOptions.
     */
    abstract void setDefaultDefineValues(ImmutableMap<String, Node> values);
 
    /**
     * Gets a map of default @define values.  These values
-    * can be overriden by values specifically set in the CompilerOptions.
+    * can be overridden by values specifically set in the CompilerOptions.
     */
    abstract ImmutableMap<String, Node> getDefaultDefineValues();
 
