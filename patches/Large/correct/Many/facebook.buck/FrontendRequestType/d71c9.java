diff --git a/src-gen/com/facebook/buck/distributed/thrift/FrontendRequestType.java b/src-gen/com/facebook/buck/distributed/thrift/FrontendRequestType.java
index 4ba92ff..93f2b07 100644
--- a/src-gen/com/facebook/buck/distributed/thrift/FrontendRequestType.java
+++ b/src-gen/com/facebook/buck/distributed/thrift/FrontendRequestType.java
@@ -15,7 +15,7 @@
   UNKNOWN(0),
   START_BUILD(1),
   BUILD_STATUS(2),
-  LOG(3);
+  LOG(5);
 
   private final int value;
 
@@ -42,7 +42,7 @@
         return START_BUILD;
       case 2:
         return BUILD_STATUS;
-      case 3:
+      case 5:
         return LOG;
       default:
         return null;
