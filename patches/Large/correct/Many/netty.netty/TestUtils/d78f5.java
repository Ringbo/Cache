diff --git a/testsuite/src/test/java/io/netty/testsuite/util/TestUtils.java b/testsuite/src/test/java/io/netty/testsuite/util/TestUtils.java
index ed097bf..0f41a51 100644
--- a/testsuite/src/test/java/io/netty/testsuite/util/TestUtils.java
+++ b/testsuite/src/test/java/io/netty/testsuite/util/TestUtils.java
@@ -87,7 +87,7 @@
                 // Try to open a SCTP Channel, by using reflection to make it compile also on
                 // operation systems that not support SCTP like OSX and Windows
                 Class<?> sctpChannelClass = Class.forName("com.sun.nio.sctp.SctpChannel");
-                Channel channel = (Channel) sctpChannelClass.getMethod("open", null).invoke(null, null);
+                Channel channel = (Channel) sctpChannelClass.getMethod("open").invoke(null);
                 try {
                     channel.close();
                 } catch (IOException e) {
