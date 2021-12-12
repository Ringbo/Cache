diff --git a/core/src/main/java/com/google/bitcoin/params/RegTestParams.java b/core/src/main/java/com/google/bitcoin/params/RegTestParams.java
index 8ccb422..b42f715 100644
--- a/core/src/main/java/com/google/bitcoin/params/RegTestParams.java
+++ b/core/src/main/java/com/google/bitcoin/params/RegTestParams.java
@@ -32,7 +32,7 @@
         super();
         interval = 10000;
         proofOfWorkLimit = PROOF_OF_WORK_LIMIT;
-        subsidyDecreaseBlockCount = 10000;
+        subsidyDecreaseBlockCount = 150;
         port = 18444;
     }
 
