diff --git a/src/main/groovy/groovy/lang/GroovyClassLoader.java b/src/main/groovy/groovy/lang/GroovyClassLoader.java
index 1beecfe..23c63b2 100644
--- a/src/main/groovy/groovy/lang/GroovyClassLoader.java
+++ b/src/main/groovy/groovy/lang/GroovyClassLoader.java
@@ -82,13 +82,6 @@
  * to keep anything like a "class not found" information for that class name.
  * This includes possible parent loaders. Classes that are not cached are always
  * reloaded.
- *
- * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
- * @author Guillaume Laforge
- * @author Steve Goetze
- * @author Bing Ran
- * @author <a href="mailto:scottstirling@rcn.com">Scott Stirling</a>
- * @author <a href="mailto:blackdrag@gmx.org">Jochen Theodorou</a>
  */
 public class GroovyClassLoader extends URLClassLoader {
     private static final URL[] EMPTY_URL_ARRAY = new URL[0];
@@ -103,12 +96,12 @@
      * This cache contains mappings of file name to class. It is used
      * to bypass compilation.
      */
-    protected final StampedCommonCache<String, Class> sourceCache = new StampedCommonCache<String, Class>();
+    protected final EvictableCache<String, Class> sourceCache = new StampedCommonCache<String, Class>();
 
     private final CompilerConfiguration config;
     private String sourceEncoding;
     private Boolean recompile;
-    // use 1000000 as offset to avoid conflicts with names form the GroovyShell
+    // use 1000000 as offset to avoid conflicts with names from the GroovyShell
     private static int scriptNameCounter = 1000000;
 
     private GroovyResourceLoader resourceLoader = new GroovyResourceLoader() {
@@ -321,7 +314,7 @@
      * @return the main class defined in the given script
      */
     public Class parseClass(final GroovyCodeSource codeSource, boolean shouldCacheSource) throws CompilationFailedException {
-        return sourceCache.getAndPut(
+        return ((StampedCommonCache<String, Class>) sourceCache).getAndPut(
                 codeSource.getName(),
                 new EvictableCache.ValueProvider<String, Class>() {
                     @Override
