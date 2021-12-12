diff --git a/requery/src/main/java/io/requery/async/CompletableEntityStore.java b/requery/src/main/java/io/requery/async/CompletableEntityStore.java
index cb57a1d..ffff35a 100644
--- a/requery/src/main/java/io/requery/async/CompletableEntityStore.java
+++ b/requery/src/main/java/io/requery/async/CompletableEntityStore.java
@@ -120,7 +120,7 @@
         return CompletableFuture.supplyAsync(new Supplier<E>() {
             @Override
             public E get() {
-                return delegate.update(entity);
+                return delegate.upsert(entity);
             }
         }, executor);
     }
