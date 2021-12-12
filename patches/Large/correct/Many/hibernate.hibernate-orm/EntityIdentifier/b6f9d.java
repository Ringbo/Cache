diff --git a/hibernate-core/src/main/java/org/hibernate/metamodel/binding/EntityIdentifier.java b/hibernate-core/src/main/java/org/hibernate/metamodel/binding/EntityIdentifier.java
index 2ff1c33..92494af 100644
--- a/hibernate-core/src/main/java/org/hibernate/metamodel/binding/EntityIdentifier.java
+++ b/hibernate-core/src/main/java/org/hibernate/metamodel/binding/EntityIdentifier.java
@@ -45,7 +45,7 @@
 	);
 
 	private final EntityBinding entityBinding;
-	private AttributeBinding attributeBinding;
+	private KeyValueBinding attributeBinding;
 	private IdentifierGenerator identifierGenerator;
 	private IdGenerator idGenerator;
 	// todo : mappers, etc
@@ -59,11 +59,11 @@
 		this.entityBinding = entityBinding;
 	}
 
-	public AttributeBinding getValueBinding() {
+	public KeyValueBinding getValueBinding() {
 		return attributeBinding;
 	}
 
-	public void setValueBinding(AttributeBinding attributeBinding) {
+	public void setValueBinding(KeyValueBinding attributeBinding) {
 		if ( this.attributeBinding != null ) {
 			// todo : error?  or just log?  For now throw exception and see what happens. Easier to see whether this
 			// method gets called multiple times
