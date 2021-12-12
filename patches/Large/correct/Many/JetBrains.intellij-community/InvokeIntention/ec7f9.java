diff --git a/platform/testFramework/testSrc/com/intellij/testFramework/propertyBased/InvokeIntention.java b/platform/testFramework/testSrc/com/intellij/testFramework/propertyBased/InvokeIntention.java
index f7dde2a..edae460 100644
--- a/platform/testFramework/testSrc/com/intellij/testFramework/propertyBased/InvokeIntention.java
+++ b/platform/testFramework/testSrc/com/intellij/testFramework/propertyBased/InvokeIntention.java
@@ -90,7 +90,7 @@
     myInvocationLog += ", invoked '" + intention.getText() + "'";
     String intentionString = intention.toString();
 
-    boolean checkComments = myPolicy.checkComments(intention) && PsiTreeUtil.getParentOfType(file.findElementAt(offset), PsiComment.class) == null;
+    boolean checkComments = myPolicy.checkComments(intention) && PsiTreeUtil.getParentOfType(file.findElementAt(offset), PsiComment.class, false) == null;
     Collection<String> comments = checkComments
                                   ? extractCommentsReformattedToSingleWhitespace(file)
                                   : Collections.emptyList();
