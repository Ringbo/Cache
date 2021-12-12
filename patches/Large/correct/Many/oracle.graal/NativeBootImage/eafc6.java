diff --git a/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/image/NativeBootImage.java b/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/image/NativeBootImage.java
index d969a1d..c536594 100644
--- a/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/image/NativeBootImage.java
+++ b/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/image/NativeBootImage.java
@@ -389,7 +389,7 @@
                 heapSectionImpl = new BasicProgbitsSectionImpl(heapSectionBuffer.getBytes());
                 final String heapSectionName = SectionName.SVM_HEAP.getFormatDependentName(objectFile.getFormat());
                 heapSection = objectFile.newProgbitsSection(heapSectionName, objectFile.getPageSize(), writable, false, heapSectionImpl);
-                objectFile.createDefinedSymbol(heapSection.getName(), heapSection, 0, 0, false, true);
+                objectFile.createDefinedSymbol(heapSection.getName(), heapSection, 0, 0, false, false);
 
                 heap.setReadOnlySection(heapSection.getName(), 0);
                 long writableSectionOffset = heap.getReadOnlySectionSize();
