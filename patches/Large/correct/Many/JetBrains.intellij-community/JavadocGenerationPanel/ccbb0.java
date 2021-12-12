diff --git a/source/com/intellij/javadoc/JavadocGenerationPanel.java b/source/com/intellij/javadoc/JavadocGenerationPanel.java
index ed2dfeb..f129bd5 100644
--- a/source/com/intellij/javadoc/JavadocGenerationPanel.java
+++ b/source/com/intellij/javadoc/JavadocGenerationPanel.java
@@ -89,13 +89,13 @@
       myScopeSlider.setValue(1);
     }
     else if (PsiKeyword.PROTECTED.equals(scope)) {
-      myScopeSlider.setValue(3);
+      myScopeSlider.setValue(2);
     }
     else if (PsiKeyword.PRIVATE.equals(scope)) {
       myScopeSlider.setValue(4);
     }
     else {
-      myScopeSlider.setValue(2);
+      myScopeSlider.setValue(3);
     }
     handleSlider();
   }
