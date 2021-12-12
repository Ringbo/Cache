diff --git a/handler/src/test/java/io/netty/handler/ssl/SSLEngineTest.java b/handler/src/test/java/io/netty/handler/ssl/SSLEngineTest.java
index d645920..312a757 100644
--- a/handler/src/test/java/io/netty/handler/ssl/SSLEngineTest.java
+++ b/handler/src/test/java/io/netty/handler/ssl/SSLEngineTest.java
@@ -397,7 +397,7 @@
             runDelegatedTasks(serverResult, serverEngine);
             cTOs.compact();
             sTOc.compact();
-        } while (isHandshaking(clientResult) && isHandshaking(serverResult));
+        } while (isHandshaking(clientResult) || isHandshaking(serverResult));
     }
 
     private static boolean isHandshaking(SSLEngineResult result) {
