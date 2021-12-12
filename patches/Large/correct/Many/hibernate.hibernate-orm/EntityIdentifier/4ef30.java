diff --git a/hibernate-core/src/main/java/org/hibernate/metamodel/binding/EntityIdentifier.java b/hibernate-core/src/main/java/org/hibernate/metamodel/binding/EntityIdentifier.java
index 92494af..f51f578 100644
--- a/hibernate-core/src/main/java/org/hibernate/metamodel/binding/EntityIdentifier.java
+++ b/hibernate-core/src/main/java/org/hibernate/metamodel/binding/EntityIdentifier.java
@@ -45,7 +45,7 @@
 	);
 
 	private final EntityBinding entityBinding;
-	private KeyValueBinding attributeBinding;
+	private SimpleAttributeBinding attributeBinding;
 	private IdentifierGenerator identifierGenerator;
 	private IdGenerator idGenerator;
 	// todo : mappers, etc
@@ -59,11 +59,11 @@
 		this.entityBinding = entityBinding;
 	}
 
-	public KeyValueBinding getValueBinding() {
+	public SimpleAttributeBinding getValueBinding() {
 		return attributeBinding;
 	}
 
-	public void setValueBinding(KeyValueBinding attributeBinding) {
+	public void setValueBinding(SimpleAttributeBinding attributeBinding) {
 		if ( this.attributeBinding != null ) {
 			// todo : error?  or just log?  For now throw exception and see what happens. Easier to see whether this
 			// method gets called multiple times
