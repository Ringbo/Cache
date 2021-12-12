diff --git a/junit5-api/src/main/java/org/junit/gen5/api/Executable.java b/junit5-api/src/main/java/org/junit/gen5/api/Executable.java
index fbf4ca0..442e7e1 100644
--- a/junit5-api/src/main/java/org/junit/gen5/api/Executable.java
+++ b/junit5-api/src/main/java/org/junit/gen5/api/Executable.java
@@ -12,11 +12,20 @@
 
 /**
  * {@code Executable} is a functional interface that can be used to
- * implement any generic block of code that potentially throws an
- * {@link Exception}.
+ * implement any generic block of code that potentially throws a
+ * {@link Throwable}.
  *
  * <p>The {@code Executable} interface is similar to {@link java.lang.Runnable},
- * except that an {@code Executable} can throw an {@link Exception}.
+ * except that an {@code Executable} can throw any kind of exception.
+ *
+ * <h4>Rationale for throwing {@code Throwable} instead of {@code Exception}</h4>
+ *
+ * <p>Although Java applications typically throw exceptions that are instances
+ * of {@link java.lang.Exception}, {@link java.lang.RuntimeException},
+ * {@link java.lang.Error}, or {@link java.lang.AssertionError} (in testing
+ * scenarios), there may be use cases where an {@code Executable} needs to
+ * explicitly throw a {@code Throwable}. In order to support such specialized
+ * use cases, {@link #execute()} is declared to throw {@code Throwable}.
  *
  * @since 5.0
  * @see Assertions#assertAll(Executable...)
@@ -27,6 +36,6 @@
 @FunctionalInterface
 public interface Executable {
 
-	void execute() throws Exception;
+	void execute() throws Throwable;
 
 }
