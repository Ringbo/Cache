diff --git a/src/org/traccar/ServerManager.java b/src/org/traccar/ServerManager.java
index 9416c41..59d98af 100644
--- a/src/org/traccar/ServerManager.java
+++ b/src/org/traccar/ServerManager.java
@@ -137,7 +137,7 @@
         initMta6CanServer("mta6can");
         initTlt2hServer("tlt2h");
         initSyrusServer("syrus");
-        initVt300Server("vt300");
+        initWondexServer("wondex");
         initCellocatorServer("cellocator");
         initGalileoServer("galileo");
 
@@ -703,7 +703,7 @@
         }
     }
 
-    private void initVt300Server(String protocol) throws SQLException {
+    private void initWondexServer(String protocol) throws SQLException {
         if (isProtocolEnabled(properties, protocol)) {
             serverList.add(new TrackerServer(this, new ServerBootstrap(), protocol) {
                 @Override
@@ -713,7 +713,7 @@
                             new DelimiterBasedFrameDecoder(1024, ChannelBuffers.wrappedBuffer(delimiter)));
                     pipeline.addLast("stringDecoder", new StringDecoder());
                     pipeline.addLast("stringEncoder", new StringEncoder());
-                    pipeline.addLast("objectDecoder", new Vt300ProtocolDecoder(ServerManager.this));
+                    pipeline.addLast("objectDecoder", new WondexProtocolDecoder(ServerManager.this));
                 }
             });
         }
