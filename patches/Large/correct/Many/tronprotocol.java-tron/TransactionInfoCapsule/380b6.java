diff --git a/src/main/java/org/tron/core/capsule/TransactionInfoCapsule.java b/src/main/java/org/tron/core/capsule/TransactionInfoCapsule.java
index 4953dcb..911681f 100644
--- a/src/main/java/org/tron/core/capsule/TransactionInfoCapsule.java
+++ b/src/main/java/org/tron/core/capsule/TransactionInfoCapsule.java
@@ -161,7 +161,7 @@
     TransactionInfo.Builder builder = TransactionInfo.newBuilder();
 
     builder.setResult(code.SUCESS);
-    if (StringUtils.isEmpty(runtime.getRuntimeError())) {
+    if (StringUtils.isNoneEmpty(runtime.getRuntimeError())) {
       builder.setResult(code.FAILED);
       builder.setResMessage(ByteString.copyFromUtf8(runtime.getRuntimeError()));
     }
