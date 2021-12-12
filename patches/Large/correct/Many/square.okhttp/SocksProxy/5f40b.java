diff --git a/okhttp-tests/src/test/java/okhttp3/SocksProxy.java b/okhttp-tests/src/test/java/okhttp3/SocksProxy.java
index 9c1b5a8..69ce1fa 100644
--- a/okhttp-tests/src/test/java/okhttp3/SocksProxy.java
+++ b/okhttp-tests/src/test/java/okhttp3/SocksProxy.java
@@ -160,7 +160,7 @@
         String domainName = fromSource.readUtf8(domainNameLength);
         // Resolve HOSTNAME_THAT_ONLY_THE_PROXY_KNOWS to localhost.
         toAddress = domainName.equalsIgnoreCase(HOSTNAME_THAT_ONLY_THE_PROXY_KNOWS)
-            ? InetAddress.getLoopbackAddress()
+            ? InetAddress.getByName("localhost")
             : InetAddress.getByName(domainName);
         break;
 
