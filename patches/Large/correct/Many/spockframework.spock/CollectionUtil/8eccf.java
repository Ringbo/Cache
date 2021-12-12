diff --git a/spock-core/src/main/java/org/spockframework/util/CollectionUtil.java b/spock-core/src/main/java/org/spockframework/util/CollectionUtil.java
index c0b4de1..623ee08 100644
--- a/spock-core/src/main/java/org/spockframework/util/CollectionUtil.java
+++ b/spock-core/src/main/java/org/spockframework/util/CollectionUtil.java
@@ -57,7 +57,7 @@
   public static <T> Iterable<T> reverse(final List<T> list) {
     return new Iterable<T>() {
       public Iterator<T> iterator() {
-        final ListIterator<T> listIterator = list.listIterator();
+        final ListIterator<T> listIterator = list.listIterator(list.size());
 
         return new Iterator<T>() {
           public boolean hasNext() {
