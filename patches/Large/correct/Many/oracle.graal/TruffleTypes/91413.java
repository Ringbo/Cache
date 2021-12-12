diff --git a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/TruffleTypes.java b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/TruffleTypes.java
index 857fb84..66a4388 100644
--- a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/TruffleTypes.java
+++ b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/TruffleTypes.java
@@ -161,7 +161,7 @@
         return slowPath;
     }
 
-    public Object getSourceSection() {
+    public DeclaredType getSourceSection() {
         return sourceSection;
     }
 }
