diff --git a/src/main/java/com/alibaba/druid/support/http/WebStatFilter.java b/src/main/java/com/alibaba/druid/support/http/WebStatFilter.java
index b50dca3..0746a42 100644
--- a/src/main/java/com/alibaba/druid/support/http/WebStatFilter.java
+++ b/src/main/java/com/alibaba/druid/support/http/WebStatFilter.java
@@ -185,7 +185,7 @@
     }
 
     public boolean isExclusion(String requestURI) {
-        if (excludesPattern == null) {
+        if (excludesPattern == null || requestURI == null) {
             return false;
         }
 
