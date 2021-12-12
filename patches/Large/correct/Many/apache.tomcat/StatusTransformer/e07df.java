diff --git a/java/org/apache/catalina/manager/StatusTransformer.java b/java/org/apache/catalina/manager/StatusTransformer.java
index 636cfc4..68244cc 100644
--- a/java/org/apache/catalina/manager/StatusTransformer.java
+++ b/java/org/apache/catalina/manager/StatusTransformer.java
@@ -264,7 +264,7 @@
                 writer.write(" usageInit='" + usage.getInit() + "'");
                 writer.write(" usageCommitted='" + usage.getCommitted() + "'");
                 writer.write(" usageMax='" + usage.getMax() + "'");
-                writer.write(" usageUsed='" + usage.getInit() + "'/>");
+                writer.write(" usageUsed='" + usage.getUsed() + "'/>");
             }
 
             writer.write("</jvm>");
