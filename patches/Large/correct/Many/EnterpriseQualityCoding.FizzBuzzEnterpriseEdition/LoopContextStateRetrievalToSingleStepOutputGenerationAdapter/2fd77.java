diff --git a/src/main/java/com/seriouscompany/business/java/fizzbuzz/packagenamingpackage/impl/strategies/adapters/LoopContextStateRetrievalToSingleStepOutputGenerationAdapter.java b/src/main/java/com/seriouscompany/business/java/fizzbuzz/packagenamingpackage/impl/strategies/adapters/LoopContextStateRetrievalToSingleStepOutputGenerationAdapter.java
index 94f5557..0c55e09 100644
--- a/src/main/java/com/seriouscompany/business/java/fizzbuzz/packagenamingpackage/impl/strategies/adapters/LoopContextStateRetrievalToSingleStepOutputGenerationAdapter.java
+++ b/src/main/java/com/seriouscompany/business/java/fizzbuzz/packagenamingpackage/impl/strategies/adapters/LoopContextStateRetrievalToSingleStepOutputGenerationAdapter.java
@@ -7,7 +7,7 @@
 
 	private LoopContextStateRetrieval myRetrievalObjectToAdapt;
 
-	public LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(LoopContextStepRetrieval retrievalToAdapt) {
+	public LoopContextStateRetrievalToSingleStepOutputGenerationAdapter(LoopContextStateRetrieval retrievalToAdapt) {
 		myRetrievalObjectToAdapt = retrievalToAdapt;
 	}
 
