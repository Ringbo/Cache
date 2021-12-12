diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/resources/ChannelResourceInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/resources/ChannelResourceInspection.java
index de17db7..576f245 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/resources/ChannelResourceInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/resources/ChannelResourceInspection.java
@@ -77,7 +77,8 @@
                 return;
             }
             final PsiElement parent = getExpressionParent(expression);
-            if (parent instanceof PsiReturnStatement) {
+            if (parent instanceof PsiReturnStatement ||
+                    parent instanceof PsiResourceVariable) {
                 return;
             }
             final PsiVariable boundVariable = getVariable(parent);
