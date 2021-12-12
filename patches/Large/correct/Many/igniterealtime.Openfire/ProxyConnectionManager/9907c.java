diff --git a/src/java/org/jivesoftware/openfire/filetransfer/proxy/ProxyConnectionManager.java b/src/java/org/jivesoftware/openfire/filetransfer/proxy/ProxyConnectionManager.java
index 59b096a..b5518f0 100644
--- a/src/java/org/jivesoftware/openfire/filetransfer/proxy/ProxyConnectionManager.java
+++ b/src/java/org/jivesoftware/openfire/filetransfer/proxy/ProxyConnectionManager.java
@@ -374,7 +374,7 @@
         }
 
         public double sample() {
-            return (ProxyOutputStream.amountTransfered.getAndSet(0) / 1000);
+            return (ProxyOutputStream.amountTransfered.getAndSet(0) / 1000d);
         }
 
         public boolean isPartialSample() {
