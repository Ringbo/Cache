diff --git a/spring-boot/src/main/java/org/springframework/boot/context/embedded/tomcat/SkipPatternJarScanner.java b/spring-boot/src/main/java/org/springframework/boot/context/embedded/tomcat/SkipPatternJarScanner.java
index f5665b4..4f4c190 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/embedded/tomcat/SkipPatternJarScanner.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/embedded/tomcat/SkipPatternJarScanner.java
@@ -50,7 +50,7 @@
 
 	SkipPatternJarScanner(JarScanner jarScanner, Set<String> patterns) {
 		Assert.notNull(jarScanner, "JarScanner must not be null");
-		Assert.notNull(jarScanner, "Patterns must not be null");
+		Assert.notNull(patterns, "Patterns must not be null");
 		this.jarScanner = jarScanner;
 		this.patterns = patterns;
 		setPatternToTomcat8SkipFilter();
