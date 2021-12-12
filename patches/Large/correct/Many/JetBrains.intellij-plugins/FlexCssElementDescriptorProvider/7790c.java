diff --git a/flex/src/com/intellij/javascript/flex/css/FlexCssElementDescriptorProvider.java b/flex/src/com/intellij/javascript/flex/css/FlexCssElementDescriptorProvider.java
index f712047..8838b5a 100644
--- a/flex/src/com/intellij/javascript/flex/css/FlexCssElementDescriptorProvider.java
+++ b/flex/src/com/intellij/javascript/flex/css/FlexCssElementDescriptorProvider.java
@@ -225,7 +225,7 @@
   }
 
   public boolean isPossiblePseudoSelector(@NotNull String selectorName, @Nullable PsiElement context) {
-    return true;
+    return false;
   }
 
   @NotNull
