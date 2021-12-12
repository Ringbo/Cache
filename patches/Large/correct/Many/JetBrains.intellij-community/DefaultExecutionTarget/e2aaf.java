diff --git a/platform/lang-api/src/com/intellij/execution/DefaultExecutionTarget.java b/platform/lang-api/src/com/intellij/execution/DefaultExecutionTarget.java
index bc33003..fb73c9f 100644
--- a/platform/lang-api/src/com/intellij/execution/DefaultExecutionTarget.java
+++ b/platform/lang-api/src/com/intellij/execution/DefaultExecutionTarget.java
@@ -21,7 +21,10 @@
 public class DefaultExecutionTarget extends ExecutionTarget {
   public static final ExecutionTarget INSTANCE = new DefaultExecutionTarget();
 
-  private DefaultExecutionTarget() {
+  /** 
+   * @deprecated for removal, please use {@link DefaultExecutionTarget#INSTANCE} 
+   * */
+  public DefaultExecutionTarget() {
   }
 
   @NotNull
