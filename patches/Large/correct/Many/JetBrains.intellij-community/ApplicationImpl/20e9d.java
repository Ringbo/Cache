diff --git a/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationImpl.java b/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationImpl.java
index db4693c..0578a05 100644
--- a/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationImpl.java
@@ -1280,7 +1280,7 @@
   private void endWrite(/*@NotNull*/ Class clazz) {
     try {
       myWriteActionsStack.pop();
-      if (gatherWriteActionStatistics && myWriteActionsStack.isEmpty()) {
+      if (gatherWriteActionStatistics && myWriteActionsStack.isEmpty() && !myWriteActionPending) {
         writePauses.finished("write action ("+clazz+")");
       }
       fireWriteActionFinished(clazz);
