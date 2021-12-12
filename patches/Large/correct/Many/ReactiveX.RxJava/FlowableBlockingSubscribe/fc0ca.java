diff --git a/src/main/java/io/reactivex/internal/operators/flowable/FlowableBlockingSubscribe.java b/src/main/java/io/reactivex/internal/operators/flowable/FlowableBlockingSubscribe.java
index 3d40aef..c5ac688 100644
--- a/src/main/java/io/reactivex/internal/operators/flowable/FlowableBlockingSubscribe.java
+++ b/src/main/java/io/reactivex/internal/operators/flowable/FlowableBlockingSubscribe.java
@@ -63,7 +63,7 @@
                 if (bs.isCancelled()) {
                     break;
                 }
-                if (o == BlockingSubscriber.TERMINATED
+                if (v == BlockingSubscriber.TERMINATED
                         || NotificationLite.acceptFull(v, subscriber)) {
                     break;
                 }
