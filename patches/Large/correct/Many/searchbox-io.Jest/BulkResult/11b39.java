diff --git a/jest-common/src/main/java/io/searchbox/core/BulkResult.java b/jest-common/src/main/java/io/searchbox/core/BulkResult.java
index 72f7853..21029d4 100644
--- a/jest-common/src/main/java/io/searchbox/core/BulkResult.java
+++ b/jest-common/src/main/java/io/searchbox/core/BulkResult.java
@@ -96,7 +96,7 @@
             this.type = values.get("_type").getAsString();
             this.id = values.get("_id").getAsString();
             this.status = values.get("status").getAsInt();
-            this.error = values.has("error") ? values.get("error").getAsString() : null;
+            this.error = values.has("error") ? values.get("error").toString() : null;
         }
 
         @Override
