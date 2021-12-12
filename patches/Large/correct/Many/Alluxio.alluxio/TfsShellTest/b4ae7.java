diff --git a/integration-tests/src/test/java/tachyon/shell/TfsShellTest.java b/integration-tests/src/test/java/tachyon/shell/TfsShellTest.java
index 84cd38e..af99b9d 100644
--- a/integration-tests/src/test/java/tachyon/shell/TfsShellTest.java
+++ b/integration-tests/src/test/java/tachyon/shell/TfsShellTest.java
@@ -528,15 +528,16 @@
     String expected = "";
     String format = "%-10s%-25s%-15s%-15s%-5s\n";
     expected += String.format(format, FormatUtils.getSizeFromBytes(10),
-        TfsShell.convertMsToDate(files[0].getCreationTimeMs()), "In Memory", testUser,
+        CommandUtils.convertMsToDate(files[0].getCreationTimeMs()), "In Memory", testUser,
         "/testRoot/testFileA");
     expected += String.format(format, FormatUtils.getSizeFromBytes(0),
-        TfsShell.convertMsToDate(files[1].getCreationTimeMs()), "", testUser, "/testRoot/testDir");
+        CommandUtils.convertMsToDate(files[1].getCreationTimeMs()), "", testUser,
+        "/testRoot/testDir");
     expected += String.format(format, FormatUtils.getSizeFromBytes(20),
-        TfsShell.convertMsToDate(files[2].getCreationTimeMs()), "In Memory", testUser,
+        CommandUtils.convertMsToDate(files[2].getCreationTimeMs()), "In Memory", testUser,
         "/testRoot/testDir/testFileB");
     expected += String.format(format, FormatUtils.getSizeFromBytes(30),
-        TfsShell.convertMsToDate(files[3].getCreationTimeMs()), "Not In Memory", testUser,
+        CommandUtils.convertMsToDate(files[3].getCreationTimeMs()), "Not In Memory", testUser,
         "/testRoot/testFileC");
     Assert.assertEquals(expected, mOutput.toString());
     // clear testing username
@@ -905,8 +906,8 @@
   TachyonException {
     String format = "%-10s%-25s%-15s%-15s%-5s\n";
     return String.format(format, FormatUtils.getSizeFromBytes(size),
-        TfsShell.convertMsToDate(mTfs.getInfo(mTfs.open(tUri)).getCreationTimeMs()), "In Memory",
-        testUser, tUri.getPath());
+        CommandUtils.convertMsToDate(mTfs.getInfo(mTfs.open(tUri)).getCreationTimeMs()),
+        "In Memory", testUser, tUri.getPath());
   }
 
   @Test
