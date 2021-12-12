diff --git a/src/main/java/org/redisson/misc/ConnectionPool.java b/src/main/java/org/redisson/misc/ConnectionPool.java
index 7fd7fc8..74d2987 100644
--- a/src/main/java/org/redisson/misc/ConnectionPool.java
+++ b/src/main/java/org/redisson/misc/ConnectionPool.java
@@ -65,7 +65,7 @@
     }
 
     private void initConnections(final ClientConnectionsEntry entry, final Promise<Void> initPromise, boolean checkFreezed) {
-        int minimumIdleSize = getMinimumIdleSize(entry);
+        final int minimumIdleSize = getMinimumIdleSize(entry);
 
         if (minimumIdleSize == 0 || (checkFreezed && entry.isFreezed())) {
             initPromise.setSuccess(null);
@@ -76,7 +76,7 @@
         for (int i = 0; i < minimumIdleSize; i++) {
             if ((checkFreezed && entry.isFreezed()) || !tryAcquireConnection(entry)) {
                 Throwable cause = new RedisConnectionException(
-                        "Can't init enough connections amount! " + initializedConnections.get() + " from " + minimumIdleSize + " was initialized. Server: "
+                        "Can't init enough connections amount! Only " + initializedConnections.get() + " from " + minimumIdleSize + " were initialized. Server: "
                                             + entry.getClient().getAddr());
                 initPromise.tryFailure(cause);
                 return;
@@ -92,7 +92,9 @@
                     }
                     releaseConnection(entry);
                     if (!future.isSuccess()) {
-                        Throwable cause = new RedisConnectionException("Can't init enough connections amount! from " + entry.getClient().getAddr());
+                        Throwable cause = new RedisConnectionException(
+                                "Can't init enough connections amount! Only " + initializedConnections.get() + " from " + minimumIdleSize + " were initialized. Server: "
+                                                    + entry.getClient().getAddr(), future.cause());
                         initPromise.tryFailure(cause);
                         return;
                     }
