diff --git a/spring-boot-cli/src/it/java/org/springframework/boot/cli/CommandLineIT.java b/spring-boot-cli/src/it/java/org/springframework/boot/cli/CommandLineIT.java
index 8f0b4fd..dbf825c 100644
--- a/spring-boot-cli/src/it/java/org/springframework/boot/cli/CommandLineIT.java
+++ b/spring-boot-cli/src/it/java/org/springframework/boot/cli/CommandLineIT.java
@@ -42,7 +42,7 @@
 			InterruptedException {
 		Invocation cli = this.cli.invoke("hint");
 		assertThat(cli.await(), equalTo(0));
-		assertThat(cli.getErrorOutput().length(), equalTo(0));
+		assertThat("Unexpected error: \n" + cli.getErrorOutput(), cli.getErrorOutput().length(), equalTo(0));
 		assertThat(cli.getStandardOutputLines().size(), equalTo(10));
 	}
 
