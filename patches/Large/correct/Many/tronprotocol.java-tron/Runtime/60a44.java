diff --git a/src/main/java/org/tron/common/runtime/Runtime.java b/src/main/java/org/tron/common/runtime/Runtime.java
index d3b4325..e94b818 100644
--- a/src/main/java/org/tron/common/runtime/Runtime.java
+++ b/src/main/java/org/tron/common/runtime/Runtime.java
@@ -543,13 +543,13 @@
       program.spendAllEnergy();
       result = program.getResult();
       if (Objects.isNull(result.getException())) {
-        logger.info(e.getMessage(), e);
+        logger.error(e.getMessage(), e);
         result.setException(new RuntimeException("Unknown Throwable"));
       }
       if (StringUtils.isEmpty(runtimeError)) {
         runtimeError = result.getException().getMessage();
       }
-      logger.info("runtime error is :{}", result.getException().getMessage());
+      logger.info("runtime exception is :{}", result.getException().getMessage());
     }
     trace.setBill(result.getEnergyUsed());
   }
