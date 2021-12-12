diff --git a/src/components/org/apache/jmeter/modifiers/JSR223PreProcessor.java b/src/components/org/apache/jmeter/modifiers/JSR223PreProcessor.java
index 2c30994..afef2e7 100644
--- a/src/components/org/apache/jmeter/modifiers/JSR223PreProcessor.java
+++ b/src/components/org/apache/jmeter/modifiers/JSR223PreProcessor.java
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
