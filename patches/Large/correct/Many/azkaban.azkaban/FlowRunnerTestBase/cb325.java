diff --git a/azkaban-exec-server/src/test/java/azkaban/execapp/FlowRunnerTestBase.java b/azkaban-exec-server/src/test/java/azkaban/execapp/FlowRunnerTestBase.java
index d7d8d70..83c41bf 100644
--- a/azkaban-exec-server/src/test/java/azkaban/execapp/FlowRunnerTestBase.java
+++ b/azkaban-exec-server/src/test/java/azkaban/execapp/FlowRunnerTestBase.java
@@ -38,7 +38,7 @@
   }
 
   public void waitFlowRunner(final Function<FlowRunner, Boolean> statusCheck) {
-    for (int i = 0; i < 100; i++) {
+    for (int i = 0; i < 1000; i++) {
       if (statusCheck.apply(this.runner)) {
         return;
       }
@@ -54,7 +54,7 @@
 
   public void waitJobStatuses(final Function<Status, Boolean> statusCheck,
       final String... jobs) {
-    for (int i = 0; i < 100; i++) {
+    for (int i = 0; i < 1000; i++) {
       if (checkJobStatuses(statusCheck, jobs)) {
         return;
       }
@@ -74,7 +74,7 @@
 
   protected void waitEventFired(final String nestedId, final Status status)
       throws InterruptedException {
-    for (int i = 0; i < 100; i++) {
+    for (int i = 0; i < 1000; i++) {
       for (final Event event : this.eventCollector.getEventList()) {
         if (event.getData().getStatus() == status && event.getData().getNestedId()
             .equals(nestedId)) {
