diff --git a/nifi-mock/src/main/java/org/apache/nifi/util/MockProcessSession.java b/nifi-mock/src/main/java/org/apache/nifi/util/MockProcessSession.java
index 553c6e4..2fdc6ea 100644
--- a/nifi-mock/src/main/java/org/apache/nifi/util/MockProcessSession.java
+++ b/nifi-mock/src/main/java/org/apache/nifi/util/MockProcessSession.java
@@ -756,10 +756,10 @@
             throw new IllegalArgumentException("I only accept MockFlowFile");
         }
 
-        // if the flowfile provided was created in this session (i.e. it's in currentVersions),
+        // if the flowfile provided was created in this session (i.e. it's in currentVersions and not in original versions),
         // then throw an exception indicating that you can't transfer flowfiles back to self.
-        // this mimics the behavior of StandardProcessSession
-        if(currentVersions.get(flowFile.getId()) != null) {
+        // this mimics the same behavior in StandardProcessSession
+        if(currentVersions.get(flowFile.getId()) != null && originalVersions.get(flowFile.getId()) == null) {
             throw new IllegalArgumentException("Cannot transfer FlowFiles that are created in this Session back to self");
         }
 
