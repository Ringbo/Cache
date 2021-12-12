diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/AbstractTask.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/AbstractTask.java
index 31278dd..d6e2c67 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/AbstractTask.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/AbstractTask.java
@@ -233,7 +233,7 @@
         return this;
     }
 
-    public void execute() {
+    public final void execute() {
         executer.execute(this, state);
         state.rethrowFailure();
     }
