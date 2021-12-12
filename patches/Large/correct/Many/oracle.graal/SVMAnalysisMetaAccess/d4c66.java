diff --git a/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/analysis/SVMAnalysisMetaAccess.java b/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/analysis/SVMAnalysisMetaAccess.java
index 69880c8..0b86e2b 100644
--- a/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/analysis/SVMAnalysisMetaAccess.java
+++ b/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/analysis/SVMAnalysisMetaAccess.java
@@ -44,6 +44,6 @@
 
     @Override
     public int getArrayIndexScale(JavaKind elementKind) {
-        return getObjectLayout().getArrayBaseOffset(elementKind);
+        return getObjectLayout().getArrayIndexScale(elementKind);
     }
 }
