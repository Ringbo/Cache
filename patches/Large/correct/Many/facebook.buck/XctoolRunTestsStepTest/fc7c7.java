diff --git a/test/com/facebook/buck/apple/XctoolRunTestsStepTest.java b/test/com/facebook/buck/apple/XctoolRunTestsStepTest.java
index 778af03..da0f8e5 100644
--- a/test/com/facebook/buck/apple/XctoolRunTestsStepTest.java
+++ b/test/com/facebook/buck/apple/XctoolRunTestsStepTest.java
@@ -359,7 +359,7 @@
   }
 
   @Test
-  public void xctoolCommandWithTestSelectorMatchingNothingFails() throws Exception {
+  public void xctoolCommandWithTestSelectorMatchingNothingDoesNotFail() throws Exception {
     FakeProjectFilesystem projectFilesystem = new FakeProjectFilesystem();
     XctoolRunTestsStep step = new XctoolRunTestsStep(
         projectFilesystem,
@@ -412,7 +412,7 @@
           .build();
       assertThat(
           step.execute(executionContext),
-          equalTo(1));
+          equalTo(0));
     }
   }
 }
