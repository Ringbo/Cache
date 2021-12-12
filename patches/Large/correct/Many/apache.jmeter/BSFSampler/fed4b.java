diff --git a/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BSFSampler.java b/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BSFSampler.java
index 58960e8..c30ccac 100644
--- a/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BSFSampler.java
+++ b/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BSFSampler.java
@@ -132,6 +132,6 @@
      * {@inheritDoc}
      */
     public boolean applies(ConfigTestElement configElement) {
-        return true;
+        return false;
     }
 }
