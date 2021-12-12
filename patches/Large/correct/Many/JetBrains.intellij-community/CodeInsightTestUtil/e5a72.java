diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/CodeInsightTestUtil.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/CodeInsightTestUtil.java
index f8c5844..633aec0 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/CodeInsightTestUtil.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/CodeInsightTestUtil.java
@@ -79,7 +79,7 @@
         SurroundWithHandler.invoke(fixture.getProject(), fixture.getEditor(), fixture.getFile(), surrounder);
       }
     }.execute();
-    fixture.checkResultByFile(after, true);
+    fixture.checkResultByFile(after, false);
   }
 
 }
