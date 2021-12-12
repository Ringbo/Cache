diff --git a/enterprise/fulltext-addon/src/main/java/org/neo4j/kernel/api/impl/fulltext/FulltextUpdateApplier.java b/enterprise/fulltext-addon/src/main/java/org/neo4j/kernel/api/impl/fulltext/FulltextUpdateApplier.java
index 1cdbc81e..8194965 100644
--- a/enterprise/fulltext-addon/src/main/java/org/neo4j/kernel/api/impl/fulltext/FulltextUpdateApplier.java
+++ b/enterprise/fulltext-addon/src/main/java/org/neo4j/kernel/api/impl/fulltext/FulltextUpdateApplier.java
@@ -51,7 +51,7 @@
     private final ApplierThread workerThread;
     private final Log log;
 
-    public FulltextUpdateApplier( Log log )
+    FulltextUpdateApplier( Log log )
     {
         this.log = log;
         workQueue = new LinkedBlockingQueue<>();
@@ -216,7 +216,7 @@
         private LinkedBlockingQueue<FulltextIndexUpdate> workQueue;
         private final Log log;
 
-        public ApplierThread( LinkedBlockingQueue<FulltextIndexUpdate> workQueue, Log log )
+        ApplierThread( LinkedBlockingQueue<FulltextIndexUpdate> workQueue, Log log )
         {
             super( "Fulltext Index Add-On Applier Thread" );
             this.workQueue = workQueue;
