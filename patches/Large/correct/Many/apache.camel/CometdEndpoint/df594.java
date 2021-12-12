diff --git a/components/camel-cometd/src/main/java/org/apache/camel/component/cometd/CometdEndpoint.java b/components/camel-cometd/src/main/java/org/apache/camel/component/cometd/CometdEndpoint.java
index a20b3b4..1e81c42 100644
--- a/components/camel-cometd/src/main/java/org/apache/camel/component/cometd/CometdEndpoint.java
+++ b/components/camel-cometd/src/main/java/org/apache/camel/component/cometd/CometdEndpoint.java
@@ -112,7 +112,7 @@
     }
 
     public boolean isSingleton() {
-        return false;
+        return true;
     }
 
     public String getPath() {
