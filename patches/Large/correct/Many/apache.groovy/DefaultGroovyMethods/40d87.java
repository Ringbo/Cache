diff --git a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
index 664b67c..18a715e 100644
--- a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
@@ -7899,7 +7899,7 @@
      * @see #withEagerDefault(java.util.List, groovy.lang.Closure)
      * @since 1.8.7
      */
-    public static <T> List<T> withDefault(List<T> self, @ClosureParams(value=SimpleType.class, options="int") Closure<T> init) {
+    public static <T> ListWithDefault<T> withDefault(List<T> self, @ClosureParams(value=SimpleType.class, options = "int") Closure<T> init) {
         return withLazyDefault(self, init);
     }
 
@@ -7945,7 +7945,7 @@
      * @return the decorated List
      * @since 1.8.7
      */
-    public static <T> List<T> withLazyDefault(List<T> self, @ClosureParams(value=SimpleType.class, options="int") Closure<T> init) {
+    public static <T> ListWithDefault<T> withLazyDefault(List<T> self, @ClosureParams(value=SimpleType.class, options="int") Closure<T> init) {
         return ListWithDefault.newInstance(self, true, init);
     }
 
@@ -7985,7 +7985,7 @@
      * @return the wrapped List
      * @since 1.8.7
      */
-    public static <T> List<T> withEagerDefault(List<T> self, @ClosureParams(value=SimpleType.class, options="int") Closure<T> init) {
+    public static <T> ListWithDefault<T> withEagerDefault(List<T> self, @ClosureParams(value=SimpleType.class, options="int") Closure<T> init) {
         return ListWithDefault.newInstance(self, false, init);
     }
 
