diff --git a/src/test/java/io/vertx/test/core/NetTest.java b/src/test/java/io/vertx/test/core/NetTest.java
index 4ce1c2a..4dd8377 100644
--- a/src/test/java/io/vertx/test/core/NetTest.java
+++ b/src/test/java/io/vertx/test/core/NetTest.java
@@ -487,7 +487,8 @@
     int receiverBufferSize = TestUtils.randomPortInt();
     Random rand = new Random();
     boolean reuseAddress = rand.nextBoolean();
-    int trafficClass = TestUtils.randomByte() + 127;boolean tcpNoDelay = rand.nextBoolean();
+    int trafficClass = TestUtils.randomByte() + 128;
+    boolean tcpNoDelay = rand.nextBoolean();
     boolean tcpKeepAlive = rand.nextBoolean();
     int soLinger = TestUtils.randomPositiveInt();
     boolean usePooledBuffers = rand.nextBoolean();
