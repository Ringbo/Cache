diff --git a/ethereumj-core/src/main/java/org/ethereum/samples/TestNetSample.java b/ethereumj-core/src/main/java/org/ethereum/samples/TestNetSample.java
index a4f82d7..6bf0264 100644
--- a/ethereumj-core/src/main/java/org/ethereum/samples/TestNetSample.java
+++ b/ethereumj-core/src/main/java/org/ethereum/samples/TestNetSample.java
@@ -52,7 +52,7 @@
     }
 
     @Override
-    public void onSyncDone() {
+    public void onSyncDone() throws Exception {
         super.onSyncDone();
     }
 
