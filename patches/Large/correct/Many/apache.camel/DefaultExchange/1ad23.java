diff --git a/camel-core/src/main/java/org/apache/camel/impl/DefaultExchange.java b/camel-core/src/main/java/org/apache/camel/impl/DefaultExchange.java
index 340537b..3045838 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/DefaultExchange.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/DefaultExchange.java
@@ -394,7 +394,7 @@
 
     public void setUnitOfWork(UnitOfWork unitOfWork) {
         this.unitOfWork = unitOfWork;
-        if (onCompletions != null) {
+        if (unitOfWork != null && onCompletions != null) {
             // now an unit of work has been assigned so add the on completions
             // we might have registered already
             for (Synchronization onCompletion : onCompletions) {
