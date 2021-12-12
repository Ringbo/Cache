diff --git a/ethereumj-core/src/test/java/org/ethereum/jsontestsuite/GitHubStateTest.java b/ethereumj-core/src/test/java/org/ethereum/jsontestsuite/GitHubStateTest.java
index 028c064..9dbf78c 100644
--- a/ethereumj-core/src/test/java/org/ethereum/jsontestsuite/GitHubStateTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/jsontestsuite/GitHubStateTest.java
@@ -47,8 +47,8 @@
         SystemProperties.getDefault().setRecordInternalTransactionsData(false);
     }
 
-    @After
-    public void clean() {
+    @AfterClass
+    public static void clean() {
         SystemProperties.getDefault().setBlockchainConfig(MainNetConfig.INSTANCE);
         SystemProperties.getDefault().setRecordInternalTransactionsData(true);
     }
