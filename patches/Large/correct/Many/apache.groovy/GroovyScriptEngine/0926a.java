diff --git a/src/main/groovy/util/GroovyScriptEngine.java b/src/main/groovy/util/GroovyScriptEngine.java
index d00a8bb..afc4393 100644
--- a/src/main/groovy/util/GroovyScriptEngine.java
+++ b/src/main/groovy/util/GroovyScriptEngine.java
@@ -273,14 +273,15 @@
 
     /**
      * Get the class of the scriptName in question, so that you can instantiate Groovy objects with caching and reloading.
-     * Note: This class is deprecated because we should not use a different parentClassLoader
+     * Note: This method is deprecated because we should not use a different parentClassLoader
      * @param scriptName
      * @return the loaded scriptName as a compiled class
      * @throws ResourceException
      * @throws ScriptException
+     * @deprecated
      */
     public Class loadScriptByName(String scriptName) throws ResourceException, ScriptException {
-        return loadScriptByName( scriptName);
+        return loadScriptByName( scriptName, groovyLoader);
     }
 
 
