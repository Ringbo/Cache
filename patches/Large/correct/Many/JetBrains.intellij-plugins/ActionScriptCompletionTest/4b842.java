diff --git a/flex/flex-tests/testSrc/com/intellij/flex/completion/ActionScriptCompletionTest.java b/flex/flex-tests/testSrc/com/intellij/flex/completion/ActionScriptCompletionTest.java
index 3d7585f..3d8b5a4 100644
--- a/flex/flex-tests/testSrc/com/intellij/flex/completion/ActionScriptCompletionTest.java
+++ b/flex/flex-tests/testSrc/com/intellij/flex/completion/ActionScriptCompletionTest.java
@@ -111,9 +111,9 @@
     assertEquals("____", elements[3].getLookupString());
     assertTrue(getBoldStatus(elements[3]));
     assertEquals("lVar", elements[0].getLookupString());
-    assertTrue(!getBoldStatus(elements[0]));
+    assertTrue(getBoldStatus(elements[0]));
     assertEquals("param", elements[1].getLookupString());
-    assertTrue(!getBoldStatus(elements[1]));
+    assertTrue(getBoldStatus(elements[1]));
 
     assertTrue(!getBoldStatus(elements[4]));
     assertEquals("Bar", elements[4].getLookupString());
