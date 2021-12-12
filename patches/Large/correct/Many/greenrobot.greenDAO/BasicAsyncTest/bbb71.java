diff --git a/DaoTest/src/androidTest/java/org/greenrobot/greendao/daotest/async/BasicAsyncTest.java b/DaoTest/src/androidTest/java/org/greenrobot/greendao/daotest/async/BasicAsyncTest.java
index fa4e74a..63b19bd 100644
--- a/DaoTest/src/androidTest/java/org/greenrobot/greendao/daotest/async/BasicAsyncTest.java
+++ b/DaoTest/src/androidTest/java/org/greenrobot/greendao/daotest/async/BasicAsyncTest.java
@@ -172,7 +172,7 @@
         assertWaitForCompletion1Sec();
         while (!testListenerMainThread_done) {
             synchronized (listener) {
-                listener.wait();
+                listener.wait(1000);
             }
         }
     }
