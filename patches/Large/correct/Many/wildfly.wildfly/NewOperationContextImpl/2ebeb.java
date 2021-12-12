diff --git a/controller/src/main/java/org/jboss/as/controller/NewOperationContextImpl.java b/controller/src/main/java/org/jboss/as/controller/NewOperationContextImpl.java
index ac88aaa..9ee3331 100644
--- a/controller/src/main/java/org/jboss/as/controller/NewOperationContextImpl.java
+++ b/controller/src/main/java/org/jboss/as/controller/NewOperationContextImpl.java
@@ -145,7 +145,7 @@
         if (currentStage == Stage.DONE) {
             throw new IllegalStateException("Operation already complete");
         }
-        if (stage.compareTo(currentStage) > 0) {
+        if (stage.compareTo(currentStage) < 0) {
             throw new IllegalStateException("Stage " + stage + " is already complete");
         }
         if (contextType == Type.MANAGEMENT && stage.compareTo(Stage.MODEL) > 0) {
