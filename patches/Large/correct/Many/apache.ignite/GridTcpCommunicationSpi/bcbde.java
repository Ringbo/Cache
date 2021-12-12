diff --git a/modules/core/java/org/gridgain/grid/spi/communication/tcp/GridTcpCommunicationSpi.java b/modules/core/java/org/gridgain/grid/spi/communication/tcp/GridTcpCommunicationSpi.java
index c228c18..37af131 100644
--- a/modules/core/java/org/gridgain/grid/spi/communication/tcp/GridTcpCommunicationSpi.java
+++ b/modules/core/java/org/gridgain/grid/spi/communication/tcp/GridTcpCommunicationSpi.java
@@ -997,7 +997,7 @@
 
     /** {@inheritDoc} */
     @Override public long getSentBytesCount() {
-        return sentBytesCnt.intValue();
+        return sentBytesCnt.longValue();
     }
 
     /** {@inheritDoc} */
@@ -1007,7 +1007,7 @@
 
     /** {@inheritDoc} */
     @Override public long getReceivedBytesCount() {
-        return rcvdBytesCnt.intValue();
+        return rcvdBytesCnt.longValue();
     }
 
     /** {@inheritDoc} */
