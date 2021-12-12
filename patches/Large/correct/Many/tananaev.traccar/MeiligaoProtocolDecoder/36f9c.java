diff --git a/src/org/traccar/protocol/MeiligaoProtocolDecoder.java b/src/org/traccar/protocol/MeiligaoProtocolDecoder.java
index c1b75d0..6e6c654 100644
--- a/src/org/traccar/protocol/MeiligaoProtocolDecoder.java
+++ b/src/org/traccar/protocol/MeiligaoProtocolDecoder.java
@@ -117,7 +117,7 @@
     private String getMeiligaoServer(Channel channel) {
         
         if (getServerManager() != null &&
-            getServerManager().getProperties().contains("meiligao.server")) {
+            getServerManager().getProperties().containsKey("meiligao.server")) {
             return getServerManager().getProperties().getProperty("meiligao.server");
         } else {
             InetSocketAddress address = (InetSocketAddress) channel.getLocalAddress();
