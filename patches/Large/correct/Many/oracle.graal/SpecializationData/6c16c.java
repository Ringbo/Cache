diff --git a/truffle/src/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/model/SpecializationData.java b/truffle/src/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/model/SpecializationData.java
index 4cfdf1c..02aa24d 100644
--- a/truffle/src/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/model/SpecializationData.java
+++ b/truffle/src/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/model/SpecializationData.java
@@ -449,7 +449,7 @@
             return true;
         }
 
-        if (prev.hasMultipleInstances()) {
+        if (prev.isGuardBindsCache()) {
             // may fallthrough due to limit
             return true;
         }
