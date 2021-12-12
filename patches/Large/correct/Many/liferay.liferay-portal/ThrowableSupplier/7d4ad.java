diff --git a/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/supplier/ThrowableSupplier.java b/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/supplier/ThrowableSupplier.java
index 43aa458..ad1b032 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/supplier/ThrowableSupplier.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/supplier/ThrowableSupplier.java
@@ -18,17 +18,18 @@
  * Defines a {@code java.util.function.Supplier} that can throw an exception.
  *
  * @author Alejandro Hernández
+ * @param  <R> the type of the result of the supplier
  */
 @FunctionalInterface
-public interface ThrowableSupplier<T> {
+public interface ThrowableSupplier<R> {
 
 	/**
-	 * Returns a result of type {@code T} if the operation succeeds; otherwise
+	 * Returns a result of type {@code R} if the operation succeeds; otherwise
 	 * throws an exception.
 	 *
-	 * @return a result of type {@code T} if the operation succeeds; an
+	 * @return a result of type {@code R} if the operation succeeds; an
 	 *         exception otherwise
 	 */
-	public T get() throws Exception;
+	public R get() throws Exception;
 
 }
\ No newline at end of file
