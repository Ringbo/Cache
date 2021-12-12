diff --git a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
index 840c467..1f6877c 100644
--- a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
@@ -6321,7 +6321,7 @@
      * @see #toMapString(Map)
      * @since 1.0
      */
-    public static String toString(Map self) {
+    public static String toString(AbstractMap self) {
         return toMapString(self);
     }
 
@@ -6347,7 +6347,7 @@
      * @see #toListString(Collection)
      * @since 1.0
      */
-    public static String toString(Collection self) {
+    public static String toString(AbstractCollection self) {
         return toListString(self);
     }
 
