diff --git a/requery/src/main/java/io/requery/query/element/HavingElement.java b/requery/src/main/java/io/requery/query/element/HavingElement.java
index 5396c0a..10b8a5a 100644
--- a/requery/src/main/java/io/requery/query/element/HavingElement.java
+++ b/requery/src/main/java/io/requery/query/element/HavingElement.java
@@ -35,7 +35,7 @@
 
     private final QueryElement<E> query;
 
-    public HavingElement(QueryElement<E> query,
+    HavingElement(QueryElement<E> query,
                          Set<HavingElement<E>> elements,
                          Condition<?,?> condition,
                          LogicalOperator operator) {
