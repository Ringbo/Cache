diff --git a/subprojects/core/src/main/groovy/org/gradle/process/internal/JavaExecHandleBuilder.java b/subprojects/core/src/main/groovy/org/gradle/process/internal/JavaExecHandleBuilder.java
index 69c0946..9b381a3 100644
--- a/subprojects/core/src/main/groovy/org/gradle/process/internal/JavaExecHandleBuilder.java
+++ b/subprojects/core/src/main/groovy/org/gradle/process/internal/JavaExecHandleBuilder.java
@@ -215,7 +215,7 @@
     }
 
     @Override
-    public JavaExecSpec setIgnoreExitValue(boolean ignoreExitValue) {
+    public JavaExecHandleBuilder setIgnoreExitValue(boolean ignoreExitValue) {
         super.setIgnoreExitValue(ignoreExitValue);
         return this;
     }
