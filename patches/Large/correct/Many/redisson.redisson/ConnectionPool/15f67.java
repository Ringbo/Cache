diff --git a/src/main/java/org/redisson/misc/ConnectionPool.java b/src/main/java/org/redisson/misc/ConnectionPool.java
index e163406..2ab1717 100644
--- a/src/main/java/org/redisson/misc/ConnectionPool.java
+++ b/src/main/java/org/redisson/misc/ConnectionPool.java
@@ -215,7 +215,7 @@
             }
         }
 
-        promises.addFirst(promise);
+        promises.add(promise);
 //        promise.tryFailure(cause);
     }
 
@@ -248,7 +248,7 @@
 
         releaseConnection(entry);
 
-        promises.addFirst(promise);
+        promises.add(promise);
 //        RedisConnectionException cause = new RedisConnectionException(conn + " is not active!");
 //        promise.tryFailure(cause);
     }
