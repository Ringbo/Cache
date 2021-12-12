diff --git a/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/AbstractLongRunningOperation.java b/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/AbstractLongRunningOperation.java
index f3161b8..c6da869 100644
--- a/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/AbstractLongRunningOperation.java
+++ b/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/AbstractLongRunningOperation.java
@@ -26,7 +26,7 @@
 import java.io.InputStream;
 import java.io.OutputStream;
 
-public abstract class AbstractLongRunningOperation<SELF extends AbstractLongRunningOperation<SELF>> implements LongRunningOperation {
+public abstract class AbstractLongRunningOperation<T extends AbstractLongRunningOperation<T>> implements LongRunningOperation {
     protected final ConnectionParameters connectionParameters;
     protected final ConsumerOperationParameters.Builder operationParamsBuilder;
 
@@ -36,54 +36,54 @@
         operationParamsBuilder.setCancellationToken(new DefaultCancellationTokenSource().token());
     }
 
-    protected abstract SELF getThis();
+    protected abstract T getThis();
 
     protected final ConsumerOperationParameters getConsumerOperationParameters() {
         ConnectionParameters connectionParameters = this.connectionParameters;
         return operationParamsBuilder.setParameters(connectionParameters).build();
     }
 
-    public SELF withArguments(String... arguments) {
+    public T withArguments(String... arguments) {
         operationParamsBuilder.setArguments(arguments);
         return getThis();
     }
 
-    public SELF setStandardOutput(OutputStream outputStream) {
+    public T setStandardOutput(OutputStream outputStream) {
         operationParamsBuilder.setStdout(outputStream);
         return getThis();
     }
 
-    public SELF setStandardError(OutputStream outputStream) {
+    public T setStandardError(OutputStream outputStream) {
         operationParamsBuilder.setStderr(outputStream);
         return getThis();
     }
 
-    public SELF setStandardInput(InputStream inputStream) {
+    public T setStandardInput(InputStream inputStream) {
         operationParamsBuilder.setStdin(inputStream);
         return getThis();
     }
 
-    public SELF setColorOutput(boolean colorOutput) {
+    public T setColorOutput(boolean colorOutput) {
         operationParamsBuilder.setColorOutput(colorOutput);
         return getThis();
     }
 
-    public SELF setJavaHome(File javaHome) {
+    public T setJavaHome(File javaHome) {
         operationParamsBuilder.setJavaHome(javaHome);
         return getThis();
     }
 
-    public SELF setJvmArguments(String... jvmArguments) {
+    public T setJvmArguments(String... jvmArguments) {
         operationParamsBuilder.setJvmArguments(jvmArguments);
         return getThis();
     }
 
-    public SELF addProgressListener(ProgressListener listener) {
+    public T addProgressListener(ProgressListener listener) {
         operationParamsBuilder.addProgressListener(listener);
         return getThis();
     }
 
-    public SELF withCancellationToken(CancellationToken cancellationToken) {
+    public T withCancellationToken(CancellationToken cancellationToken) {
         operationParamsBuilder.setCancellationToken(Preconditions.checkNotNull(cancellationToken));
         return getThis();
     }
