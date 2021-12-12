diff --git a/java/java-impl/src/com/intellij/codeInsight/completion/JavaConstructorCallElement.java b/java/java-impl/src/com/intellij/codeInsight/completion/JavaConstructorCallElement.java
index b5a2b85..f107700 100644
--- a/java/java-impl/src/com/intellij/codeInsight/completion/JavaConstructorCallElement.java
+++ b/java/java-impl/src/com/intellij/codeInsight/completion/JavaConstructorCallElement.java
@@ -94,7 +94,7 @@
 
   @Override
   public boolean isValid() {
-    return myConstructor.isValid() && mySubstitutor.isValid();
+    return myConstructor.isValid() && myType.isValid();
   }
 
   @Override
