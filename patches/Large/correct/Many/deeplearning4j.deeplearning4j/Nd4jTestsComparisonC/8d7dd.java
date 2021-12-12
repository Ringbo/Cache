diff --git a/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsComparisonC.java b/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsComparisonC.java
index a6af601..b0660c4 100644
--- a/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsComparisonC.java
+++ b/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsComparisonC.java
@@ -84,7 +84,7 @@
     	for( int i = 0; i < first.size(); i++ ){
     		for( int j = 0; j < second.size(); j++ ){
     			Pair<INDArray,String> p1 = first.get(i);
-    			Pair<INDArray,String> p2 = second.get(i);
+    			Pair<INDArray,String> p2 = second.get(j);
     			String errorMsg = getTestWithOpsErrorMsg(i,j,"mmul",p1,p2);
     			assertTrue(errorMsg, CheckUtil.checkMmul(p1.getFirst(), p2.getFirst(), 1e-4, 1e-6));
     		}
@@ -98,7 +98,7 @@
     	for( int i=0; i<first.size(); i++ ){
     		for( int j=0; j<second.size(); j++ ){
     			Pair<INDArray,String> p1 = first.get(i);
-    			Pair<INDArray,String> p2 = second.get(i);
+    			Pair<INDArray,String> p2 = second.get(j);
     			String errorMsg1 = getTestWithOpsErrorMsg(i,j,"add",p1,p2);
     			String errorMsg2 = getTestWithOpsErrorMsg(i,j,"sub",p1,p2);
     			assertTrue(errorMsg1,CheckUtil.checkAdd(p1.getFirst(), p2.getFirst(), 1e-4, 1e-6));
