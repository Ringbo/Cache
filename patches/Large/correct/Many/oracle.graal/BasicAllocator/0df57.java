diff --git a/truffle/com.oracle.truffle.object.basic/src/com/oracle/truffle/object/basic/BasicAllocator.java b/truffle/com.oracle.truffle.object.basic/src/com/oracle/truffle/object/basic/BasicAllocator.java
index ee42912..d444f72 100644
--- a/truffle/com.oracle.truffle.object.basic/src/com/oracle/truffle/object/basic/BasicAllocator.java
+++ b/truffle/com.oracle.truffle.object.basic/src/com/oracle/truffle/object/basic/BasicAllocator.java
@@ -47,12 +47,12 @@
 
 abstract class BasicAllocator extends ShapeImpl.BaseAllocator {
 
-    public BasicAllocator(LayoutImpl layout) {
+    BasicAllocator(LayoutImpl layout) {
         super(layout);
         advance(((BasicLayout) layout).getPrimitiveArrayLocation());
     }
 
-    public BasicAllocator(ShapeImpl shape) {
+    BasicAllocator(ShapeImpl shape) {
         super(shape);
     }
 
