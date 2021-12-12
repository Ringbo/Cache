diff --git a/src/main/java/net/hydromatic/linq4j/QueryableRecorder.java b/src/main/java/net/hydromatic/linq4j/QueryableRecorder.java
index 3b8e3de..854c05e 100644
--- a/src/main/java/net/hydromatic/linq4j/QueryableRecorder.java
+++ b/src/main/java/net/hydromatic/linq4j/QueryableRecorder.java
@@ -427,7 +427,7 @@
     public <TKey> Queryable<Grouping<TKey, T>> groupBy(
         final Queryable<T> source,
         final FunctionExpression<Function1<T, TKey>> keySelector,
-        final EqualityComparer<T> comparer)
+        final EqualityComparer<TKey> comparer)
     {
         return new NonLeafReplayableQueryable<T>(source) {
             public void replay(QueryableFactory<T> factory) {
@@ -468,7 +468,7 @@
         final Queryable<T> source,
         final FunctionExpression<Function1<T, TKey>> keySelector,
         final FunctionExpression<Function1<T, TElement>> elementSelector,
-        final EqualityComparer<T> comparer)
+        final EqualityComparer<TKey> comparer)
     {
         return new NonLeafReplayableQueryable<T>(source) {
             public void replay(QueryableFactory<T> factory) {
