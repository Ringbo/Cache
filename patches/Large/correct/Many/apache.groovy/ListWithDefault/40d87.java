diff --git a/src/main/groovy/lang/ListWithDefault.java b/src/main/groovy/lang/ListWithDefault.java
index b0d2950..6b87548 100644
--- a/src/main/groovy/lang/ListWithDefault.java
+++ b/src/main/groovy/lang/ListWithDefault.java
@@ -56,7 +56,7 @@
         return initClosure != null ? (Closure) initClosure.clone() : null;
     }
 
-    public static <T> List<T> newInstance(List<T> items, boolean lazyDefaultValues, Closure initClosure) {
+    public static <T> ListWithDefault<T> newInstance(List<T> items, boolean lazyDefaultValues, Closure initClosure) {
         if (items == null)
             throw new IllegalArgumentException("Parameter \"items\" must not be null");
         if (initClosure == null)
@@ -251,7 +251,7 @@
      * @param toIndex   upper endpoint of the subList (exclusive)
      * @return a view of a specified range within this list, keeping all lazy list settings
      */
-    public List<T> subList(int fromIndex, int toIndex) {
+    public ListWithDefault<T> subList(int fromIndex, int toIndex) {
         return new ListWithDefault<T>(delegate.subList(fromIndex, toIndex), lazyDefaultValues, (Closure) initClosure.clone());
     }
 }
