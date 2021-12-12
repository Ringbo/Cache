diff --git a/engine/src/networking/com/jme3/network/base/DefaultServer.java b/engine/src/networking/com/jme3/network/base/DefaultServer.java
index 41870fd..c02d28d 100644
--- a/engine/src/networking/com/jme3/network/base/DefaultServer.java
+++ b/engine/src/networking/com/jme3/network/base/DefaultServer.java
@@ -64,7 +64,7 @@
     private Kernel fast;
     private KernelAdapter fastAdapter;
     private Redispatch dispatcher = new Redispatch();
-    private Map<Long,HostedConnection> connections = new ConcurrentHashMap<Long,HostedConnection>();
+    private Map<Integer,HostedConnection> connections = new ConcurrentHashMap<Integer,HostedConnection>();
     private Map<Endpoint,HostedConnection> endpointConnections 
                             = new ConcurrentHashMap<Endpoint,HostedConnection>();
     
@@ -346,7 +346,7 @@
             id = nextId.getAndIncrement();
         }
         
-        public long getId()
+        public int getId()
         {
             return id;
         }
