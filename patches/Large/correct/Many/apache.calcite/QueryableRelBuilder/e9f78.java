diff --git a/src/main/java/net/hydromatic/optiq/prepare/QueryableRelBuilder.java b/src/main/java/net/hydromatic/optiq/prepare/QueryableRelBuilder.java
index 984f77e..bbf90de 100644
--- a/src/main/java/net/hydromatic/optiq/prepare/QueryableRelBuilder.java
+++ b/src/main/java/net/hydromatic/optiq/prepare/QueryableRelBuilder.java
@@ -302,7 +302,7 @@
     public <TKey> Queryable<Grouping<TKey, T>> groupBy(
         Queryable<T> source,
         FunctionExpression<Function1<T, TKey>> keySelector,
-        EqualityComparer<T> comparer)
+        EqualityComparer<TKey> comparer)
     {
         throw new UnsupportedOperationException();
     }
@@ -328,7 +328,7 @@
         Queryable<T> source,
         FunctionExpression<Function1<T, TKey>> keySelector,
         FunctionExpression<Function1<T, TElement>> elementSelector,
-        EqualityComparer<T> comparer)
+        EqualityComparer<TKey> comparer)
     {
         throw new UnsupportedOperationException();
     }
