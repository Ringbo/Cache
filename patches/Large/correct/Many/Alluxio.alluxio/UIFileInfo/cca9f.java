diff --git a/core/server/src/main/java/alluxio/web/UIFileInfo.java b/core/server/src/main/java/alluxio/web/UIFileInfo.java
index d1981f2..6134aa1 100644
--- a/core/server/src/main/java/alluxio/web/UIFileInfo.java
+++ b/core/server/src/main/java/alluxio/web/UIFileInfo.java
@@ -279,7 +279,7 @@
    * @return the percentage of the file stored in the given tier
    */
   public int getOnTierPercentage(String tierAlias) {
-    Long sizeOnTier = mSizeOnTier.containsKey(tierAlias) ? mSizeOnTier.get(tierAlias) : 0;
+    Long sizeOnTier = mSizeOnTier.containsKey(tierAlias) ? mSizeOnTier.get(tierAlias) : 0L;
     return (int) (100 * sizeOnTier / mSize);
   }
 
