diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FrameSlotTypeSpecializationTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FrameSlotTypeSpecializationTest.java
index da97e3d..d2f837c 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FrameSlotTypeSpecializationTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FrameSlotTypeSpecializationTest.java
@@ -80,7 +80,7 @@
         @Child TestChildNode left;
         @Child TestChildNode right;
 
-        public TestRootNode(FrameDescriptor descriptor, TestChildNode left, TestChildNode right) {
+        TestRootNode(FrameDescriptor descriptor, TestChildNode left, TestChildNode right) {
             super(TestingLanguage.class, null, descriptor);
             this.left = left;
             this.right = right;
@@ -106,7 +106,7 @@
 
         protected final FrameSlot slot;
 
-        public FrameSlotNode(FrameSlot slot) {
+        FrameSlotNode(FrameSlot slot) {
             this.slot = slot;
         }
     }
