diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
index c763c0b..74f7b9d 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
@@ -358,7 +358,7 @@
      */
     private static final class HttpClientKey {
 
-        private final URL url;
+        private final String target; // protocol://[user:pass@]host:[port]
         private final boolean hasProxy;
         private final String proxyHost;
         private final int proxyPort;
@@ -369,7 +369,9 @@
 
         public HttpClientKey(URL url, boolean b, String proxyHost,
                 int proxyPort, String proxyUser, String proxyPass) {
-            this.url = url;
+            // N.B. need to separate protocol from authority otherwise http://server would match https://erver
+            // could use separate fields, but simpler to combine them
+            this.target = url.getProtocol()+"://"+url.getAuthority();
             this.hasProxy = b;
             this.proxyHost = proxyHost;
             this.proxyPort = proxyPort;
@@ -387,7 +389,7 @@
                 hash = hash*31 + getHash(proxyUser);
                 hash = hash*31 + getHash(proxyPass);
             }
-            hash = hash*31 + url.toString().hashCode();
+            hash = hash*31 + target.hashCode();
             return hash;
         }
 
@@ -412,14 +414,12 @@
                 this.proxyHost.equals(other.proxyHost) &&
                 this.proxyUser.equals(other.proxyUser) &&
                 this.proxyPass.equals(other.proxyPass) &&
-                this.url.toString().equals(other.url.toString());                
+                this.target.equals(other.target);
             }
             // No proxy, so don't check proxy fields
             return 
                 this.hasProxy == other.hasProxy &&
-                this.url.toString().equals(other.url.toString())
-            ;
-            
+                this.target.equals(other.target);
         }
 
         @Override
