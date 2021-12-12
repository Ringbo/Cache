diff --git a/apollo-biz/src/main/java/com/ctrip/framework/apollo/biz/message/ReleaseMessageScanner.java b/apollo-biz/src/main/java/com/ctrip/framework/apollo/biz/message/ReleaseMessageScanner.java
index 9916a8b..39fea52 100644
--- a/apollo-biz/src/main/java/com/ctrip/framework/apollo/biz/message/ReleaseMessageScanner.java
+++ b/apollo-biz/src/main/java/com/ctrip/framework/apollo/biz/message/ReleaseMessageScanner.java
@@ -38,7 +38,7 @@
   private long maxIdScanned;
 
   public ReleaseMessageScanner() {
-    listeners = Lists.newLinkedList();
+    listeners = Lists.newCopyOnWriteArrayList();
     executorService = Executors.newScheduledThreadPool(1, ApolloThreadFactory
         .create("ReleaseMessageScanner", true));
   }
