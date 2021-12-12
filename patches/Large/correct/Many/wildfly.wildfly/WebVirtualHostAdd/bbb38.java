diff --git a/web/src/main/java/org/jboss/as/web/WebVirtualHostAdd.java b/web/src/main/java/org/jboss/as/web/WebVirtualHostAdd.java
index 5bd1a4b..b69fba5 100644
--- a/web/src/main/java/org/jboss/as/web/WebVirtualHostAdd.java
+++ b/web/src/main/java/org/jboss/as/web/WebVirtualHostAdd.java
@@ -53,6 +53,7 @@
  * {@code OperationHandler} responsible for adding a virtual host.
  *
  * @author Emanuel Muckenhuber
+ * @author Scott stark (sstark@redhat.com) (C) 2011 Red Hat Inc.
  */
 class WebVirtualHostAdd implements ModelAddOperationHandler, DescriptionProvider {
 
@@ -134,7 +135,7 @@
     }
 
     static String[] aliases(final ModelNode node) {
-        if(node.has(Constants.ALIAS)) {
+        if(node.hasDefined(Constants.ALIAS)) {
             final ModelNode aliases = node.require(Constants.ALIAS);
             final int size = aliases.asInt();
             final String[] array = new String[size];
