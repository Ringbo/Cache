diff --git a/dubbo-cluster/src/main/java/org/apache/dubbo/rpc/cluster/router/InvokerTreeCache.java b/dubbo-cluster/src/main/java/org/apache/dubbo/rpc/cluster/router/InvokerTreeCache.java
index 7a497a3..5ce835b 100644
--- a/dubbo-cluster/src/main/java/org/apache/dubbo/rpc/cluster/router/InvokerTreeCache.java
+++ b/dubbo-cluster/src/main/java/org/apache/dubbo/rpc/cluster/router/InvokerTreeCache.java
@@ -31,7 +31,7 @@
  */
 public class InvokerTreeCache<T> {
 
-    TreeNode<T> tree;
+    private TreeNode<T> tree;
 
     public TreeNode buildTree() {
         tree = new TreeNode<>();
@@ -43,7 +43,7 @@
 
     public List<Invoker<T>> getInvokers(TreeNode<T> node, URL url, Invocation invocation) {
         // We have reached the leaf node.
-        if (node.getChildren() == null || node.getChildren().size() == 0) {
+        if (node.isLeaf()) {
             return node.getInvokers();
         }
 
@@ -102,7 +102,7 @@
             String forceKey = "force." + failoverNode.getConditionKey();
             if (Boolean.valueOf(invocation.getAttachment(forceKey, url.getParameter(forceKey, "false")))) {
                 /**
-                 * This may mistakely return empty list for runtime routers
+                 * This may mistakenly return empty list for runtime routers
                  * see {@link org.apache.dubbo.rpc.cluster.router.tag.TagRouter.getKey()} for the workaround.
                  */
                 return Collections.emptyList();
