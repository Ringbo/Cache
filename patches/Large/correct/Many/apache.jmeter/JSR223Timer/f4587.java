diff --git a/src/components/org/apache/jmeter/timers/JSR223Timer.java b/src/components/org/apache/jmeter/timers/JSR223Timer.java
index c00fd0a..ff7afab 100644
--- a/src/components/org/apache/jmeter/timers/JSR223Timer.java
+++ b/src/components/org/apache/jmeter/timers/JSR223Timer.java
@@ -46,11 +46,11 @@
             }
             delay = Long.parseLong(o.toString());
         } catch (NumberFormatException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
         } catch (IOException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
         } catch (ScriptException e) {
-            log.warn("Problem in JSR223 script ", e);
+            log.error("Problem in JSR223 script ", e);
         }
         return delay;
     }
