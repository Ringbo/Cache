diff --git a/mockserver-maven-plugin/src/main/java/org/mockserver/maven/MockServerRunAndWaitMojo.java b/mockserver-maven-plugin/src/main/java/org/mockserver/maven/MockServerRunAndWaitMojo.java
index f80eb6d..00664e7 100644
--- a/mockserver-maven-plugin/src/main/java/org/mockserver/maven/MockServerRunAndWaitMojo.java
+++ b/mockserver-maven-plugin/src/main/java/org/mockserver/maven/MockServerRunAndWaitMojo.java
@@ -31,7 +31,7 @@
                 );
             }
             try {
-                if (timeout > 0) {
+                if (timeout != null && timeout > 0) {
                     getEmbeddedJettyHolder().start(getServerPorts(), proxyPort, createInitializer());
                     try {
                         settableFuture.get(timeout, TimeUnit.SECONDS);
