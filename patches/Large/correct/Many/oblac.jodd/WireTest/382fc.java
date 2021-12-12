diff --git a/jodd-petite/src/test/java/jodd/petite/WireTest.java b/jodd-petite/src/test/java/jodd/petite/WireTest.java
index 3bccd5f..0fc4765 100644
--- a/jodd-petite/src/test/java/jodd/petite/WireTest.java
+++ b/jodd-petite/src/test/java/jodd/petite/WireTest.java
@@ -24,9 +24,9 @@
 	public void testContainer() {
 		PetiteContainer pc = new PetiteContainer();
 		AutomagicPetiteConfigurator configurator = new AutomagicPetiteConfigurator();
-		configurator.setExcludedEntries("*");
+		configurator.setExcludeAllEntriesMode();
 		configurator.setIncludedEntries("jodd.petite.*");
-		configurator.setExcludedImportantEntries("jodd.petite.data.*", "jodd.petite.tst3.*", "jodd.petite.tst.Ses");
+		configurator.setExcludedEntries("jodd.petite.data.*", "jodd.petite.tst3.*", "jodd.petite.tst.Ses");
 		configurator.configure(pc);
 
 		assertEquals(1, pc.getTotalBeans());
