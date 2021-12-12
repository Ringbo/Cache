diff --git a/querydsl-jpa/src/test/java/com/mysema/query/AbstractStandardTest.java b/querydsl-jpa/src/test/java/com/mysema/query/AbstractStandardTest.java
index f8d1756..ed9faf2 100644
--- a/querydsl-jpa/src/test/java/com/mysema/query/AbstractStandardTest.java
+++ b/querydsl-jpa/src/test/java/com/mysema/query/AbstractStandardTest.java
@@ -77,7 +77,7 @@
 
     private final java.sql.Date date;
 
-    private final Projections projections = new Projections(Module.HQL, getTarget()){
+    private final ProjectionsFactory projections = new ProjectionsFactory(Module.HQL, getTarget()){
         @Override
         public <A,Q extends SimpleExpression<A>> Collection<Expression<?>> list(ListPath<A,Q> expr, ListExpression<A,Q> other, A knownElement){
             // NOTE : expr.get(0) is only supported in the where clause
@@ -88,7 +88,7 @@
     private final List<Cat> savedCats = new ArrayList<Cat>();
 
     private final QueryExecution standardTest = new QueryExecution(
-            projections, new Filters(projections, Module.HQL, getTarget()), new MatchingFilters(Module.HQL, getTarget())){
+            projections, new FilterFactory(projections, Module.HQL, getTarget()), new MatchingFiltersFactory(Module.HQL, getTarget())){
 
         @Override
         protected Pair<Projectable, List<Expression<?>>> createQuery() {
@@ -284,7 +284,7 @@
     
     @Test
     public void Contains2(){
-        catQuery().where(cat.kittens.contains(savedCats.get(0))).count();
+        assertEquals(1l, catQuery().where(cat.kittens.contains(savedCats.get(0))).count());
     }
 
     @Test
