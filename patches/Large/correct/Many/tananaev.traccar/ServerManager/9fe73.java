diff --git a/src/org/traccar/ServerManager.java b/src/org/traccar/ServerManager.java
index 1bf2a09..6734d34 100644
--- a/src/org/traccar/ServerManager.java
+++ b/src/org/traccar/ServerManager.java
@@ -324,7 +324,7 @@
             serverList.add(new TrackerServer(this, new ServerBootstrap(), protocol) {
                 @Override
                 protected void addSpecificHandlers(ChannelPipeline pipeline) {
-                    if (Boolean.valueOf(properties.containsKey(protocol + ".extended"))) {
+                    if (Boolean.valueOf(properties.getProperty(protocol + ".extended"))) {
                         pipeline.addLast("frameDecoder", new LineBasedFrameDecoder(1024)); // tracker bug \n\r
                         pipeline.addLast("stringDecoder", new StringDecoder());
                         pipeline.addLast("objectDecoder", new Xexun2ProtocolDecoder(dataManager, protocol, properties));
