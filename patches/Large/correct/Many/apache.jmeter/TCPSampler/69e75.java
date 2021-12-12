diff --git a/src/protocol/tcp/org/apache/jmeter/protocol/tcp/sampler/TCPSampler.java b/src/protocol/tcp/org/apache/jmeter/protocol/tcp/sampler/TCPSampler.java
index 192aaef..ae922d4 100644
--- a/src/protocol/tcp/org/apache/jmeter/protocol/tcp/sampler/TCPSampler.java
+++ b/src/protocol/tcp/org/apache/jmeter/protocol/tcp/sampler/TCPSampler.java
@@ -208,7 +208,7 @@
     }
 
     public void setTimeout(String newTimeout) {
-        this.setProperty(FILENAME, newTimeout);
+        this.setProperty(TIMEOUT, newTimeout);
     }
 
     public int getTimeout() {
