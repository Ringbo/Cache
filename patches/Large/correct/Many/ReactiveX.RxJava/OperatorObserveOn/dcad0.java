diff --git a/rxjava-core/src/main/java/rx/internal/operators/OperatorObserveOn.java b/rxjava-core/src/main/java/rx/internal/operators/OperatorObserveOn.java
index f7e3482..42bad82 100644
--- a/rxjava-core/src/main/java/rx/internal/operators/OperatorObserveOn.java
+++ b/rxjava-core/src/main/java/rx/internal/operators/OperatorObserveOn.java
@@ -138,7 +138,7 @@
                     }
                     on.accept(observer, v);
                 }
-                if (COUNTER_UPDATER.addAndGet(this, -vs.size) == 0) {
+                if (COUNTER_UPDATER.addAndGet(this, -vs.size) <= 0) {
                     break;
                 }
             } while (true);
