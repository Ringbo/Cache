diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyConnectionsPool.java b/src/main/java/com/ning/http/client/providers/netty/NettyConnectionsPool.java
index 1321cf8..52a121c 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyConnectionsPool.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyConnectionsPool.java
@@ -30,7 +30,7 @@
  */
 public class NettyConnectionsPool implements ConnectionsPool<String, Channel> {
 
-    private final static Logger log = LoggerFactory.getLogger(NettyAsyncHttpProvider.class);
+    private final static Logger log = LoggerFactory.getLogger(NettyConnectionsPool.class);
     private final ConcurrentHashMap<String, ConcurrentLinkedQueue<IdleChannel>> connectionsPool = new ConcurrentHashMap<String, ConcurrentLinkedQueue<IdleChannel>>();
     private final ConcurrentHashMap<Channel, IdleChannel> channel2IdleChannel = new ConcurrentHashMap<Channel, IdleChannel>();
     private final AtomicBoolean isClosed = new AtomicBoolean(false);
