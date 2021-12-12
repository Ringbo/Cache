diff --git a/src/java/org/jivesoftware/messenger/net/DNSUtil.java b/src/java/org/jivesoftware/messenger/net/DNSUtil.java
index 528c3c1..6940d30 100644
--- a/src/java/org/jivesoftware/messenger/net/DNSUtil.java
+++ b/src/java/org/jivesoftware/messenger/net/DNSUtil.java
@@ -83,7 +83,7 @@
         if (host.endsWith(".")) {
             host = host.substring(0, host.length()-1);
         }
-        return new HostAddress(domain, port);
+        return new HostAddress(host, port);
     }
 
     /**
