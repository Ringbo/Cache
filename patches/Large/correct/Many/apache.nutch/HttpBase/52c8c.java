diff --git a/src/plugin/lib-http/src/java/org/apache/nutch/protocol/http/api/HttpBase.java b/src/plugin/lib-http/src/java/org/apache/nutch/protocol/http/api/HttpBase.java
index ea5a1eb..600d79a 100644
--- a/src/plugin/lib-http/src/java/org/apache/nutch/protocol/http/api/HttpBase.java
+++ b/src/plugin/lib-http/src/java/org/apache/nutch/protocol/http/api/HttpBase.java
@@ -382,7 +382,7 @@
         long time = ((Long) BLOCKED_ADDR_TO_TIME.get(host)).longValue();
         if (time <= System.currentTimeMillis()) {
           BLOCKED_ADDR_TO_TIME.remove(host);
-          BLOCKED_ADDR_QUEUE.removeLast();
+          BLOCKED_ADDR_QUEUE.remove(i);
         }
       }
     }
