diff --git a/domain-controller/src/main/java/org/jboss/as/domain/controller/DomainControllerService.java b/domain-controller/src/main/java/org/jboss/as/domain/controller/DomainControllerService.java
index 149670d..24b35a1 100644
--- a/domain-controller/src/main/java/org/jboss/as/domain/controller/DomainControllerService.java
+++ b/domain-controller/src/main/java/org/jboss/as/domain/controller/DomainControllerService.java
@@ -197,7 +197,7 @@
         };
         for (ModelNode update : updates) {
             count.incrementAndGet();
-            controller.execute(ExecutionContextBuilder.Factory.create(update).build(), resultHandler);
+            domainModel.execute(ExecutionContextBuilder.Factory.create(update).build(), resultHandler);
         }
         if (count.decrementAndGet() == 0) {
             // some action?
