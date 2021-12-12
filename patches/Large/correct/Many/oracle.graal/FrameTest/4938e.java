diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FrameTest.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FrameTest.java
index d287eae..808c049 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FrameTest.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/FrameTest.java
@@ -110,7 +110,7 @@
         @Child TestChildNode left;
         @Child TestChildNode right;
 
-        public TestRootNode(FrameDescriptor descriptor, TestChildNode left, TestChildNode right) {
+        TestRootNode(FrameDescriptor descriptor, TestChildNode left, TestChildNode right) {
             super(TestingLanguage.class, null, descriptor);
             this.left = left;
             this.right = right;
@@ -124,7 +124,7 @@
 
     abstract class TestChildNode extends Node {
 
-        public TestChildNode() {
+        TestChildNode() {
             super(null);
         }
 
@@ -135,7 +135,7 @@
 
         protected final FrameSlot slot;
 
-        public FrameSlotNode(FrameSlot slot) {
+        FrameSlotNode(FrameSlot slot) {
             this.slot = slot;
         }
     }
@@ -175,7 +175,7 @@
 
         class FrameRootNode extends RootNode {
 
-            public FrameRootNode() {
+            FrameRootNode() {
                 super(TestingLanguage.class, null, null);
             }
 
