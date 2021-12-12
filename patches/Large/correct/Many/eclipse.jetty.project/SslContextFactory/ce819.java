diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java b/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
index 266ecaa..1cf2bf0 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/ssl/SslContextFactory.java
@@ -1122,7 +1122,7 @@
                     }
                 }
 
-                if (!_certHosts.isEmpty() || !_certWilds.isEmpty())
+                if (!_certWilds.isEmpty() || _certHosts.size()>1)
                 {
                     for (int idx = 0; idx < managers.length; idx++)
                     {
