diff --git a/mockserver-maven-plugin/src/test/java/org/mockserver/maven/MockServerRunAndWaitMojoTest.java b/mockserver-maven-plugin/src/test/java/org/mockserver/maven/MockServerRunAndWaitMojoTest.java
index 015d3eb..0892878 100644
--- a/mockserver-maven-plugin/src/test/java/org/mockserver/maven/MockServerRunAndWaitMojoTest.java
+++ b/mockserver-maven-plugin/src/test/java/org/mockserver/maven/MockServerRunAndWaitMojoTest.java
@@ -60,7 +60,7 @@
         mockServerRunAndWaitMojo.logLevel = "LEVEL";
         mockServerRunAndWaitMojo.timeout = 0;
         when(mockEmbeddedJettyHolder.start(1, 2, 3, 4, "LEVEL")).thenReturn(mockServerRunner);
-        doThrow(new InterruptedException()).when(mockServerRunner).join();
+        doThrow(new InterruptedException("TEST EXCEPTION")).when(mockServerRunner).join();
 
         // when
         mockServerRunAndWaitMojo.execute();
@@ -80,7 +80,7 @@
         mockServerRunAndWaitMojo.logLevel = "LEVEL";
         mockServerRunAndWaitMojo.timeout = 2;
         when(mockEmbeddedJettyHolder.start(1, 2, 3, 4, "LEVEL")).thenReturn(mockServerRunner);
-        doThrow(new InterruptedException()).when(mockServerRunner).join(TimeUnit.SECONDS.toMillis(2));
+        doThrow(new InterruptedException("TEST EXCEPTION")).when(mockServerRunner).join(TimeUnit.SECONDS.toMillis(2));
 
         // when
         mockServerRunAndWaitMojo.execute();
