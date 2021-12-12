diff --git a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/SpecializationFallthroughTest.java b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/SpecializationFallthroughTest.java
index f505d5f..8656f17 100644
--- a/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/SpecializationFallthroughTest.java
+++ b/truffle/com.oracle.truffle.api.dsl.test/src/com/oracle/truffle/api/dsl/test/SpecializationFallthroughTest.java
@@ -66,7 +66,7 @@
 
         static int fallthroughCount = 0;
 
-        public FallthroughTest0() {
+        FallthroughTest0() {
             fallthroughCount = 0;
         }
 
@@ -111,7 +111,7 @@
 
         static int fallthroughCount;
 
-        public FallthroughTest1() {
+        FallthroughTest1() {
             fallthroughCount = 0;
         }
 
