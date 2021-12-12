diff --git a/src/main/java/org/tron/core/db/Manager.java b/src/main/java/org/tron/core/db/Manager.java
index 608522a..11d656a 100644
--- a/src/main/java/org/tron/core/db/Manager.java
+++ b/src/main/java/org/tron/core/db/Manager.java
@@ -1351,7 +1351,7 @@
         preValidateTransactionSign(block);
       } catch (InterruptedException e) {
         logger.error("parallel check sign interrupted exception! block info: {}", block, e);
-        Thread.currentThread().interrupted();
+        Thread.currentThread().interrupt();
       }
     }
 
