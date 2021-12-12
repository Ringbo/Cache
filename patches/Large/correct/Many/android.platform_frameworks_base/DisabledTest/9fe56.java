diff --git a/core/tests/coretests/src/android/view/DisabledTest.java b/core/tests/coretests/src/android/view/DisabledTest.java
index d78e5e9..291a11c 100644
--- a/core/tests/coretests/src/android/view/DisabledTest.java
+++ b/core/tests/coretests/src/android/view/DisabledTest.java
@@ -78,7 +78,7 @@
         assertNotNull(mDisabledParent);
         assertFalse(mDisabled.isEnabled());
         assertTrue(mDisabledParent.isEnabled());
-        assertTrue(mDisabled.hasFocus());
+        assertFalse(mDisabled.hasFocus());
     }
 
     @MediumTest
