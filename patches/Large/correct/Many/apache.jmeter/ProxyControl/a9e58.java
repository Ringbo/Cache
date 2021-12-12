diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
index 9292b55..291ce13 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/ProxyControl.java
@@ -492,7 +492,7 @@
         if(log.isDebugEnabled()) {
             log.debug("Content-type to filter : " + sampleContentType);
         }
-        // Check if the include pattern is mathed
+        // Check if the include pattern is matched
         if(includeExp != null && includeExp.length() > 0) {
             if(log.isDebugEnabled()) {
                 log.debug("Include expression : " + includeExp);
@@ -509,7 +509,7 @@
             }
         }
 
-        // Check if the exclude pattern is mathed
+        // Check if the exclude pattern is matched
         if(excludeExp != null && excludeExp.length() > 0) {
             if(log.isDebugEnabled()) {
                 log.debug("Exclude expression : " + excludeExp);
@@ -522,7 +522,7 @@
                     return false;
                 }
             } catch (MalformedCachePatternException e) {
-                log.warn("Skipped invalid content exclude pattern: " + includeExp, e);
+                log.warn("Skipped invalid content exclude pattern: " + excludeExp, e);
             }
         }
 
