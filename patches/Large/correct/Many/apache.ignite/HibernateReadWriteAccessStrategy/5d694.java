diff --git a/modules/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateReadWriteAccessStrategy.java b/modules/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateReadWriteAccessStrategy.java
index 3ca466d..1b083a1 100644
--- a/modules/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateReadWriteAccessStrategy.java
+++ b/modules/hibernate/src/main/java/org/apache/ignite/cache/hibernate/HibernateReadWriteAccessStrategy.java
@@ -125,7 +125,7 @@
             if (ctx != null)
                 unlock(ctx, key);
         }
-        catch (IgniteCheckedException e) {
+        catch (Exception e) {
             rollbackCurrentTx();
 
             throw new CacheException(e);
@@ -152,7 +152,7 @@
 
             return false;
         }
-        catch (IgniteCheckedException e) {
+        catch (Exception e) {
             rollbackCurrentTx();
 
             throw new CacheException(e);
@@ -197,9 +197,9 @@
      *
      * @param ctx Transaction context.
      * @param key Key.
-     * @throws IgniteCheckedException If failed.
+     * @throws CacheException If failed.
      */
-    private void unlock(TxContext ctx, Object key) throws IgniteCheckedException {
+    private void unlock(TxContext ctx, Object key) throws CacheException {
         if (ctx.unlocked(key)) { // Finish transaction if last key is unlocked.
             txCtx.remove();
 
