diff --git a/test/com/facebook/buck/shell/ShellStepTest.java b/test/com/facebook/buck/shell/ShellStepTest.java
index 097da9b..129023a 100644
--- a/test/com/facebook/buck/shell/ShellStepTest.java
+++ b/test/com/facebook/buck/shell/ShellStepTest.java
@@ -176,14 +176,14 @@
     ShellStep command = createCommand(ENV, ARGS, PATH);
     assertEquals(
         String.format("(cd '%s' && V1='two words' V2='$foo'\\''bar'\\''' bash -c 'echo $V1 $V2')",
-            PATH.getAbsolutePath()),
+            PATH.getPath()),
         command.getDescription(context));
   }
 
   @Test
   public void testDescriptionWithPath() {
     ShellStep command = createCommand(ImmutableMap.<String,String>of(), ARGS, PATH);
-    assertEquals(String.format("(cd '%s' && bash -c 'echo $V1 $V2')", PATH.getAbsolutePath()),
+    assertEquals(String.format("(cd '%s' && bash -c 'echo $V1 $V2')", PATH.getPath()),
         command.getDescription(context));
   }
 
