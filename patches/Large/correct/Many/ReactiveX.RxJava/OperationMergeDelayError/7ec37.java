diff --git a/rxjava-core/src/main/java/rx/operators/OperationMergeDelayError.java b/rxjava-core/src/main/java/rx/operators/OperationMergeDelayError.java
index d899ca1..704ea18 100644
--- a/rxjava-core/src/main/java/rx/operators/OperationMergeDelayError.java
+++ b/rxjava-core/src/main/java/rx/operators/OperationMergeDelayError.java
@@ -168,7 +168,7 @@
             /**
              * Subscribe to the parent Observable to get to the children Observables
              */
-            completeSubscription.add(sequences.subscribe(new ParentObserver(actualObserver)));
+            completeSubscription.add(sequences.subscribe(new ParentObserver(synchronizedObserver)));
 
             /* return our subscription to allow unsubscribing */
             return completeSubscription;
