diff --git a/junit-jupiter-engine/src/test/java/org/junit/jupiter/api/condition/EnabledOnJreIntegrationTests.java b/junit-jupiter-engine/src/test/java/org/junit/jupiter/api/condition/EnabledOnJreIntegrationTests.java
index 85805fc..2bd955d 100644
--- a/junit-jupiter-engine/src/test/java/org/junit/jupiter/api/condition/EnabledOnJreIntegrationTests.java
+++ b/junit-jupiter-engine/src/test/java/org/junit/jupiter/api/condition/EnabledOnJreIntegrationTests.java
@@ -67,7 +67,7 @@
 	@Test
 	@EnabledOnJre(JAVA_11)
 	void java11() {
-		assertTrue(onJava10());
+		assertTrue(onJava11());
 	}
 
 	@Test
