diff --git a/core/src/main/java/tachyon/conf/Utils.java b/core/src/main/java/tachyon/conf/Utils.java
index b9631ea..5e1c00b 100644
--- a/core/src/main/java/tachyon/conf/Utils.java
+++ b/core/src/main/java/tachyon/conf/Utils.java
@@ -51,7 +51,7 @@
 
   public static String getProperty(String property) {
     String ret = System.getProperty(property);
-    Preconditions.checkArgument(ret == null, property + " is not configured.");
+    Preconditions.checkArgument(ret != null, property + " is not configured.");
     LOG.debug(property + " : " + ret);
     return ret;
   }
