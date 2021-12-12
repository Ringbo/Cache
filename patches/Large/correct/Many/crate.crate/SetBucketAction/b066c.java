diff --git a/sql/src/main/java/io/crate/execution/engine/SetBucketAction.java b/sql/src/main/java/io/crate/execution/engine/SetBucketAction.java
index 650bcd0..eeaccf8 100644
--- a/sql/src/main/java/io/crate/execution/engine/SetBucketAction.java
+++ b/sql/src/main/java/io/crate/execution/engine/SetBucketAction.java
@@ -33,14 +33,14 @@
     private final List<PageBucketReceiver> pageBucketReceivers;
     private final int bucketIdx;
     private final InitializationTracker initializationTracker;
-    private final BucketResultListener bucketResultListener;
+    private final PagingUnsupportedResultListener pagingUnsupportedResultListener;
 
     SetBucketAction(List<PageBucketReceiver> pageBucketReceivers, int bucketIdx, InitializationTracker initializationTracker) {
         assert !pageBucketReceivers.isEmpty() : "pageBucketReceivers must not be empty";
         this.pageBucketReceivers = pageBucketReceivers;
         this.bucketIdx = bucketIdx;
         this.initializationTracker = initializationTracker;
-        bucketResultListener = new BucketResultListener();
+        pagingUnsupportedResultListener = PagingUnsupportedResultListener.INSTANCE;
     }
 
     protected void setBuckets(List<Bucket> result) {
@@ -49,7 +49,7 @@
             PageBucketReceiver pageBucketReceiver = pageBucketReceivers.get(i);
             Bucket bucket = result.get(i);
             assert bucket != null : "expected directResponse but didn't get one idx=" + i;
-            pageBucketReceiver.setBucket(bucketIdx, bucket, true, bucketResultListener);
+            pageBucketReceiver.setBucket(bucketIdx, bucket, true, pagingUnsupportedResultListener);
         }
     }
 
