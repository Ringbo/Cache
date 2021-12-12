diff --git a/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java b/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java
index c225914..5ddc50c 100644
--- a/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java
+++ b/src/protocol/java/org/apache/jmeter/protocol/java/sampler/BeanShellSampler.java
@@ -156,7 +156,7 @@
             log.error("BeanShell Jar missing? " + ex.toString());
             res.setResponseCode("501");//$NON-NLS-1$
             res.setResponseMessage(ex.toString());
-            response.setStopThread(true); // No point continuing
+            res.setStopThread(true); // No point continuing
         } catch (Exception ex) // Mainly for bsh.EvalError
         {
             log.warn(ex.toString());
