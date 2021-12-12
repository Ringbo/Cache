diff --git a/spring-boot-tools/spring-boot-loader-tools/src/test/java/org/springframework/boot/loader/tools/LayoutsTests.java b/spring-boot-tools/spring-boot-loader-tools/src/test/java/org/springframework/boot/loader/tools/LayoutsTests.java
index e7a32fe..e3fa328 100644
--- a/spring-boot-tools/spring-boot-loader-tools/src/test/java/org/springframework/boot/loader/tools/LayoutsTests.java
+++ b/spring-boot-tools/spring-boot-loader-tools/src/test/java/org/springframework/boot/loader/tools/LayoutsTests.java
@@ -55,7 +55,7 @@
 
 	@Test
 	public void unknownFile() throws Exception {
-		this.thrown.equals(IllegalStateException.class);
+		this.thrown.expect(IllegalStateException.class);
 		this.thrown.expectMessage("Unable to deduce layout for 'test.txt'");
 		Layouts.forFile(new File("test.txt"));
 	}
