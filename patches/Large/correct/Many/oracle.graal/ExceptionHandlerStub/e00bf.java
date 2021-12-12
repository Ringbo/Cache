diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/stubs/ExceptionHandlerStub.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/stubs/ExceptionHandlerStub.java
index 13b5fdd..971d829 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/stubs/ExceptionHandlerStub.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/stubs/ExceptionHandlerStub.java
@@ -73,7 +73,7 @@
         if (logging()) {
             printf("handling exception %p (", Word.fromObject(exception).rawValue());
             decipher(Word.fromObject(exception).rawValue());
-            printf(") at %p (", Word.fromObject(exception).rawValue(), exceptionPc.rawValue());
+            printf(") at %p (", exceptionPc.rawValue());
             decipher(exceptionPc.rawValue());
             printf(")\n");
         }
