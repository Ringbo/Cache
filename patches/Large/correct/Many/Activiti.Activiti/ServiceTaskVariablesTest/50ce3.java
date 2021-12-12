diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/servicetask/ServiceTaskVariablesTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/servicetask/ServiceTaskVariablesTest.java
index 707b2fb..54f79f8 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/servicetask/ServiceTaskVariablesTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/servicetask/ServiceTaskVariablesTest.java
@@ -25,7 +25,7 @@
  *
  * @author Daniel Meyer
  */
-public class ServiceTaskVariablesTest extends PluggableActivitiTestCase {
+public abstract class ServiceTaskVariablesTest extends PluggableActivitiTestCase {
   
   static boolean isNullInDelegate2;
   static boolean isNullInDelegate3;
