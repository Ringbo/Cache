diff --git a/test/com/facebook/buck/util/autosparse/AutoSparseStateEventsTest.java b/test/com/facebook/buck/util/autosparse/AutoSparseStateEventsTest.java
index 435c975..ae3110a 100644
--- a/test/com/facebook/buck/util/autosparse/AutoSparseStateEventsTest.java
+++ b/test/com/facebook/buck/util/autosparse/AutoSparseStateEventsTest.java
@@ -29,8 +29,7 @@
           "stdout:",
           "%s",
           "stderr:",
-          "%s",
-          "Traceback (most recent call last):",
+          "%sTraceback (most recent call last):",
           "  File \"/path/to/file1.py\", line 42, in frobnar",
           "    return adjust_the_jinglejangle(81)",
           "  File \"/path/to/file2.py\", line 19, in adjust_the_jinglejangle",
@@ -53,7 +52,10 @@
   public void pendingFailure() {
     String pending_lines =
         String.join(
-            "\n", "pending changes to 'foo/bar/baz.xml'", "pending changes to 'spam/ham/eggs.c'");
+            "\n",
+            "pending changes to 'foo/bar/baz.xml'",
+            "pending changes to 'spam/ham/eggs.c'",
+            "");
     String exception_line =
         "cannot change sparseness due to pending changes (delete the files or "
             + "use --force to bring them back dirty)";
@@ -61,7 +63,7 @@
     AutoSparseStateEvents.SparseRefreshFailed event = makeOne("", pending_lines, exception_line);
 
     assertEquals(
-        String.join("\n", FAILURE_INTRO, "", pending_lines, exception_line, ""),
+        String.join("\n", FAILURE_INTRO, "", pending_lines.trim(), exception_line, ""),
         event.getFailureDetails());
   }
 
