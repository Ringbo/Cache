diff --git a/src/components/org/apache/jmeter/extractor/JSR223PostProcessor.java b/src/components/org/apache/jmeter/extractor/JSR223PostProcessor.java
index e84fd8c..3e58815 100644
--- a/src/components/org/apache/jmeter/extractor/JSR223PostProcessor.java
+++ b/src/components/org/apache/jmeter/extractor/JSR223PostProcessor.java
@@ -41,9 +41,9 @@
             ScriptEngine scriptEngine = getScriptEngine();
             processFileOrScript(scriptEngine, null);
         } catch (ScriptException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
         } catch (IOException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
         }
     }
 }
