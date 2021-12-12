diff --git a/src/java/org/apache/cassandra/net/OutboundTcpConnection.java b/src/java/org/apache/cassandra/net/OutboundTcpConnection.java
index 90d054e..9de38d3 100644
--- a/src/java/org/apache/cassandra/net/OutboundTcpConnection.java
+++ b/src/java/org/apache/cassandra/net/OutboundTcpConnection.java
@@ -133,7 +133,7 @@
             if (m == CLOSE_SENTINEL)
             {
                 disconnect();
-                if (!isStopped)
+                if (isStopped)
                     break;
                 continue;
             }
