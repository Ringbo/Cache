diff --git a/src/java/org/apache/commons/lang/exception/ExceptionUtils.java b/src/java/org/apache/commons/lang/exception/ExceptionUtils.java
index add3890..46390ff 100644
--- a/src/java/org/apache/commons/lang/exception/ExceptionUtils.java
+++ b/src/java/org/apache/commons/lang/exception/ExceptionUtils.java
@@ -806,7 +806,7 @@
         }
         Throwable throwables[] = getThrowables(throwable);
         int count = throwables.length;
-        ArrayList<String> frames = new ArrayList<String>();
+        List<String> frames = new ArrayList<String>();
         List<String> nextTrace = getStackFrameList(throwables[count - 1]);
         for (int i = count; --i >= 0;) {
             List<String> trace = nextTrace;
