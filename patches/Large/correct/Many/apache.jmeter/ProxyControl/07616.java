diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
index 7517a06..be77612 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
@@ -258,7 +258,7 @@
 
     private volatile boolean samplerDownloadImages = false;
 
-    private volatile boolean notifyChildSamplerListenersOfFilteredSamples = false;
+    private volatile boolean notifyChildSamplerListenersOfFilteredSamples = true;
 
     private volatile boolean regexMatch = false;// Should we match using regexes?
 
@@ -424,7 +424,7 @@
     }
 
     public boolean getNotifyChildSamplerListenerOfFilteredSamplers() {
-        return getPropertyAsBoolean(NOTIFY_CHILD_SAMPLER_LISTENERS_FILTERED, false);
+        return getPropertyAsBoolean(NOTIFY_CHILD_SAMPLER_LISTENERS_FILTERED, true);
     }
     
     public boolean getRegexMatch() {
