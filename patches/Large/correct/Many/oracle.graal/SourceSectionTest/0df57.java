diff --git a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/SourceSectionTest.java b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/SourceSectionTest.java
index 1343ace..f4a4dd7 100644
--- a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/SourceSectionTest.java
+++ b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/SourceSectionTest.java
@@ -132,7 +132,7 @@
         // BEGIN: NodeWithFixedSourceSection
         private final SourceSection section;
 
-        public NodeWithFixedSourceSection(SourceSection section) {
+        NodeWithFixedSourceSection(SourceSection section) {
             this.section = section;
         }
 
