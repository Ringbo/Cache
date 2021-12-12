diff --git a/camel-core/src/main/java/org/apache/camel/management/CamelNamingStrategy.java b/camel-core/src/main/java/org/apache/camel/management/CamelNamingStrategy.java
index 7f35ec1..0d5f021 100644
--- a/camel-core/src/main/java/org/apache/camel/management/CamelNamingStrategy.java
+++ b/camel-core/src/main/java/org/apache/camel/management/CamelNamingStrategy.java
@@ -157,7 +157,7 @@
         buffer.append(KEY_CONTEXT + "=").append(ctxid).append(",");
         buffer.append(KEY_ROUTE + "=").append(id).append(",");
         buffer.append(KEY_TYPE + "=" + TYPE_PROCESSOR + ",");
-        buffer.append(KEY_NODE_ID + "=").append(id).append(",");
+        buffer.append(KEY_NODE_ID + "=").append(nodeId).append(",");
         buffer.append(KEY_NAME + "=").append(ObjectName.quote(processor.toString()));
         return createObjectName(buffer);
     }
