diff --git a/idea/src/org/jetbrains/jet/plugin/refactoring/introduceVariable/JetInplaceVariableIntroducer.java b/idea/src/org/jetbrains/jet/plugin/refactoring/introduceVariable/JetInplaceVariableIntroducer.java
index cbdba98..622ec55 100644
--- a/idea/src/org/jetbrains/jet/plugin/refactoring/introduceVariable/JetInplaceVariableIntroducer.java
+++ b/idea/src/org/jetbrains/jet/plugin/refactoring/introduceVariable/JetInplaceVariableIntroducer.java
@@ -46,7 +46,7 @@
     private JetProperty myProperty;
     private boolean isVar;
     private boolean myDoNotChangeVar;
-    private @Nullable JetType myExprType;
+    @Nullable private final JetType myExprType;
     private JCheckBox myVarCheckbox;
     private JCheckBox myExprTypeCheckbox;
 
@@ -84,7 +84,7 @@
             });
         }
 
-        if (myExpr != null) {
+        if (myExprType != null) {
             myExprTypeCheckbox = new NonFocusableCheckBox("Add type annotation");
             myExprTypeCheckbox.setSelected(false);
             myExprTypeCheckbox.setMnemonic('t');
