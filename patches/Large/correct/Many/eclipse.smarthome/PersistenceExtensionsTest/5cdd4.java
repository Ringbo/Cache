diff --git a/bundles/model/org.eclipse.smarthome.model.persistence.tests/src/test/java/org/eclipse/smarthome/model/persistence/extensions/PersistenceExtensionsTest.java b/bundles/model/org.eclipse.smarthome.model.persistence.tests/src/test/java/org/eclipse/smarthome/model/persistence/extensions/PersistenceExtensionsTest.java
index d9732f4..156b6bd 100644
--- a/bundles/model/org.eclipse.smarthome.model.persistence.tests/src/test/java/org/eclipse/smarthome/model/persistence/extensions/PersistenceExtensionsTest.java
+++ b/bundles/model/org.eclipse.smarthome.model.persistence.tests/src/test/java/org/eclipse/smarthome/model/persistence/extensions/PersistenceExtensionsTest.java
@@ -39,7 +39,7 @@
 	public void setUp() {
 		ext = new PersistenceExtensions();
 		ext.addPersistenceService(testPersistenceService);
-		item = new GenericItem("Test") {
+		item = new GenericItem("Test", "Test") {
 			@Override
 			public List<Class<? extends State>> getAcceptedDataTypes() {
 				return null;
