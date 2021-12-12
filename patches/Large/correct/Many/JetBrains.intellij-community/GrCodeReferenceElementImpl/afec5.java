diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/types/GrCodeReferenceElementImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/types/GrCodeReferenceElementImpl.java
index 73bc756..06e540a 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/types/GrCodeReferenceElementImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/types/GrCodeReferenceElementImpl.java
@@ -415,12 +415,12 @@
   private static final OurResolver RESOLVER = new OurResolver();
 
   public GroovyResolveResult advancedResolve() {
-    ResolveResult[] results = getManager().getResolveCache().resolveWithCaching(this, RESOLVER, false, false);
+    ResolveResult[] results = getManager().getResolveCache().resolveWithCaching(this, RESOLVER, true, false);
     return results.length == 1 ? (GroovyResolveResult) results[0] : GroovyResolveResult.EMPTY_RESULT;
   }
 
   @NotNull
   public GroovyResolveResult[] multiResolve(boolean incompleteCode) {
-    return (GroovyResolveResult[]) getManager().getResolveCache().resolveWithCaching(this, RESOLVER, false, incompleteCode);
+    return (GroovyResolveResult[]) getManager().getResolveCache().resolveWithCaching(this, RESOLVER, true, incompleteCode);
   }
 }
