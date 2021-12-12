diff --git a/logback-access/src/main/java/ch/qos/logback/access/pattern/LocalIPAddressConverter.java b/logback-access/src/main/java/ch/qos/logback/access/pattern/LocalIPAddressConverter.java
index 6d25e75..7f0e514 100644
--- a/logback-access/src/main/java/ch/qos/logback/access/pattern/LocalIPAddressConverter.java
+++ b/logback-access/src/main/java/ch/qos/logback/access/pattern/LocalIPAddressConverter.java
@@ -9,7 +9,7 @@
 
   String localIPAddressStr;
 
-  LocalIPAddressConverter() {
+  public LocalIPAddressConverter() {
     try {
       localIPAddressStr = InetAddress.getLocalHost().getHostAddress();
     } catch (UnknownHostException uhe) {
