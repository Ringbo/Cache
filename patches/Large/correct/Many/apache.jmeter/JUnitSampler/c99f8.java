diff --git a/src/junit/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java b/src/junit/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java
index 1b331a4..a9aac18 100644
--- a/src/junit/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java
+++ b/src/junit/org/apache/jmeter/protocol/java/sampler/JUnitSampler.java
@@ -410,10 +410,10 @@
                     tr.addFailure(theClazz, afe);
                 } else if (cause != null) {
                     tr.addError(theClazz, cause);
-                    log.warn("caught exception", e);
+                    log.info("caught exception", e);
                 } else {
                     tr.addError(theClazz, e);
-                    log.warn("caught exception", e);
+                    log.info("caught exception", e);
                 }
             } catch (IllegalAccessException | IllegalArgumentException e) {
                 tr.addError(theClazz, e);
