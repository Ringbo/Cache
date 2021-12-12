diff --git a/querydsl-core/src/main/java/com/querydsl/core/group/GroupBy.java b/querydsl-core/src/main/java/com/querydsl/core/group/GroupBy.java
index e872a8a..3952bb7 100644
--- a/querydsl-core/src/main/java/com/querydsl/core/group/GroupBy.java
+++ b/querydsl-core/src/main/java/com/querydsl/core/group/GroupBy.java
@@ -304,7 +304,7 @@
      * @param comparator comparator for the created TreeMap instances
      * @return wrapper expression
      */
-    public static <K, V, T> AbstractGroupExpression<Pair<K, V>, SortedMap<T, V>> sortedMap(GroupExpression<K, T> key, Expression<V> value, Comparator<? super K> comparator) {
+    public static <K, V, T> AbstractGroupExpression<Pair<K, V>, SortedMap<T, V>> sortedMap(GroupExpression<K, T> key, Expression<V> value, Comparator<? super T> comparator) {
         return sortedMap(key, new GOne<V>(value), comparator);
     }
 
@@ -316,7 +316,7 @@
      * @param comparator comparator for the created TreeMap instances
      * @return wrapper expression
      */
-    public static <K, V, U> AbstractGroupExpression<Pair<K, V>, SortedMap<K, U>> sortedMap(Expression<K> key, GroupExpression<V, U> value, Comparator<? super U> comparator) {
+    public static <K, V, U> AbstractGroupExpression<Pair<K, V>, SortedMap<K, U>> sortedMap(Expression<K> key, GroupExpression<V, U> value, Comparator<? super K> comparator) {
         return sortedMap(new GOne<K>(key), value, comparator);
     }
 
