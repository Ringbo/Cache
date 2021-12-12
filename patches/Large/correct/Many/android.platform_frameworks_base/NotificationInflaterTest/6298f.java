diff --git a/packages/SystemUI/tests/src/com/android/systemui/statusbar/notification/NotificationInflaterTest.java b/packages/SystemUI/tests/src/com/android/systemui/statusbar/notification/NotificationInflaterTest.java
index 15381b7..0c5bdea 100644
--- a/packages/SystemUI/tests/src/com/android/systemui/statusbar/notification/NotificationInflaterTest.java
+++ b/packages/SystemUI/tests/src/com/android/systemui/statusbar/notification/NotificationInflaterTest.java
@@ -162,7 +162,7 @@
             }
         });
         block.run();
-        countDownLatch.await(5, java.util.concurrent.TimeUnit.SECONDS);
+        countDownLatch.await();
         if (exceptionHolder.mException != null) {
             throw exceptionHolder.mException;
         }
