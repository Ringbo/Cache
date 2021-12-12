diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ha/ActiveStandbyElector.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ha/ActiveStandbyElector.java
index fc717c2..995d822 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ha/ActiveStandbyElector.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/ha/ActiveStandbyElector.java
@@ -768,7 +768,7 @@
   }
 
   @InterfaceAudience.Private
-  public void terminateConnection() {
+  public synchronized void terminateConnection() {
     if (zkClient == null) {
       return;
     }
