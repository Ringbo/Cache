diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
index a417be3..e805ff7 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
@@ -3110,7 +3110,7 @@
         private final boolean fastPath;
         private final boolean needsCastedValues;
 
-        public SpecializationBody(boolean fastPath, boolean needsCastedValues) {
+        SpecializationBody(boolean fastPath, boolean needsCastedValues) {
             this.fastPath = fastPath;
             this.needsCastedValues = needsCastedValues;
         }
