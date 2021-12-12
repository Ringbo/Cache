diff --git a/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/function/ThrowableFunction.java b/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/function/ThrowableFunction.java
index 90c8a9f..4ddce7a 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/function/ThrowableFunction.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/function/ThrowableFunction.java
@@ -20,10 +20,12 @@
  * Defines a {@code java.util.function.Function} that can throw an exception.
  *
  * @author Alejandro Hernández
+ * @param  <A> the type of the argument of the function
+ * @param  <R> the type of the result of the function
  */
 @FunctionalInterface
 @SuppressWarnings("unused")
-public interface ThrowableFunction<T, R> {
+public interface ThrowableFunction<A, R> {
 
 	/**
 	 * Returns a composed function that first applies the current {@code
@@ -35,23 +37,23 @@
 	 * @return the composed function
 	 * @see    #compose(ThrowableFunction)
 	 */
-	public default <V> ThrowableFunction<T, V> andThen(
+	public default <V> ThrowableFunction<A, V> andThen(
 		ThrowableFunction<? super R, ? extends V> throwableFunction) {
 
 		Objects.requireNonNull(throwableFunction);
 
-		return (T t) -> throwableFunction.apply(apply(t));
+		return (A a) -> throwableFunction.apply(apply(a));
 	}
 
 	/**
 	 * Returns the result of applying the current {@code ThrowableFunction}
 	 * instance to the argument.
 	 *
-	 * @param  t the argument
+	 * @param  a the argument
 	 * @return the result of applying the current {@code ThrowableFunction}
 	 *         instance to the argument
 	 */
-	public R apply(T t) throws Exception;
+	public R apply(A a) throws Exception;
 
 	/**
 	 * Returns a composed function that first applies the {@code
@@ -64,7 +66,7 @@
 	 * @see    #andThen(ThrowableFunction)
 	 */
 	public default <V> ThrowableFunction<V, R> compose(
-		ThrowableFunction<? super V, ? extends T> throwableFunction) {
+		ThrowableFunction<? super V, ? extends A> throwableFunction) {
 
 		Objects.requireNonNull(throwableFunction);
 
