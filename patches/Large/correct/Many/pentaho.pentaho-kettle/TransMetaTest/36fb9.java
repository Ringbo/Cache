diff --git a/plugins/meta-inject-plugin/src/test/java/org/pentaho/di/trans/TransMetaTest.java b/plugins/meta-inject-plugin/src/test/java/org/pentaho/di/trans/TransMetaTest.java
index e58e325..2555239 100644
--- a/plugins/meta-inject-plugin/src/test/java/org/pentaho/di/trans/TransMetaTest.java
+++ b/plugins/meta-inject-plugin/src/test/java/org/pentaho/di/trans/TransMetaTest.java
@@ -137,7 +137,7 @@
     }
 
     // verify another functions
-    TransMeta.addStep( 1, deletedStep );
+    TransMeta.addStep( deletedStep );
     assertEquals( TransMeta.nrSteps(), 3 );
     assertEquals( TransMeta.nrStepChangeListeners(), 2 );
 
