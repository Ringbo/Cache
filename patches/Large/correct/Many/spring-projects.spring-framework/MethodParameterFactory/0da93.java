diff --git a/spring-test/src/main/java/org/springframework/test/context/junit/jupiter/support/MethodParameterFactory.java b/spring-test/src/main/java/org/springframework/test/context/junit/jupiter/support/MethodParameterFactory.java
index 37779b4..c59dbce 100644
--- a/spring-test/src/main/java/org/springframework/test/context/junit/jupiter/support/MethodParameterFactory.java
+++ b/spring-test/src/main/java/org/springframework/test/context/junit/jupiter/support/MethodParameterFactory.java
@@ -37,7 +37,7 @@
  * @see #createMethodParameter(Parameter)
  * @see #createSynthesizingMethodParameter(Parameter)
  */
-public abstract class MethodParameterFactory {
+abstract class MethodParameterFactory {
 
 	private MethodParameterFactory() {
 		/* no-op */
@@ -51,7 +51,7 @@
 	 * @return a new {@code MethodParameter}
 	 * @see #createSynthesizingMethodParameter(Parameter)
 	 */
-	public static MethodParameter createMethodParameter(Parameter parameter) {
+	static MethodParameter createMethodParameter(Parameter parameter) {
 		Assert.notNull(parameter, "Parameter must not be null");
 		Executable executable = parameter.getDeclaringExecutable();
 		if (executable instanceof Method) {
@@ -71,7 +71,7 @@
 	 * in a constructor
 	 * @see #createMethodParameter(Parameter)
 	 */
-	public static SynthesizingMethodParameter createSynthesizingMethodParameter(Parameter parameter) {
+	static SynthesizingMethodParameter createSynthesizingMethodParameter(Parameter parameter) {
 		Assert.notNull(parameter, "Parameter must not be null");
 		Executable executable = parameter.getDeclaringExecutable();
 		if (executable instanceof Method) {
