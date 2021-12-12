diff --git a/jodd-petite/src/main/java/jodd/petite/PetiteConfig.java b/jodd-petite/src/main/java/jodd/petite/PetiteConfig.java
index f84f5fa..e224845 100644
--- a/jodd-petite/src/main/java/jodd/petite/PetiteConfig.java
+++ b/jodd-petite/src/main/java/jodd/petite/PetiteConfig.java
@@ -35,7 +35,7 @@
 		detectDuplicatedBeanNames = false;
 		resolveReferenceParameters = true;
 		useFullTypeNames = false;
-		lookupReferences = PetiteReference.DEFAULT;
+		lookupReferences = PetiteReferenceType.DEFAULT;
 		useParamo = true;
 		wireScopedProxy = false;
 		detectMixedScopes = false;
@@ -143,9 +143,9 @@
 
 	// ---------------------------------------------------------------- references
 
-	protected PetiteReference[] lookupReferences;
+	protected PetiteReferenceType[] lookupReferences;
 
-	public PetiteReference[] getLookupReferences() {
+	public PetiteReferenceType[] getLookupReferences() {
 		return lookupReferences;
 	}
 
@@ -153,7 +153,7 @@
 	 * Specifies references for bean name lookup, when name
 	 * is not specified, in given order.
 	 */
-	public PetiteConfig setLookupReferences(PetiteReference... lookupReferences) {
+	public PetiteConfig setLookupReferences(PetiteReferenceType... lookupReferences) {
 		this.lookupReferences = lookupReferences;
 		return this;
 	}
