diff --git a/ethereumj-core/src/main/java/org/ethereum/validator/AbstractValidationRule.java b/ethereumj-core/src/main/java/org/ethereum/validator/AbstractValidationRule.java
index f86c3ca..b065faf 100644
--- a/ethereumj-core/src/main/java/org/ethereum/validator/AbstractValidationRule.java
+++ b/ethereumj-core/src/main/java/org/ethereum/validator/AbstractValidationRule.java
@@ -23,7 +23,7 @@
     public void logErrors(Logger logger) {
         if (logger.isErrorEnabled())
             for (String msg : errors) {
-                logger.error("{} invalid: {}", getEntityClass().getSimpleName(), msg);
+                logger.warn("{} invalid: {}", getEntityClass().getSimpleName(), msg);
             }
     }
 
