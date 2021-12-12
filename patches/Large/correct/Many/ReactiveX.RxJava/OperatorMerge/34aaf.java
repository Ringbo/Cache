diff --git a/rxjava-core/src/main/java/rx/internal/operators/OperatorMerge.java b/rxjava-core/src/main/java/rx/internal/operators/OperatorMerge.java
index 271f1c9..6012c44 100644
--- a/rxjava-core/src/main/java/rx/internal/operators/OperatorMerge.java
+++ b/rxjava-core/src/main/java/rx/internal/operators/OperatorMerge.java
@@ -535,7 +535,9 @@
                             emitted++;
                         }
                     } else {
-                        if (producer.requested > 0) {
+                        // this needs to check q.count() as draining above may not have drained the full queue
+                        // perf tests show this to be okay, though different queue implementations could perform poorly with this
+                        if (producer.requested > 0 && q.count() == 0) {
                             if (complete) {
                                 parentSubscriber.completeInner(this);
                             } else {
