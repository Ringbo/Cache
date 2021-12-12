diff --git a/subprojects/core/src/test/groovy/org/gradle/process/internal/DefaultWorkerProcessFactoryTest.java b/subprojects/core/src/test/groovy/org/gradle/process/internal/DefaultWorkerProcessFactoryTest.java
index 403b5f8..b811841 100644
--- a/subprojects/core/src/test/groovy/org/gradle/process/internal/DefaultWorkerProcessFactoryTest.java
+++ b/subprojects/core/src/test/groovy/org/gradle/process/internal/DefaultWorkerProcessFactoryTest.java
@@ -76,7 +76,7 @@
         builder.applicationClasspath(Arrays.asList(new File("app.jar")));
         builder.sharedPackages("package1", "package2");
 
-        final Address serverAddress = new SocketInetAddress(InetAddress.getLocalHost(), 40);
+        final Address serverAddress = new SocketInetAddress(InetAddress.getByName("127.0.0.1"), 40);
 
         context.checking(new Expectations(){{
             one(messagingServer).accept(with(notNullValue(Action.class)));
