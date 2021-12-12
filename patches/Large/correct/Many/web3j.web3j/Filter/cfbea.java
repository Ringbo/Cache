diff --git a/core/src/main/java/org/web3j/protocol/core/filters/Filter.java b/core/src/main/java/org/web3j/protocol/core/filters/Filter.java
index 518b239..725caef 100644
--- a/core/src/main/java/org/web3j/protocol/core/filters/Filter.java
+++ b/core/src/main/java/org/web3j/protocol/core/filters/Filter.java
@@ -110,7 +110,7 @@
             throwException(e);
         }
         if (ethLog.hasError()) {
-            throwException(ethFilter.getError());
+            throwException(ethLog.getError());
         } else {
             process(ethLog.getLogs());
         }
