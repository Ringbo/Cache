diff --git a/bundles/binding/org.openhab.binding.maxcube.test/src/test/java/org/openhab/binding/maxcube/internal/message/S_CommandTest.java b/bundles/binding/org.openhab.binding.maxcube.test/src/test/java/org/openhab/binding/maxcube/internal/message/S_CommandTest.java
index f3efd85..8b82e28 100644
--- a/bundles/binding/org.openhab.binding.maxcube.test/src/test/java/org/openhab/binding/maxcube/internal/message/S_CommandTest.java
+++ b/bundles/binding/org.openhab.binding.maxcube.test/src/test/java/org/openhab/binding/maxcube/internal/message/S_CommandTest.java
@@ -29,7 +29,7 @@
 	
 	@Test
 	public void PrefixTest() {
-		S_Command scmd = new S_Command("00FE30", 20.0);
+		S_Command scmd = new S_Command("00FE30", 1, 20.0);
 		
 		String commandStr = scmd.getCommandString();
 		
@@ -41,7 +41,7 @@
 	
 	@Test
 	public void BaseCommandTest() {
-		S_Command scmd = new S_Command("00FE30", 20.0);
+		S_Command scmd = new S_Command("00FE30", 1, 20.0);
 		
 		String commandStr = scmd.getCommandString();
 		
