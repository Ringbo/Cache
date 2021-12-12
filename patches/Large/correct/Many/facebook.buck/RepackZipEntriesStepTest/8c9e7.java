diff --git a/test/com/facebook/buck/step/fs/RepackZipEntriesStepTest.java b/test/com/facebook/buck/step/fs/RepackZipEntriesStepTest.java
index 52a28fd..0b1b145 100644
--- a/test/com/facebook/buck/step/fs/RepackZipEntriesStepTest.java
+++ b/test/com/facebook/buck/step/fs/RepackZipEntriesStepTest.java
@@ -52,7 +52,7 @@
     String unzipExpected = Joiner.on(" ").join(new ImmutableList.Builder<String>()
         .add("unzip")
         .add("-o")
-        .add("-d").add(dir.getPath())
+        .add("-d").add(dir.getAbsolutePath())
         .add(inApk)
         .addAll(entries)
         .build());
@@ -92,7 +92,7 @@
     assertEquals(zipExpected, zipStep.getShellCommand(context));
 
     //ShellStep zipCommand = iter.next();
-    assertEquals(zipStep.getWorkingDirectory(), dir);
+    assertEquals(zipStep.getWorkingDirectory().getAbsolutePath(), dir.getAbsolutePath());
 
     verify(context);
   }
