diff --git a/h2o-core/src/main/java/hex/Model.java b/h2o-core/src/main/java/hex/Model.java
index 75a4210..c9b3aa3 100755
--- a/h2o-core/src/main/java/hex/Model.java
+++ b/h2o-core/src/main/java/hex/Model.java
@@ -690,7 +690,7 @@
       int[] interactionIndexes = new int[interactions.length];
       for(int i=0;i<interactions.length;++i)
         interactionIndexes[i] = test.find(interactions[i]);
-      test.add(makeInteractions(test, false, InteractionPair.generatePairwiseInteractionsFromList(interactionIndexes), true, false, false));
+      test.add(makeInteractions(test, false, InteractionPair.generatePairwiseInteractionsFromList(interactionIndexes), true, true, false));
     }
 
 
