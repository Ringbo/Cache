diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArrayProxy.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArrayProxy.java
index f7ab3b6..d196529 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArrayProxy.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ndarray/BaseNDArrayProxy.java
@@ -54,7 +54,7 @@
     }
 	// READ DONE HERE - return an NDArray using the available backend
 	private Object readResolve() throws java.io.ObjectStreamException {
-        return Nd4j.create(this.data,this.arrayShape,this.arrayOrdering);
+        return Nd4j.create(this.data,this.arrayShape);
     }
     private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
         try {
