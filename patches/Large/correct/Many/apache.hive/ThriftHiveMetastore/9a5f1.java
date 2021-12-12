diff --git a/standalone-metastore/metastore-common/src/gen/thrift/gen-javabean/org/apache/hadoop/hive/metastore/api/ThriftHiveMetastore.java b/standalone-metastore/metastore-common/src/gen/thrift/gen-javabean/org/apache/hadoop/hive/metastore/api/ThriftHiveMetastore.java
index 7ab64ea..47f96f3 100644
--- a/standalone-metastore/metastore-common/src/gen/thrift/gen-javabean/org/apache/hadoop/hive/metastore/api/ThriftHiveMetastore.java
+++ b/standalone-metastore/metastore-common/src/gen/thrift/gen-javabean/org/apache/hadoop/hive/metastore/api/ThriftHiveMetastore.java
@@ -206576,7 +206576,7 @@
   @org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public static class add_write_notification_log_args implements org.apache.thrift.TBase<add_write_notification_log_args, add_write_notification_log_args._Fields>, java.io.Serializable, Cloneable, Comparable<add_write_notification_log_args>   {
     private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("add_write_notification_log_args");
 
-    private static final org.apache.thrift.protocol.TField RQST_FIELD_DESC = new org.apache.thrift.protocol.TField("rqst", org.apache.thrift.protocol.TType.STRUCT, (short)-1);
+    private static final org.apache.thrift.protocol.TField RQST_FIELD_DESC = new org.apache.thrift.protocol.TField("rqst", org.apache.thrift.protocol.TType.STRUCT, (short)1);
 
     private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
     static {
@@ -206588,7 +206588,7 @@
 
     /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
     public enum _Fields implements org.apache.thrift.TFieldIdEnum {
-      RQST((short)-1, "rqst");
+      RQST((short)1, "rqst");
 
       private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
 
@@ -206603,7 +206603,7 @@
        */
       public static _Fields findByThriftId(int fieldId) {
         switch(fieldId) {
-          case -1: // RQST
+          case 1: // RQST
             return RQST;
           default:
             return null;
@@ -206868,7 +206868,7 @@
             break;
           }
           switch (schemeField.id) {
-            case -1: // RQST
+            case 1: // RQST
               if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                 struct.rqst = new WriteNotificationLogRequest();
                 struct.rqst.read(iprot);
