diff --git a/src/protocol/java/org/apache/jmeter/protocol/java/sampler/JSR223Sampler.java b/src/protocol/java/org/apache/jmeter/protocol/java/sampler/JSR223Sampler.java
index 2797fdf..e3e045c 100644
--- a/src/protocol/java/org/apache/jmeter/protocol/java/sampler/JSR223Sampler.java
+++ b/src/protocol/java/org/apache/jmeter/protocol/java/sampler/JSR223Sampler.java
@@ -72,12 +72,12 @@
                 result.setResponseData(ret.toString(), null);
             }
         } catch (IOException e) {
-            log.warn("Problem in JSR223 script "+e, e);
+            log.error("Problem in JSR223 script "+e, e);
             result.setSuccessful(false);
             result.setResponseCode("500"); // $NON-NLS-1$
             result.setResponseMessage(e.toString());
         } catch (ScriptException e) {
-            log.warn("Problem in JSR223 script "+e, e);
+            log.error("Problem in JSR223 script "+e, e);
             result.setSuccessful(false);
             result.setResponseCode("500"); // $NON-NLS-1$
             result.setResponseMessage(e.toString());
