diff --git a/components/camel-bam/src/main/java/org/apache/camel/bam/rules/ProcessRules.java b/components/camel-bam/src/main/java/org/apache/camel/bam/rules/ProcessRules.java
index 276ab2c..dd202c6 100644
--- a/components/camel-bam/src/main/java/org/apache/camel/bam/rules/ProcessRules.java
+++ b/components/camel-bam/src/main/java/org/apache/camel/bam/rules/ProcessRules.java
@@ -33,13 +33,13 @@
     private ProcessDefinition processDefinition;
     private List<ActivityRules> activities = new ArrayList<ActivityRules>();
 
-    public void processExpired(ActivityState activityState) throws Exception {
+    public synchronized void processExpired(ActivityState activityState) throws Exception {
         for (ActivityRules activityRules : activities) {
             activityRules.processExpired(activityState);
         }
     }
 
-    public void processExchange(Exchange exchange, ProcessInstance process) {
+    public synchronized void processExchange(Exchange exchange, ProcessInstance process) {
         for (ActivityRules activityRules : activities) {
             activityRules.processExchange(exchange, process);
         }
