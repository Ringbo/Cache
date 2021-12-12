diff --git a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/rest/RESTSecurityTokenServiceImpl.java b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/rest/RESTSecurityTokenServiceImpl.java
index 631e8fc..cdeffcb 100644
--- a/services/sts/sts-core/src/main/java/org/apache/cxf/sts/rest/RESTSecurityTokenServiceImpl.java
+++ b/services/sts/sts-core/src/main/java/org/apache/cxf/sts/rest/RESTSecurityTokenServiceImpl.java
@@ -414,7 +414,7 @@
     private static class JSONWrapper {
         private String token;
         
-        public JSONWrapper(String token) {
+        JSONWrapper(String token) {
             this.token = token;
         }
         
