diff --git a/subprojects/core/src/main/groovy/org/gradle/process/internal/AbstractExecHandleBuilder.java b/subprojects/core/src/main/groovy/org/gradle/process/internal/AbstractExecHandleBuilder.java
index a91bc13..d5ba211 100644
--- a/subprojects/core/src/main/groovy/org/gradle/process/internal/AbstractExecHandleBuilder.java
+++ b/subprojects/core/src/main/groovy/org/gradle/process/internal/AbstractExecHandleBuilder.java
@@ -92,7 +92,7 @@
         return ignoreExitValue;
     }
 
-    public BaseExecSpec setIgnoreExitValue(boolean ignoreExitValue) {
+    public AbstractExecHandleBuilder setIgnoreExitValue(boolean ignoreExitValue) {
         this.ignoreExitValue = ignoreExitValue;
         return this;
     }
