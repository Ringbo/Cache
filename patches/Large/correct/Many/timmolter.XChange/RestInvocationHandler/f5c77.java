diff --git a/xchange-core/src/main/java/com/xeiam/xchange/rest/RestInvocationHandler.java b/xchange-core/src/main/java/com/xeiam/xchange/rest/RestInvocationHandler.java
index 51c824a..636ee21 100644
--- a/xchange-core/src/main/java/com/xeiam/xchange/rest/RestInvocationHandler.java
+++ b/xchange-core/src/main/java/com/xeiam/xchange/rest/RestInvocationHandler.java
@@ -61,7 +61,7 @@
     return httpTemplate.executeRequest(
         restRequestData.url,
         restRequestData.returnType,
-        restRequestData.params.getPostBodyOrNull(),
+        restRequestData.params.getPostBody(),
         restRequestData.params.getHttpHeaders(),
         restRequestData.httpMethod);
   }
