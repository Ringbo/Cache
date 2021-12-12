diff --git a/subprojects/core/src/main/groovy/org/gradle/initialization/BuildAction.java b/subprojects/core/src/main/groovy/org/gradle/initialization/BuildAction.java
index 258e0ee..e3e995e 100644
--- a/subprojects/core/src/main/groovy/org/gradle/initialization/BuildAction.java
+++ b/subprojects/core/src/main/groovy/org/gradle/initialization/BuildAction.java
@@ -21,11 +21,11 @@
  * Implementations of this are typically composed to bootstrap a build in a certain environment.
  * <p>
  */
-public interface BuildAction<T> {
+public interface BuildAction {
     /**
      * Executes the action with the given controller.
      * <p>
      * The state of the build is not defined as part of this contract, it is highly context specific.
      */
-    T run(BuildController buildController);
+    Object run(BuildController buildController);
 }
