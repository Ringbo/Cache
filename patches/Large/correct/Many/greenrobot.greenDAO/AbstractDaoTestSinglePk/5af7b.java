diff --git a/DaoCore/src/de/greenrobot/dao/test/AbstractDaoTestSinglePk.java b/DaoCore/src/de/greenrobot/dao/test/AbstractDaoTestSinglePk.java
index 85a8dca..ce3d450 100644
--- a/DaoCore/src/de/greenrobot/dao/test/AbstractDaoTestSinglePk.java
+++ b/DaoCore/src/de/greenrobot/dao/test/AbstractDaoTestSinglePk.java
@@ -288,6 +288,7 @@
         return cursor;
     }
 
+    /** Provides a collision free PK () not returned before in the current test. */
     protected K nextPk() {
         for (int i = 0; i < 100000; i++) {
             K pk = createRandomPk();
@@ -299,7 +300,7 @@
     }
 
     protected T createEntityWithRandomPk() {
-        return createEntity(createRandomPk());
+        return createEntity(nextPk());
     }
 
     /** K does not have to be collision free, check nextPk for collision free PKs. */
