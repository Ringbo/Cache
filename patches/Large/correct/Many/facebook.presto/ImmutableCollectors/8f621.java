diff --git a/presto-main/src/main/java/com/facebook/presto/util/ImmutableCollectors.java b/presto-main/src/main/java/com/facebook/presto/util/ImmutableCollectors.java
index df3f432..f7906b6 100644
--- a/presto-main/src/main/java/com/facebook/presto/util/ImmutableCollectors.java
+++ b/presto-main/src/main/java/com/facebook/presto/util/ImmutableCollectors.java
@@ -22,27 +22,28 @@
 {
     private ImmutableCollectors() {}
 
-    public static <T> Collector<T, ImmutableList.Builder<T>, ImmutableList<T>> immutableListCollector()
+    public static <T> Collector<T, ?, ImmutableList<T>> toImmutableList()
     {
         return Collector.<T, ImmutableList.Builder<T>, ImmutableList<T>>of(
                 ImmutableList.Builder::new,
                 ImmutableList.Builder::add,
-                (ImmutableList.Builder<T> left, ImmutableList.Builder<T> right) -> {
+                (left, right) -> {
                     left.addAll(right.build());
                     return left;
                 },
                 ImmutableList.Builder::build);
     }
 
-    public static <T> Collector<T, ImmutableSet.Builder<T>, ImmutableSet<T>> immutableSetCollector()
+    public static <T> Collector<T, ?, ImmutableSet<T>> toImmutableSet()
     {
         return Collector.<T, ImmutableSet.Builder<T>, ImmutableSet<T>>of(
                 ImmutableSet.Builder::new,
                 ImmutableSet.Builder::add,
-                (ImmutableSet.Builder<T> left, ImmutableSet.Builder<T> right) -> {
+                (left, right) -> {
                     left.addAll(right.build());
                     return left;
                 },
-                ImmutableSet.Builder::build);
+                ImmutableSet.Builder::build,
+                Collector.Characteristics.UNORDERED);
     }
 }
