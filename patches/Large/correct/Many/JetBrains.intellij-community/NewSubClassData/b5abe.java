diff --git a/platform/lang-impl/src/com/intellij/refactoring/memberPushDown/NewSubClassData.java b/platform/lang-impl/src/com/intellij/refactoring/memberPushDown/NewSubClassData.java
index 2d6958c..65db8b5 100644
--- a/platform/lang-impl/src/com/intellij/refactoring/memberPushDown/NewSubClassData.java
+++ b/platform/lang-impl/src/com/intellij/refactoring/memberPushDown/NewSubClassData.java
@@ -26,7 +26,7 @@
   private final Object myContext;
   private final String myNewClassName;
 
-  public NewSubClassData(PsiElement context, String newClassName) {
+  public NewSubClassData(Object context, String newClassName) {
     myContext = context;
     myNewClassName = newClassName;
   }
