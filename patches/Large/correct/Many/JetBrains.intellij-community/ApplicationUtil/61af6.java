diff --git a/platform/core-impl/src/com/intellij/openapi/application/ex/ApplicationUtil.java b/platform/core-impl/src/com/intellij/openapi/application/ex/ApplicationUtil.java
index 787a76f..6ad0abf 100644
--- a/platform/core-impl/src/com/intellij/openapi/application/ex/ApplicationUtil.java
+++ b/platform/core-impl/src/com/intellij/openapi/application/ex/ApplicationUtil.java
@@ -72,7 +72,7 @@
       }
 
       try {
-        future.get(200, TimeUnit.MILLISECONDS);
+        future.get(25, TimeUnit.MILLISECONDS);
         ExceptionUtil.rethrowAll(error.get());
         return result.get();
       }
