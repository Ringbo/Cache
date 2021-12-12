diff --git a/querydsl-collections/src/main/java/com/mysema/query/collections/AbstractColQuery.java b/querydsl-collections/src/main/java/com/mysema/query/collections/AbstractColQuery.java
index 42aac89..84ebaa7 100644
--- a/querydsl-collections/src/main/java/com/mysema/query/collections/AbstractColQuery.java
+++ b/querydsl-collections/src/main/java/com/mysema/query/collections/AbstractColQuery.java
@@ -22,14 +22,14 @@
  * @author tiwe
  * @version $Id$
  */
-public class AbstractColQuery<S extends AbstractColQuery<S>> {
+public class AbstractColQuery<SubType extends AbstractColQuery<SubType>> {
     
     private static final OperationPatterns OPS_DEFAULT = new JavaOps();
 
     private final InnerQuery query;
 
     @SuppressWarnings("unchecked")
-    private S self = (S)this;
+    private SubType _this = (SubType)this;
 
     public AbstractColQuery() {
         this(OPS_DEFAULT);
@@ -50,33 +50,33 @@
         return target;
     }
 
-    public <A> S from(Expr<A> entity, A first, A... rest) {
+    public <A> SubType from(Expr<A> entity, A first, A... rest) {
         List<A> list = new ArrayList<A>(rest.length + 1);
         list.add(first);
         list.addAll(Arrays.asList(rest));
         return from(entity, list);
     }
 
-    public <A> S from(Expr<A> entity, Iterable<A> col) {
+    public <A> SubType from(Expr<A> entity, Iterable<A> col) {
         query.alias(entity, col).from((Expr<?>)entity);
-        return self;
+        return _this;
     }
-    public <A> S innerJoin(Expr<A> entity, Iterable<A> col){
+    public <A> SubType innerJoin(Expr<A> entity, Iterable<A> col){
         query.alias(entity, col).innerJoin((Expr<?>)entity);
-        return self;
+        return _this;
     }    
-    public <A> S fullJoin(Expr<A> entity, Iterable<A> col){
+    public <A> SubType fullJoin(Expr<A> entity, Iterable<A> col){
         query.alias(entity, col).fullJoin((Expr<?>)entity);
-        return self;
+        return _this;
     }
-    public <A> S leftJoin(Expr<A> entity, Iterable<A> col){
+    public <A> SubType leftJoin(Expr<A> entity, Iterable<A> col){
         query.alias(entity, col).leftJoin((Expr<?>)entity);
-        return self;
+        return _this;
     }
     
-    public S on(Expr.EBoolean o){
+    public SubType on(Expr.EBoolean o){
         query.on(o);
-        return self;
+        return _this;
     }
         
     public Iterable<Object[]> iterate(Expr<?> e1, Expr<?> e2, Expr<?>... rest) {
@@ -123,14 +123,14 @@
         return it.hasNext() ? it.next() : null;
     }
         
-    public S orderBy(OrderSpecifier<?>... o) {
+    public SubType orderBy(OrderSpecifier<?>... o) {
         query.orderBy(o);
-        return self;
+        return _this;
     }
     
-    public S where(Expr.EBoolean... o) {
+    public SubType where(Expr.EBoolean... o) {
         query.where(o);
-        return self;
+        return _this;
     }
 
 }
