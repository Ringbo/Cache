diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ReturnTypeSpecializationTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ReturnTypeSpecializationTest.java
index f63781d..68ef6e4 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ReturnTypeSpecializationTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/ReturnTypeSpecializationTest.java
@@ -80,7 +80,7 @@
         @Child TestChildNode left;
         @Child TestChildNode right;
 
-        public TestRootNode(FrameDescriptor descriptor, TestChildNode left, TestChildNode right) {
+        TestRootNode(FrameDescriptor descriptor, TestChildNode left, TestChildNode right) {
             super(TestingLanguage.class, null, descriptor);
             this.left = left;
             this.right = right;
@@ -95,7 +95,7 @@
 
     abstract class TestChildNode extends Node {
 
-        public TestChildNode() {
+        TestChildNode() {
             super(null);
         }
 
@@ -114,7 +114,7 @@
 
         protected final FrameSlot slot;
 
-        public FrameSlotNode(FrameSlot slot) {
+        FrameSlotNode(FrameSlot slot) {
             this.slot = slot;
         }
     }
