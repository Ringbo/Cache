diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/runtime/ProcessInstanceQueryTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/runtime/ProcessInstanceQueryTest.java
index ef56c88..62a685c 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/runtime/ProcessInstanceQueryTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/runtime/ProcessInstanceQueryTest.java
@@ -1901,7 +1901,7 @@
   @Deployment(resources = { "org/activiti/engine/test/api/oneTaskProcess.bpmn20.xml" })
   public void testQueryStartedAfter() throws Exception {
     Calendar calendar = new GregorianCalendar();
-    calendar.set(Calendar.YEAR, 2200);
+    calendar.set(Calendar.YEAR, 2030);
     calendar.set(Calendar.MONTH, 8);
     calendar.set(Calendar.DAY_OF_MONTH, 30);
     calendar.set(Calendar.HOUR_OF_DAY, 12);
