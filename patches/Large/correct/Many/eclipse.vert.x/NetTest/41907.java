diff --git a/src/test/java/io/vertx/test/core/NetTest.java b/src/test/java/io/vertx/test/core/NetTest.java
index 374f14b..9f23946 100644
--- a/src/test/java/io/vertx/test/core/NetTest.java
+++ b/src/test/java/io/vertx/test/core/NetTest.java
@@ -280,7 +280,7 @@
     int receiverBufferSize = TestUtils.randomPortInt();
     Random rand = new Random();
     boolean reuseAddress = rand.nextBoolean();
-    int trafficClass = TestUtils.randomByte() + 127;
+    int trafficClass = TestUtils.randomByte() + 128;
     boolean tcpNoDelay = rand.nextBoolean();
     boolean tcpKeepAlive = rand.nextBoolean();
     int soLinger = TestUtils.randomPositiveInt();
@@ -369,7 +369,7 @@
     int receiverBufferSize = TestUtils.randomPortInt();
     Random rand = new Random();
     boolean reuseAddress = rand.nextBoolean();
-    int trafficClass = TestUtils.randomByte() + 127;
+    int trafficClass = TestUtils.randomByte() + 128;
     boolean tcpNoDelay = rand.nextBoolean();
     boolean tcpKeepAlive = rand.nextBoolean();
     int soLinger = TestUtils.randomPositiveInt();
