diff --git a/graal/com.oracle.graal.bytecode/src/com/oracle/graal/bytecode/ResolvedJavaMethodBytecode.java b/graal/com.oracle.graal.bytecode/src/com/oracle/graal/bytecode/ResolvedJavaMethodBytecode.java
index 02e65c7..28efe22 100644
--- a/graal/com.oracle.graal.bytecode/src/com/oracle/graal/bytecode/ResolvedJavaMethodBytecode.java
+++ b/graal/com.oracle.graal.bytecode/src/com/oracle/graal/bytecode/ResolvedJavaMethodBytecode.java
@@ -98,6 +98,6 @@
 
     @Override
     public String toString() {
-        return getClass().getName() + method.format("<%H.%n(%p)>");
+        return getClass().getSimpleName() + method.format("<%h.%n(%p)>");
     }
 }
