diff --git a/servers/src/main/java/tachyon/worker/nio/NIODataServer.java b/servers/src/main/java/tachyon/worker/nio/NIODataServer.java
index ac9ce6f..0043b70 100644
--- a/servers/src/main/java/tachyon/worker/nio/NIODataServer.java
+++ b/servers/src/main/java/tachyon/worker/nio/NIODataServer.java
@@ -86,7 +86,7 @@
       TachyonConf tachyonConf) {
     LOG.info("Starting DataServer @ {}", address);
     mTachyonConf = Preconditions.checkNotNull(tachyonConf);
-    NetworkAddressUtils.assertValidPort(Preconditions.checkNotNull(address), mTachyonConf);
+    NetworkAddressUtils.assertValidPort(Preconditions.checkNotNull(address));
     mAddress = address;
     mDataManager = Preconditions.checkNotNull(dataManager);
     try {
