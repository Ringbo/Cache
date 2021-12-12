diff --git a/src/main/java/reactor/core/publisher/Hooks.java b/src/main/java/reactor/core/publisher/Hooks.java
index 1f3157f..699ae7f 100644
--- a/src/main/java/reactor/core/publisher/Hooks.java
+++ b/src/main/java/reactor/core/publisher/Hooks.java
@@ -43,7 +43,7 @@
 	 * @param c the dropped error {@link Consumer} hook
 	 */
 	public static void onErrorDropped(Consumer<? super Throwable> c) {
-		log.warn("Hooking new default : onErrorDropped");
+		log.info("Hooking new default : onErrorDropped");
 		onErrorDroppedHook = Objects.requireNonNull(c, "onErrorDroppedHook");
 	}
 
@@ -54,7 +54,7 @@
 	 * @param c the dropped next {@link Consumer} hook
 	 */
 	public static void onNextDropped(Consumer<Object> c) {
-		log.warn("Hooking new default : onNextDropped");
+		log.info("Hooking new default : onNextDropped");
 		onNextDroppedHook = Objects.requireNonNull(c, "onNextDroppedHook");
 	}
 
@@ -71,7 +71,7 @@
 	 */
 	public static <T> void onOperator(Function<? super OperatorHook<T>, ? extends OperatorHook<T>>
 			newHook) {
-		log.warn("Hooking new default : onOperator");
+		log.info("Hooking new default : onOperator");
 		onOperatorCreate = new OnOperatorCreate<>(newHook);
 	}
 
@@ -84,7 +84,7 @@
 	 */
 	public static void onOperatorError(BiFunction<? super Throwable, Object, ?
 			extends Throwable> f) {
-		log.warn("Hooking new default : onOperatorError");
+		log.info("Hooking new default : onOperatorError");
 		onOperatorErrorHook = Objects.requireNonNull(f, "onOperatorErrorHook");
 	}
 
@@ -92,7 +92,7 @@
 	 * Reset global error dropped strategy to bubbling back the error.
 	 */
 	public static void resetOnErrorDropped() {
-		log.warn("Reset to factory defaults : onErrorDropped");
+		log.info("Reset to factory defaults : onErrorDropped");
 		onErrorDroppedHook = null;
 	}
 
@@ -101,7 +101,7 @@
 	 * reactor.core.Exceptions#failWithCancel()}
 	 */
 	public static void resetOnNextDropped() {
-		log.warn("Reset to factory defaults : onNextDropped");
+		log.info("Reset to factory defaults : onNextDropped");
 		onNextDroppedHook = null;
 	}
 
@@ -109,7 +109,7 @@
 	 * Reset global "assembly" hook tracking
 	 */
 	public static void resetOnOperator() {
-		log.warn("Reset to factory defaults : onOperator");
+		log.info("Reset to factory defaults : onOperator");
 		onOperatorCreate = null;
 	}
 
@@ -118,7 +118,7 @@
 	 * driven exception or error driven exception.
 	 */
 	public static void resetOnOperatorError() {
-		log.warn("Reset to factory defaults : onOperatorError");
+		log.info("Reset to factory defaults : onOperatorError");
 		onOperatorErrorHook = null;
 	}
 
