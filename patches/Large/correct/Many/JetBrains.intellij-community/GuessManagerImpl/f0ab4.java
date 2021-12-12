diff --git a/java/java-analysis-impl/src/com/intellij/codeInsight/guess/impl/GuessManagerImpl.java b/java/java-analysis-impl/src/com/intellij/codeInsight/guess/impl/GuessManagerImpl.java
index c6f7157..6bef8ce 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInsight/guess/impl/GuessManagerImpl.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInsight/guess/impl/GuessManagerImpl.java
@@ -469,7 +469,7 @@
 
     public boolean isDfaNeeded() {
       if (myNeedDfa) return true;
-      if (myDeclared || mySpecificType == null) return true;
+      if (myDeclared || mySpecificType == null) return false;
       PsiType type = myPlace.getType();
       PsiType rawType = type instanceof PsiClassType ? ((PsiClassType)type).rawType() : type;
       return !mySpecificType.equals(rawType);
