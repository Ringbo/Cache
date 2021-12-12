diff --git a/clustering/common/src/main/java/org/jboss/as/clustering/msc/AsynchronousService.java b/clustering/common/src/main/java/org/jboss/as/clustering/msc/AsynchronousService.java
index 84944aa..ecfafe8 100644
--- a/clustering/common/src/main/java/org/jboss/as/clustering/msc/AsynchronousService.java
+++ b/clustering/common/src/main/java/org/jboss/as/clustering/msc/AsynchronousService.java
@@ -41,7 +41,7 @@
     private final boolean stopAsynchronously;
 
     protected AsynchronousService() {
-        this(true, true);
+        this(true, false);
     }
 
     protected AsynchronousService(boolean startAsynchronously, boolean stopAsynchronously) {
