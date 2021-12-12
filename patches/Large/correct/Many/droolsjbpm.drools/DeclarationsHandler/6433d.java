diff --git a/drools-core/src/main/java/org/drools/reteoo/compiled/DeclarationsHandler.java b/drools-core/src/main/java/org/drools/reteoo/compiled/DeclarationsHandler.java
index 9692c9a..eb5ad5f 100644
--- a/drools-core/src/main/java/org/drools/reteoo/compiled/DeclarationsHandler.java
+++ b/drools-core/src/main/java/org/drools/reteoo/compiled/DeclarationsHandler.java
@@ -35,7 +35,7 @@
  * <li>A {@link Map} for each set of hashed {@link AlphaNode}s. The keys are the hashed values, and the values are
  * the IDs of the alphas</li>
  */
-class DeclarationsHandler extends AbstractCompilerHandler {
+public class DeclarationsHandler extends AbstractCompilerHandler {
     private static final String PRIVATE_MODIFIER = "private";
 
     /**
@@ -54,7 +54,7 @@
      */
     private final Collection<HashedAlphasDeclaration> hashedAlphaDeclarations;
 
-    DeclarationsHandler(StringBuilder builder) {
+    public DeclarationsHandler(StringBuilder builder) {
         this.builder = builder;
         this.hashedAlphaDeclarations = new LinkedList<HashedAlphasDeclaration>();
     }
@@ -95,7 +95,7 @@
                 + " = new " + createType.getName() + "();";
     }
 
-    Collection<HashedAlphasDeclaration> getHashedAlphaDeclarations() {
+    public Collection<HashedAlphasDeclaration> getHashedAlphaDeclarations() {
         return Collections.unmodifiableCollection(hashedAlphaDeclarations);
     }
 
