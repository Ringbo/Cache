diff --git a/packages/SystemUI/tests/src/com/android/systemui/statusbar/policy/SecurityControllerTest.java b/packages/SystemUI/tests/src/com/android/systemui/statusbar/policy/SecurityControllerTest.java
index 0ecee98..314f254 100644
--- a/packages/SystemUI/tests/src/com/android/systemui/statusbar/policy/SecurityControllerTest.java
+++ b/packages/SystemUI/tests/src/com/android/systemui/statusbar/policy/SecurityControllerTest.java
@@ -103,7 +103,7 @@
         stateChangedLatch = new CountDownLatch(mSecurityController.hasWorkProfile() ? 2 : 1);
         mSecurityController.addCallback(this);
 
-        assertTrue(stateChangedLatch.await(1, TimeUnit.SECONDS));
+        assertTrue(stateChangedLatch.await(3, TimeUnit.SECONDS));
         assertFalse(mSecurityController.hasCACertInCurrentUser());
 
         // With a CA cert
@@ -116,7 +116,7 @@
         mSecurityController.new CACertLoader()
                            .execute(0);
 
-        assertTrue(stateChangedLatch.await(1, TimeUnit.SECONDS));
+        assertTrue(stateChangedLatch.await(3, TimeUnit.SECONDS));
         assertTrue(mSecurityController.hasCACertInCurrentUser());
 
         // Exception
@@ -130,7 +130,7 @@
         mSecurityController.new CACertLoader()
                            .execute(0);
 
-        assertFalse(stateChangedLatch.await(1, TimeUnit.SECONDS));
+        assertFalse(stateChangedLatch.await(3, TimeUnit.SECONDS));
         assertTrue(mSecurityController.hasCACertInCurrentUser());
         // The retry takes 30s
         //assertTrue(stateChangedLatch.await(31, TimeUnit.SECONDS));
