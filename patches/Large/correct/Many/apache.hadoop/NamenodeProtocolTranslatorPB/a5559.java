diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/protocolPB/NamenodeProtocolTranslatorPB.java b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/protocolPB/NamenodeProtocolTranslatorPB.java
index 56a239e..86e0d9c 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/protocolPB/NamenodeProtocolTranslatorPB.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/main/java/org/apache/hadoop/hdfs/protocolPB/NamenodeProtocolTranslatorPB.java
@@ -206,7 +206,7 @@
       String msg) throws IOException {
     ErrorReportRequestProto req = ErrorReportRequestProto.newBuilder()
         .setErrorCode(errorCode).setMsg(msg)
-        .setRegistartion(PBHelper.convert(registration)).build();
+        .setRegistration(PBHelper.convert(registration)).build();
     try {
       rpcProxy.errorReport(NULL_CONTROLLER, req);
     } catch (ServiceException e) {
