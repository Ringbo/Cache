diff --git a/h2o-core/src/test/java/water/TestUtil.java b/h2o-core/src/test/java/water/TestUtil.java
index 82d9c3b..13aff07 100644
--- a/h2o-core/src/test/java/water/TestUtil.java
+++ b/h2o-core/src/test/java/water/TestUtil.java
@@ -33,7 +33,7 @@
       }
     }
 
-    H2O.waitForCloudSize(x, 10000);
+    H2O.waitForCloudSize(x, 30000);
   }
 
   @BeforeClass()
