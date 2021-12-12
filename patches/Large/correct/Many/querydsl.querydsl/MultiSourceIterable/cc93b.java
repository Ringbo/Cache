diff --git a/querydsl-collections/src/main/java/com/mysema/query/collections/MultiSourceIterable.java b/querydsl-collections/src/main/java/com/mysema/query/collections/MultiSourceIterable.java
index 176a8fa..d842e3d 100644
--- a/querydsl-collections/src/main/java/com/mysema/query/collections/MultiSourceIterable.java
+++ b/querydsl-collections/src/main/java/com/mysema/query/collections/MultiSourceIterable.java
@@ -28,7 +28,7 @@
  */
 public class MultiSourceIterable<T> extends AbstractIterable<Object[],T>{
 
-    private final Map<Expr<?>, Iterable<?>> iterables;
+    private final Map<Expr<?>, Iterable<?>> iterableMap;
     
     private final List<Expr<?>> sources = new ArrayList<Expr<?>>();
     
@@ -38,7 +38,7 @@
             Map<Expr<?>, Iterable<?>> iterables,
             boolean forCount) {
         super(metadata, evaluatorFactory, iteratorFactory, forCount);
-        this.iterables = iterables;
+        this.iterableMap = iterables;
         for (JoinExpression join : metadata.getJoins()){
             sources.add(join.getTarget());
         }
@@ -47,11 +47,11 @@
     @SuppressWarnings("unchecked")
     @Override
     protected Iterator<Object[]> initialIterator() {
-        List<Iterable<?>> iterables = new ArrayList<Iterable<?>>(sources.size());
+        List<Iterable<?>> iterableList = new ArrayList<Iterable<?>>(sources.size());
         for (Expr<?> expr : sources){
-            iterables.add(this.iterables.get(expr));
+            iterableList.add(iterableMap.get(expr));
         }
-        Iterator<Object[]> it = new MultiIterator(iterables);
+        Iterator<Object[]> it = new MultiIterator(iterableList);
         if (metadata.getWhere() != null) {
             it = iteratorFactory.multiArgFilter(it, sources, metadata.getWhere());
         }
