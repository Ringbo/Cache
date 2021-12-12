diff --git a/compiler/tests/org/jetbrains/jet/cli/jvm/compiler/NamespaceComparator.java b/compiler/tests/org/jetbrains/jet/cli/jvm/compiler/NamespaceComparator.java
index 42e2979..9beaf0c 100644
--- a/compiler/tests/org/jetbrains/jet/cli/jvm/compiler/NamespaceComparator.java
+++ b/compiler/tests/org/jetbrains/jet/cli/jvm/compiler/NamespaceComparator.java
@@ -57,7 +57,7 @@
                 FileUtil.writeToFile(txtFile, serialized);
                 Assert.fail("Expected data file did not exist. Generating: " + txtFile);
             }
-            String expected = FileUtil.loadFile(txtFile);
+            String expected = FileUtil.loadFile(txtFile, true);
 
             // compare with hardcopy: make sure nothing is lost in output
             Assert.assertEquals(expected, serialized);
