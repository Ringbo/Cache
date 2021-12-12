diff --git a/src/main/org/codehaus/groovy/runtime/MetaClassHelper.java b/src/main/org/codehaus/groovy/runtime/MetaClassHelper.java
index a10851c..d01fd76 100644
--- a/src/main/org/codehaus/groovy/runtime/MetaClassHelper.java
+++ b/src/main/org/codehaus/groovy/runtime/MetaClassHelper.java
@@ -802,7 +802,7 @@
         String logname = "methodCalls." + className + "." + methodName;
         Logger objLog = Logger.getLogger(logname);
         if (!objLog.isLoggable(Level.FINER)) return;
-        StringBuffer msg = new StringBuffer(methodName);
+        StringBuilder msg = new StringBuilder(methodName);
         msg.append("(");
         if (arguments != null) {
             for (int i = 0; i < arguments.length;) {
