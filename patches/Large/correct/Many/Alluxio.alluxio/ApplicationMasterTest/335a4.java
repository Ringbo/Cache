diff --git a/integration/yarn/src/test/java/tachyon/yarn/ApplicationMasterTest.java b/integration/yarn/src/test/java/tachyon/yarn/ApplicationMasterTest.java
index a66272e..005f315 100644
--- a/integration/yarn/src/test/java/tachyon/yarn/ApplicationMasterTest.java
+++ b/integration/yarn/src/test/java/tachyon/yarn/ApplicationMasterTest.java
@@ -185,7 +185,7 @@
   public void stopTest() throws Exception {
     mMaster.stop();
     Mockito.verify(mRMClient).unregisterApplicationMaster(FinalApplicationStatus.SUCCEEDED, "", "");
-    Mockito.verify(mRMClient).start();
+    Mockito.verify(mRMClient).stop();
   }
 
   /**
