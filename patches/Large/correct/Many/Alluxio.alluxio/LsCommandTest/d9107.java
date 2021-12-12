diff --git a/tests/src/test/java/alluxio/shell/command/LsCommandTest.java b/tests/src/test/java/alluxio/shell/command/LsCommandTest.java
index da964c5..91d083e 100644
--- a/tests/src/test/java/alluxio/shell/command/LsCommandTest.java
+++ b/tests/src/test/java/alluxio/shell/command/LsCommandTest.java
@@ -90,7 +90,7 @@
     String expected = "";
     expected += getLsNoAclResultStr("/testRoot/testFileA", files[0].getCreationTimeMs(), 10,
         LsCommand.STATE_FILE_IN_MEMORY);
-    expected += getLsNoAclResultStr("/testRoot/testDir", files[1].getCreationTimeMs(), 0,
+    expected += getLsNoAclResultStr("/testRoot/testDir", files[1].getCreationTimeMs(), 1,
         LsCommand.STATE_FOLDER);
     expected += getLsNoAclResultStr("/testRoot/testFileC", files[3].getCreationTimeMs(), 30,
         LsCommand.STATE_FILE_NOT_IN_MEMORY);
@@ -115,7 +115,7 @@
         LsCommand.STATE_FILE_IN_MEMORY, testUser, testUser, files[0].getPermission(),
         files[0].isFolder());
     expected +=
-        getLsResultStr("/testRoot/testDir", files[1].getCreationTimeMs(), 0, LsCommand.STATE_FOLDER,
+        getLsResultStr("/testRoot/testDir", files[1].getCreationTimeMs(), 1, LsCommand.STATE_FOLDER,
             testUser, testUser, files[1].getPermission(), files[1].isFolder());
     expected += getLsResultStr("/testRoot/testFileC", files[3].getCreationTimeMs(), 30,
         LsCommand.STATE_FILE_NOT_IN_MEMORY, testUser, testUser, files[3].getPermission(),
@@ -192,7 +192,7 @@
     expected += "WARNING: lsr is deprecated. Please use ls -R instead.\n";
     expected += getLsNoAclResultStr("/testRoot/testFileA", files[0].getCreationTimeMs(), 10,
         LsCommand.STATE_FILE_IN_MEMORY);
-    expected += getLsNoAclResultStr("/testRoot/testDir", files[1].getCreationTimeMs(), 0,
+    expected += getLsNoAclResultStr("/testRoot/testDir", files[1].getCreationTimeMs(), 1,
         LsCommand.STATE_FOLDER);
     expected += getLsNoAclResultStr("/testRoot/testDir/testFileB", files[2].getCreationTimeMs(), 20,
         LsCommand.STATE_FILE_IN_MEMORY);
@@ -221,7 +221,7 @@
         LsCommand.STATE_FILE_IN_MEMORY, testUser, testUser, files[0].getPermission(),
         files[0].isFolder());
     expected +=
-        getLsResultStr("/testRoot/testDir", files[1].getCreationTimeMs(), 0, LsCommand.STATE_FOLDER,
+        getLsResultStr("/testRoot/testDir", files[1].getCreationTimeMs(), 1, LsCommand.STATE_FOLDER,
             testUser, testUser, files[1].getPermission(), files[1].isFolder());
     expected += getLsResultStr("/testRoot/testDir/testFileB", files[2].getCreationTimeMs(), 20,
         LsCommand.STATE_FILE_IN_MEMORY, testUser, testUser, files[2].getPermission(),
