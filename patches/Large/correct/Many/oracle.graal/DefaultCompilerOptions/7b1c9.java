diff --git a/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/impl/DefaultCompilerOptions.java b/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/impl/DefaultCompilerOptions.java
index 6ca6f4c..a2f1413 100644
--- a/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/impl/DefaultCompilerOptions.java
+++ b/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/impl/DefaultCompilerOptions.java
@@ -35,7 +35,7 @@
     }
 
     public void setOption(String name, Object value) {
-        throw new UnsupportedOperationException(String.format("Option %s is not supported by this runtime"));
+        throw new UnsupportedOperationException(String.format("Option %s is not supported by this runtime", name));
     }
 
 }
