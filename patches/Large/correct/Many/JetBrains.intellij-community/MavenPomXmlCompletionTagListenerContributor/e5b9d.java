diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/model/completion/MavenPomXmlCompletionTagListenerContributor.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/model/completion/MavenPomXmlCompletionTagListenerContributor.java
index 1ddef0a..8fde37f 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/model/completion/MavenPomXmlCompletionTagListenerContributor.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/model/completion/MavenPomXmlCompletionTagListenerContributor.java
@@ -75,7 +75,7 @@
 
                       context.commitDocument();
 
-                      new ReformatCodeProcessor(context.getProject(), context.getFile(), xmlTag.getTextRange(), true).run();
+                      new ReformatCodeProcessor(context.getProject(), context.getFile(), xmlTag.getTextRange(), false).run();
 
                       MavenDependencyCompletionUtil.invokeCompletion(context, CompletionType.BASIC);
                     }
