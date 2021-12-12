diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
index 2caaf8c..2d8a783 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSamplerBase.java
@@ -681,7 +681,7 @@
     public void setHeaderManager(HeaderManager value) {
         HeaderManager mgr = getHeaderManager();
         if (mgr != null) {
-            log.warn("Existing HeaderManager '" + mgr.getName() + "' merged with '" + value.getName() + "'");
+            log.debug("Existing HeaderManager '" + mgr.getName() + "' merged with '" + value.getName() + "'");
             value = mgr.merge(value, true);
             if (log.isDebugEnabled()) {
                 log.debug("HeaderManager merged: " + value.getName());
