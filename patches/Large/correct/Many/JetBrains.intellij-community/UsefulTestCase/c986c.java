diff --git a/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java b/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
index f3e308a..9c73ba3 100644
--- a/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
+++ b/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
@@ -877,7 +877,7 @@
    * @param exceptionClass   Expected exception type
    * @param runnable         Block annotated with some exception type
    */
-  protected <T extends Throwable> void assertThrows(@NotNull Class<? extends T> exceptionClass,
+  protected <T extends Throwable> void assertThrows(@NotNull Class<? extends Throwable> exceptionClass,
                                                     @NotNull ThrowableRunnable<T> runnable) throws T {
     assertThrows(exceptionClass, null, runnable);
   }
@@ -891,7 +891,7 @@
    * @param runnable         Block annotated with some exception type
    */
   @SuppressWarnings({"unchecked", "SameParameterValue"})
-  protected <T extends Throwable> void assertThrows(@NotNull Class<?> exceptionClass, @Nullable String expectedErrorMsg,
+  protected <T extends Throwable> void assertThrows(@NotNull Class<? extends Throwable> exceptionClass, @Nullable String expectedErrorMsg,
                                                     @NotNull ThrowableRunnable<T> runnable) throws T {
     assertExceptionOccurred(true, new AbstractExceptionCase() {
       @Override
