diff --git a/integration-tests/src/test/java/tachyon/master/PinIntegrationTest.java b/integration-tests/src/test/java/tachyon/master/PinIntegrationTest.java
index 7f50ea1..a9ad2e0 100644
--- a/integration-tests/src/test/java/tachyon/master/PinIntegrationTest.java
+++ b/integration-tests/src/test/java/tachyon/master/PinIntegrationTest.java
@@ -83,7 +83,7 @@
 
     mTfs.setState(file, mUnsetPinned);
     Assert.assertFalse(mTfs.getInfo(file).isPinned);
-    Assert.assertEquals(Sets.newHashSet(mFSMasterClient.getPinList()), Sets.<Integer>newHashSet());
+    Assert.assertEquals(Sets.newHashSet(mFSMasterClient.getPinList()), Sets.<Long>newHashSet());
 
     // Pinning a folder should recursively pin subfolders.
     mTfs.setState(dir, mSetPinned);
@@ -94,7 +94,7 @@
     // Same with unpinning.
     mTfs.setState(dir0, mUnsetPinned);
     Assert.assertFalse(mTfs.getInfo(file).isPinned);
-    Assert.assertEquals(Sets.newHashSet(mFSMasterClient.getPinList()), Sets.<Integer>newHashSet());
+    Assert.assertEquals(Sets.newHashSet(mFSMasterClient.getPinList()), Sets.<Long>newHashSet());
 
     // The last pin command always wins.
     mTfs.setState(file, mSetPinned);
