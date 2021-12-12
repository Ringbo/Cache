diff --git a/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsComparisonFortran.java b/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsComparisonFortran.java
index 8a658e0..8d5ca13 100644
--- a/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsComparisonFortran.java
+++ b/nd4j-tests/src/test/java/org/nd4j/linalg/Nd4jTestsComparisonFortran.java
@@ -85,7 +85,7 @@
       	for( int i = 0; i < first.size(); i++ ){
     		for( int j = 0; j < second.size(); j++ ){
     			Pair<INDArray,String> p1 = first.get(i);
-    			Pair<INDArray,String> p2 = second.get(i);
+    			Pair<INDArray,String> p2 = second.get(j);
     			String errorMsg = getTestWithOpsErrorMsg(i,j,"mmul",p1,p2);
     			assertTrue(errorMsg, CheckUtil.checkMmul(p1.getFirst(), p2.getFirst(), 1e-4, 1e-6));
     		}
@@ -99,7 +99,7 @@
     	for( int i = 0; i< first.size(); i++) {
     		for( int j = 0; j< second.size(); j++) {
     			Pair<INDArray,String> p1 = first.get(i);
-    			Pair<INDArray,String> p2 = second.get(i);
+    			Pair<INDArray,String> p2 = second.get(j);
     			String errorMsg1 = getTestWithOpsErrorMsg(i, j, "add", p1, p2);
     			String errorMsg2 = getTestWithOpsErrorMsg(i, j, "sub", p1, p2);
                 boolean addFail = CheckUtil.checkAdd(p1.getFirst(), p2.getFirst(), 1e-4, 1e-6);
