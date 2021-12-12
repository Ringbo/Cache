diff --git a/src/com/goide/psi/impl/GoPsiImplUtil.java b/src/com/goide/psi/impl/GoPsiImplUtil.java
index 4974a4c..ff412c5 100644
--- a/src/com/goide/psi/impl/GoPsiImplUtil.java
+++ b/src/com/goide/psi/impl/GoPsiImplUtil.java
@@ -148,7 +148,7 @@
   @Nullable
   public static PsiReference getReference(@NotNull GoVarDefinition o) {
     GoShortVarDeclaration shortDeclaration = PsiTreeUtil.getParentOfType(o, GoShortVarDeclaration.class);
-    boolean createRef = PsiTreeUtil.getParentOfType(shortDeclaration, GoBlock.class, GoIfStatement.class, GoSwitchStatement.class, GoSelectStatement.class) instanceof GoBlock;
+    boolean createRef = PsiTreeUtil.getParentOfType(shortDeclaration, GoBlock.class, GoForStatement.class, GoIfStatement.class, GoSwitchStatement.class, GoSelectStatement.class) instanceof GoBlock;
     return createRef ? new GoVarReference(o) : null;
   }
 
