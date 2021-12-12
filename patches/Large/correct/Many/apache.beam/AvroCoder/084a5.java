diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/AvroCoder.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/AvroCoder.java
index 591f145..b62c5af 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/AvroCoder.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/coders/AvroCoder.java
@@ -715,7 +715,7 @@
       } else {
         // If it was an unknown type encoded as an array, be conservative and assume
         // that we don't know anything about the order.
-        reportError(context, "encoding %s as an ARRAY was unexpected");
+        reportError(context, "encoding %s as an ARRAY was unexpected", type);
         return;
       }
 
