diff --git a/src/components/org/apache/jmeter/visualizers/JSR223Listener.java b/src/components/org/apache/jmeter/visualizers/JSR223Listener.java
index 247b126..a8ab2b1 100644
--- a/src/components/org/apache/jmeter/visualizers/JSR223Listener.java
+++ b/src/components/org/apache/jmeter/visualizers/JSR223Listener.java
@@ -49,9 +49,9 @@
             bindings.put("sampleResult", event.getResult());
             processFileOrScript(scriptEngine, bindings);
         } catch (ScriptException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
         } catch (IOException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
         }
     }
 
