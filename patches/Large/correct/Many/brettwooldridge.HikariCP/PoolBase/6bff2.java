diff --git a/src/main/java/com/zaxxer/hikari/pool/PoolBase.java b/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
index a2f2b16..b5e6ee7 100644
--- a/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
+++ b/src/main/java/com/zaxxer/hikari/pool/PoolBase.java
@@ -176,7 +176,7 @@
 
    Throwable getLastConnectionFailure()
    {
-      return lastConnectionFailure.getAndSet(null);
+      return lastConnectionFailure.get();
    }
 
    public DataSource getUnwrappedDataSource()
