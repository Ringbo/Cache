diff --git a/common/src/main/java/org/broadleafcommerce/common/web/util/CachingCompressedResponseFilter.java b/common/src/main/java/org/broadleafcommerce/common/web/util/CachingCompressedResponseFilter.java
index 5e5cd9e..5d55e54 100644
--- a/common/src/main/java/org/broadleafcommerce/common/web/util/CachingCompressedResponseFilter.java
+++ b/common/src/main/java/org/broadleafcommerce/common/web/util/CachingCompressedResponseFilter.java
@@ -362,7 +362,7 @@
             }
         }
 
-        return true;
+        return false;
     }
 
 }
