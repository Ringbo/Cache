diff --git a/requery/src/main/java/io/requery/proxy/CollectionChanges.java b/requery/src/main/java/io/requery/proxy/CollectionChanges.java
index d379e4e..9819588 100644
--- a/requery/src/main/java/io/requery/proxy/CollectionChanges.java
+++ b/requery/src/main/java/io/requery/proxy/CollectionChanges.java
@@ -30,7 +30,7 @@
     private final Collection<E> added;
     private final Collection<E> removed;
 
-    public CollectionChanges(EntityProxy<T> proxy, Attribute<T, ?> attribute) {
+    CollectionChanges(EntityProxy<T> proxy, Attribute<T, ?> attribute) {
         this.proxy = proxy;
         this.attribute = attribute;
         added = new ArrayList<>();
