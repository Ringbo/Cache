diff --git a/spring-boot/src/main/java/org/springframework/boot/DefaultApplicationArguments.java b/spring-boot/src/main/java/org/springframework/boot/DefaultApplicationArguments.java
index b5d117c..6def5d1 100644
--- a/spring-boot/src/main/java/org/springframework/boot/DefaultApplicationArguments.java
+++ b/spring-boot/src/main/java/org/springframework/boot/DefaultApplicationArguments.java
@@ -26,17 +26,18 @@
 import org.springframework.util.Assert;
 
 /**
- * Default internal implementation of {@link ApplicationArguments}.
+ * Default implementation of {@link ApplicationArguments}.
  *
  * @author Phillip Webb
+ * @since 1.4.1
  */
-class DefaultApplicationArguments implements ApplicationArguments {
+public class DefaultApplicationArguments implements ApplicationArguments {
 
 	private final Source source;
 
 	private final String[] args;
 
-	DefaultApplicationArguments(String[] args) {
+	public DefaultApplicationArguments(String[] args) {
 		Assert.notNull(args, "Args must not be null");
 		this.source = new Source(args);
 		this.args = args;
