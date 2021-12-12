diff --git a/core/client/src/main/java/alluxio/client/file/options/InStreamOptions.java b/core/client/src/main/java/alluxio/client/file/options/InStreamOptions.java
index 0073148..ab1d3e6 100644
--- a/core/client/src/main/java/alluxio/client/file/options/InStreamOptions.java
+++ b/core/client/src/main/java/alluxio/client/file/options/InStreamOptions.java
@@ -117,18 +117,19 @@
       return false;
     }
     InStreamOptions that = (InStreamOptions) o;
-    return Objects.equal(mLocationPolicy, that.mLocationPolicy) && Objects
-        .equal(mReadType, that.mReadType);
+    return Objects.equal(mLocationPolicy, that.mLocationPolicy) &&
+        Objects.equal(mReadType, that.mReadType) &&
+        Objects.equal(mCacheIncompleteBlock, that.mCacheIncompleteBlock);
   }
 
   @Override
   public int hashCode() {
-    return Objects.hashCode(mLocationPolicy, mReadType);
+    return Objects.hashCode(mLocationPolicy, mReadType, mCacheIncompleteBlock);
   }
 
   @Override
   public String toString() {
     return Objects.toStringHelper(this).add("locationPolicy", mLocationPolicy)
-        .add("readType", mReadType).toString();
+        .add("readType", mReadType).add("cacheIncompleteBlock", mCacheIncompleteBlock).toString();
   }
 }
