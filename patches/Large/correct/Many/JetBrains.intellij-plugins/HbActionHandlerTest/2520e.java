diff --git a/handlebars/test/src/com/dmarcotte/handlebars/editor/actions/HbActionHandlerTest.java b/handlebars/test/src/com/dmarcotte/handlebars/editor/actions/HbActionHandlerTest.java
index c7bb752..e7cb657 100644
--- a/handlebars/test/src/com/dmarcotte/handlebars/editor/actions/HbActionHandlerTest.java
+++ b/handlebars/test/src/com/dmarcotte/handlebars/editor/actions/HbActionHandlerTest.java
@@ -97,7 +97,8 @@
     doExecuteActionTest(before, expected, new Runnable() {
       @Override
       public void run() {
-        new CommentByBlockCommentHandler().invoke(myFixture.getProject(), myFixture.getEditor(), myFixture.getFile());
+        new CommentByBlockCommentHandler().invoke(myFixture.getProject(), myFixture.getEditor(),
+                                                  myFixture.getEditor().getCaretModel().getPrimaryCaret(), myFixture.getFile());
       }
     });
   }
