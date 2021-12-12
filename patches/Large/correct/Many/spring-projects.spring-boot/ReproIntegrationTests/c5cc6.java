diff --git a/spring-boot-cli/src/test/java/org/springframework/boot/cli/ReproIntegrationTests.java b/spring-boot-cli/src/test/java/org/springframework/boot/cli/ReproIntegrationTests.java
index 0abdb7c..ed9f1af 100644
--- a/spring-boot-cli/src/test/java/org/springframework/boot/cli/ReproIntegrationTests.java
+++ b/spring-boot-cli/src/test/java/org/springframework/boot/cli/ReproIntegrationTests.java
@@ -61,7 +61,7 @@
 	public void jarFileExtensionNeeded() throws Exception {
 		this.thrown.expect(IllegalStateException.class);
 		this.thrown.expectMessage("is not a JAR file");
-		this.cli.jar("secure.groovy");
+		this.cli.jar("secure.groovy", "data-jpa.groovy");
 	}
 
 }
