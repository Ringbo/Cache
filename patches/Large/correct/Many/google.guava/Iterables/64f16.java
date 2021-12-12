diff --git a/guava-gwt/src-super/com/google/common/collect/super/com/google/common/collect/Iterables.java b/guava-gwt/src-super/com/google/common/collect/super/com/google/common/collect/Iterables.java
index f9158a3..1299a62 100644
--- a/guava-gwt/src-super/com/google/common/collect/super/com/google/common/collect/Iterables.java
+++ b/guava-gwt/src-super/com/google/common/collect/super/com/google/common/collect/Iterables.java
@@ -1060,7 +1060,7 @@
    * @since 11.0
    */
   @Beta
-  public static <T> UnmodifiableIterable<T> mergeSorted(
+  public static <T> Iterable<T> mergeSorted(
       final Iterable<? extends Iterable<? extends T>> iterables,
       final Comparator<? super T> comparator) {
     checkNotNull(iterables, "iterables");
