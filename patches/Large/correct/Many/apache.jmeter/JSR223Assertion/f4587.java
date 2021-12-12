diff --git a/src/components/org/apache/jmeter/assertions/JSR223Assertion.java b/src/components/org/apache/jmeter/assertions/JSR223Assertion.java
index 6bd839b..09b4f4a 100644
--- a/src/components/org/apache/jmeter/assertions/JSR223Assertion.java
+++ b/src/components/org/apache/jmeter/assertions/JSR223Assertion.java
@@ -47,11 +47,11 @@
             processFileOrScript(scriptEngine, bindings);
             result.setError(false);
         } catch (IOException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
             result.setError(true);
             result.setFailureMessage(e.toString());
         } catch (ScriptException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
             result.setError(true);
             result.setFailureMessage(e.toString());
         }
