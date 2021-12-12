diff --git a/test/com/facebook/buck/apple/AppleTestIntegrationTest.java b/test/com/facebook/buck/apple/AppleTestIntegrationTest.java
index 6d932b2..815334f 100644
--- a/test/com/facebook/buck/apple/AppleTestIntegrationTest.java
+++ b/test/com/facebook/buck/apple/AppleTestIntegrationTest.java
@@ -284,7 +284,7 @@
         containsString(
             "Set xctool_path = /path/to/xctool or xctool_zip_target = //path/to:xctool-zip in the "
                 + "[apple] section of .buckconfig to run this test"));
-    workspace.runBuckCommand("test", "//:foo");
+    workspace.runBuckCommand("test", "//:foo", "--config", "apple.xctool_path=does/not/exist");
   }
 
   @Test
