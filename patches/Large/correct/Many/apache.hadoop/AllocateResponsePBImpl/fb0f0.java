diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/api/protocolrecords/impl/pb/AllocateResponsePBImpl.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/api/protocolrecords/impl/pb/AllocateResponsePBImpl.java
index bd460f6..da87465 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/api/protocolrecords/impl/pb/AllocateResponsePBImpl.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-common/src/main/java/org/apache/hadoop/yarn/api/protocolrecords/impl/pb/AllocateResponsePBImpl.java
@@ -386,7 +386,7 @@
   }
 
   @Override
-  public Priority getApplicationPriority() {
+  public synchronized Priority getApplicationPriority() {
     AllocateResponseProtoOrBuilder p = viaProto ? proto : builder;
     if (this.appPriority != null) {
       return this.appPriority;
@@ -399,7 +399,7 @@
   }
 
   @Override
-  public void setApplicationPriority(Priority priority) {
+  public synchronized void setApplicationPriority(Priority priority) {
     maybeInitBuilder();
     if (priority == null)
       builder.clearApplicationPriority();
