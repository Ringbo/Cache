diff --git a/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java b/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java
index 80fba4a..8e309b8 100644
--- a/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java
+++ b/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java
@@ -166,9 +166,10 @@
     }
 
     /**
-     * {@inheritDoc}
+     * No config element applies to BeanShellSampler
+     * @see org.apache.jmeter.samplers.AbstractSampler#applies(org.apache.jmeter.config.ConfigTestElement)
      */
     public boolean applies(ConfigTestElement configElement) {
-        return true;
+        return false;
     }
 }
