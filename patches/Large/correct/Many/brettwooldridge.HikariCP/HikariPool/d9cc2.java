diff --git a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
index 57e2c74..ec340fe 100755
--- a/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
+++ b/src/main/java/com/zaxxer/hikari/pool/HikariPool.java
@@ -303,7 +303,7 @@
    @Override
    public Future<Boolean> addBagItem(final int waiting)
    {
-      final boolean shouldAdd = waiting - addConnectionQueue.size() > 0;
+      final boolean shouldAdd = waiting - addConnectionQueue.size() >= 0; // Yes, >= is intentional.
       if (shouldAdd) {
          return addConnectionExecutor.submit(POOL_ENTRY_CREATOR);
       }
