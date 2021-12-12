diff --git a/graal/com.oracle.graal.test/src/com/oracle/graal/test/GraalVerboseTextListener.java b/graal/com.oracle.graal.test/src/com/oracle/graal/test/GraalVerboseTextListener.java
index 78003a2..2e38df7 100644
--- a/graal/com.oracle.graal.test/src/com/oracle/graal/test/GraalVerboseTextListener.java
+++ b/graal/com.oracle.graal.test/src/com/oracle/graal/test/GraalVerboseTextListener.java
@@ -65,7 +65,7 @@
 
     @Override
     public void testFailed(Failure failure) {
-        getWriter().println("FAILED");
+        getWriter().print("FAILED");
     }
 
     @Override
