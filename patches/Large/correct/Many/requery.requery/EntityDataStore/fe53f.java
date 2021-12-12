diff --git a/requery/src/main/java/io/requery/sql/EntityDataStore.java b/requery/src/main/java/io/requery/sql/EntityDataStore.java
index a0a0c0f..90fa3ba 100644
--- a/requery/src/main/java/io/requery/sql/EntityDataStore.java
+++ b/requery/src/main/java/io/requery/sql/EntityDataStore.java
@@ -352,7 +352,7 @@
         if (iterator.hasNext()) {
             try (TransactionScope transaction = new TransactionScope(transactionProvider)) {
                 E entity = iterator.next();
-                EntityProxy<E> proxy = context.proxyOf(entity, false);
+                EntityProxy<E> proxy = context.proxyOf(entity, true);
                 EntityWriter<E, T> writer = context.write(proxy.type().getClassType());
                 writer.delete(entities);
                 transaction.commit();
