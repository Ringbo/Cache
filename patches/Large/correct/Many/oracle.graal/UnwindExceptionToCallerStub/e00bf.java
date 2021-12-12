diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/stubs/UnwindExceptionToCallerStub.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/stubs/UnwindExceptionToCallerStub.java
index 819686a..25e262d 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/stubs/UnwindExceptionToCallerStub.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/stubs/UnwindExceptionToCallerStub.java
@@ -66,7 +66,7 @@
         if (logging()) {
             printf("unwinding exception %p (", exceptionOop.rawValue());
             decipher(exceptionOop.rawValue());
-            printf(") at %p (", exceptionOop.rawValue(), returnAddress.rawValue());
+            printf(") at %p (", returnAddress.rawValue());
             decipher(returnAddress.rawValue());
             printf(")\n");
         }
