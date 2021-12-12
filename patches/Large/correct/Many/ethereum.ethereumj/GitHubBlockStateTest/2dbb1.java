diff --git a/ethereumj-core/src/test/java/org/ethereum/jsontestsuite/GitHubBlockStateTest.java b/ethereumj-core/src/test/java/org/ethereum/jsontestsuite/GitHubBlockStateTest.java
index 70993fa..a31822d 100644
--- a/ethereumj-core/src/test/java/org/ethereum/jsontestsuite/GitHubBlockStateTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/jsontestsuite/GitHubBlockStateTest.java
@@ -52,8 +52,8 @@
         SystemProperties.getDefault().setRecordInternalTransactionsData(false);
     }
 
-    @After
-    public void clean() {
+    @AfterClass
+    public static void clean() {
         SystemProperties.getDefault().setBlockchainConfig(MainNetConfig.INSTANCE);
         SystemProperties.getDefault().setRecordInternalTransactionsData(true);
     }
