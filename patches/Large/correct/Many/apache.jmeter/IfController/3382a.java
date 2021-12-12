diff --git a/src/core/org/apache/jmeter/control/IfController.java b/src/core/org/apache/jmeter/control/IfController.java
index 39d0b5e..4b8d4bd 100644
--- a/src/core/org/apache/jmeter/control/IfController.java
+++ b/src/core/org/apache/jmeter/control/IfController.java
@@ -97,7 +97,7 @@
     /**
      * evaluate the condition clause log error if bad condition
      */
-    private static boolean evaluateCondition(String cond) {
+    private boolean evaluateCondition(String cond) {
         logger.debug("    getCondition() : [" + cond + "]");
 
         String resultStr = "";
@@ -122,7 +122,7 @@
 
             logger.debug("    >> evaluate Condition -  [ " + cond + "] results is  [" + result + "]");
         } catch (Exception e) {
-            logger.error(e.getMessage(), e);
+            logger.error(getName()+": error while processing "+ "[" + cond + "]\n", e);
         } finally {
             Context.exit();
         }
