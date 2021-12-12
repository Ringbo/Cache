diff --git a/logback-core/src/main/java/ch/qos/logback/core/recovery/ResilientOutputStreamBase.java b/logback-core/src/main/java/ch/qos/logback/core/recovery/ResilientOutputStreamBase.java
index 36a91ba..caf31f3 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/recovery/ResilientOutputStreamBase.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/recovery/ResilientOutputStreamBase.java
@@ -35,7 +35,7 @@
   protected OutputStream os;
   protected boolean presumedClean = true;
 
-  final private boolean isPresumedInError() {
+  private boolean isPresumedInError() {
     // existence of recoveryCoordinator indicates failed state
     return (recoveryCoordinator != null && !presumedClean);
   }
@@ -88,7 +88,7 @@
 
   abstract OutputStream openNewOutputStream() throws IOException;
 
-  final private void postSuccessfulWrite() {
+  private void postSuccessfulWrite() {
     if (recoveryCoordinator != null) {
       recoveryCoordinator = null;
       statusCount = 0;
