diff --git a/app/src/androidTest/java/org/isoron/uhabits/BaseViewTest.java b/app/src/androidTest/java/org/isoron/uhabits/BaseViewTest.java
index b886a56..f01b0f9 100644
--- a/app/src/androidTest/java/org/isoron/uhabits/BaseViewTest.java
+++ b/app/src/androidTest/java/org/isoron/uhabits/BaseViewTest.java
@@ -225,7 +225,7 @@
         throws IOException
     {
         File dir = FileUtils.getSDCardDir("test-screenshots");
-        if (dir == null) dir = FileUtils.getFilesDir(testContext,"test-screenshots");
+        if (dir == null) dir = FileUtils.getFilesDir(targetContext,"test-screenshots");
         if (dir == null) throw new RuntimeException(
             "Could not find suitable dir for screenshots");
 
