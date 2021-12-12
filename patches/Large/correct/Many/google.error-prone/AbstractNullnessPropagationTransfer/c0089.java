diff --git a/check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/AbstractNullnessPropagationTransfer.java b/check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/AbstractNullnessPropagationTransfer.java
index 51fbf63..1f13da8 100644
--- a/check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/AbstractNullnessPropagationTransfer.java
+++ b/check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/AbstractNullnessPropagationTransfer.java
@@ -236,7 +236,7 @@
     ResultingStore thenStore = updateStore(input.getThenStore(), thenUpdates);
     ResultingStore elseStore = updateStore(input.getElseStore(), elseUpdates);
     return conditionalResult(
-        thenStore.store, elseStore.store, thenStore.storeChanged | elseStore.storeChanged);
+        thenStore.store, elseStore.store, thenStore.storeChanged || elseStore.storeChanged);
   }
 
   void visitEqualTo(
@@ -251,7 +251,7 @@
     ResultingStore thenStore = updateStore(input.getThenStore(), thenUpdates);
     ResultingStore elseStore = updateStore(input.getElseStore(), elseUpdates);
     return conditionalResult(
-        thenStore.store, elseStore.store, thenStore.storeChanged | elseStore.storeChanged);
+        thenStore.store, elseStore.store, thenStore.storeChanged || elseStore.storeChanged);
   }
 
   void visitNotEqual(
@@ -311,7 +311,7 @@
       ResultingStore thenStore = updateStore(input.getThenStore(), thenUpdates, bothUpdates);
       ResultingStore elseStore = updateStore(input.getElseStore(), elseUpdates, bothUpdates);
       return conditionalResult(
-          thenStore.store, elseStore.store, thenStore.storeChanged | elseStore.storeChanged);
+          thenStore.store, elseStore.store, thenStore.storeChanged || elseStore.storeChanged);
     } else {
       return updateRegularStore(result, input, bothUpdates);
     }
@@ -849,7 +849,7 @@
     ResultingStore thenStore = updateStore(input.getThenStore(), thenUpdates);
     ResultingStore elseStore = updateStore(input.getElseStore(), elseUpdates);
     return new ConditionalTransferResult<>(
-        result, thenStore.store, elseStore.store, thenStore.storeChanged | elseStore.storeChanged);
+        result, thenStore.store, elseStore.store, thenStore.storeChanged || elseStore.storeChanged);
   }
 
   Nullness visitInstanceOf(
