diff --git a/src/test/java/io/vertx/test/core/HttpTest.java b/src/test/java/io/vertx/test/core/HttpTest.java
index 9f91b91..e2fd7f1 100644
--- a/src/test/java/io/vertx/test/core/HttpTest.java
+++ b/src/test/java/io/vertx/test/core/HttpTest.java
@@ -409,7 +409,7 @@
     int receiverBufferSize = TestUtils.randomPortInt();
     Random rand = new Random();
     boolean reuseAddress = rand.nextBoolean();
-    int trafficClass = TestUtils.randomByte() + 127;
+    int trafficClass = TestUtils.randomByte() + 128;
     boolean tcpNoDelay = rand.nextBoolean();
     boolean tcpKeepAlive = rand.nextBoolean();
     int soLinger = TestUtils.randomPositiveInt();
@@ -615,7 +615,7 @@
     int receiverBufferSize = TestUtils.randomPortInt();
     Random rand = new Random();
     boolean reuseAddress = rand.nextBoolean();
-    int trafficClass = TestUtils.randomByte() + 127;
+    int trafficClass = TestUtils.randomByte() + 128;
     boolean tcpNoDelay = rand.nextBoolean();
     boolean tcpKeepAlive = rand.nextBoolean();
     int soLinger = TestUtils.randomPositiveInt();
