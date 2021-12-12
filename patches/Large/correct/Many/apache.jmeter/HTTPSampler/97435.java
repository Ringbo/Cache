diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
index de3b227..537741d 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
@@ -102,7 +102,7 @@
             return;
         }
         try {
-            method.invoke(conn, new Integer[]{new Integer(timeout)});
+            method.invoke(conn, new Object[]{new Integer(timeout)});
         } catch (IllegalArgumentException e1) {
             log.warn("Failed to set timeout: "+e1);
         } catch (IllegalAccessException e1) {
