diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/linalg/cpu/nativecpu/NDArray.java b/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/linalg/cpu/nativecpu/NDArray.java
index fee10a5..8655d56 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/linalg/cpu/nativecpu/NDArray.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/linalg/cpu/nativecpu/NDArray.java
@@ -359,11 +359,18 @@
         return new BaseNDArrayProxy(this);
     }
 
+    /**
+     * This method does direct array copy. Impossible to use on views or mixed orders.
+     *
+     * PLEASE NOTE: YOU SHOULD NEVER USE THIS METHOD, UNLESS YOU 100% CLEAR ABOUT IT
+     *
+     * @return
+     */
     @Override
-    public INDArray unsafeDuplication() {
+    public synchronized INDArray unsafeDuplication() {
         INDArray ret = Nd4j.createUninitialized(this.shape(), this.ordering());
 
-        Pointer.memcpy(ret.data().addressPointer(), this.data().addressPointer(), this.data().getElementSize());
+        Pointer.memcpy(ret.data().addressPointer(), this.data().addressPointer(), this.data().length() * this.data().getElementSize());
 
         return ret;
     }
