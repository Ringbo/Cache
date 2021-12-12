diff --git a/src/main/java/com/metaweb/gridworks/model/ReconCandidate.java b/src/main/java/com/metaweb/gridworks/model/ReconCandidate.java
index 10f6f02..e59eeff 100644
--- a/src/main/java/com/metaweb/gridworks/model/ReconCandidate.java
+++ b/src/main/java/com/metaweb/gridworks/model/ReconCandidate.java
@@ -27,7 +27,7 @@
     
     public Object getField(String name, Properties bindings) {
         if ("id".equals(name)) {
-            return topicName;
+            return topicID;
         } else if ("guid".equals(name)) {
             return topicGUID;
         } else if ("name".equals(name)) {
