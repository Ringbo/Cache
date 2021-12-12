diff --git a/shield/src/main/java/org/elasticsearch/shield/action/authc/cache/ClearRealmCacheRequest.java b/shield/src/main/java/org/elasticsearch/shield/action/authc/cache/ClearRealmCacheRequest.java
index b11185b..b8d4f0a 100644
--- a/shield/src/main/java/org/elasticsearch/shield/action/authc/cache/ClearRealmCacheRequest.java
+++ b/shield/src/main/java/org/elasticsearch/shield/action/authc/cache/ClearRealmCacheRequest.java
@@ -84,12 +84,12 @@
         out.writeStringArrayNullable(usernames);
     }
 
-    static class Node extends BaseNodeRequest {
+    public static class Node extends BaseNodeRequest {
 
         String[] realms;
         String[] usernames;
 
-        Node() {
+        public Node() {
         }
 
         Node(ClearRealmCacheRequest request, String nodeId) {
