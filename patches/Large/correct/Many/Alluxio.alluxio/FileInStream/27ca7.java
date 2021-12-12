diff --git a/clients/unshaded/src/main/java/tachyon/client/file/FileInStream.java b/clients/unshaded/src/main/java/tachyon/client/file/FileInStream.java
index e56294b..8c533a3 100644
--- a/clients/unshaded/src/main/java/tachyon/client/file/FileInStream.java
+++ b/clients/unshaded/src/main/java/tachyon/client/file/FileInStream.java
@@ -117,7 +117,8 @@
       try {
         mCurrentCacheStream.write(data);
       } catch (IOException ioe) {
-        LOG.warn("Block of ID " + getCurrentBlockId() + " could not be cached into Tachyon", ioe);
+        LOG.warn("Block of ID " + getCurrentBlockId()
+            + " could not be cached into Tachyon. Exception:" + ioe.getMessage());
         mShouldCacheCurrentBlock = false;
       }
     }
@@ -154,7 +155,7 @@
           mCurrentCacheStream.write(b, currentOffset, bytesRead);
         } catch (IOException ioe) {
           LOG.warn("Failed to write into TachyonStorage, the block " + getCurrentBlockId()
-              + " will not be in TachyonStorage", ioe);
+              + " will not be in TachyonStorage. Exception:" + ioe.getMessage());
           mShouldCacheCurrentBlock = false;
         }
       }
@@ -229,7 +230,7 @@
                      NetworkAddressUtils.getLocalHostName(ClientContext.getConf()));
         } catch (IOException ioe) {
           LOG.warn("Failed to get TachyonStore stream, the block " + currentBlockId
-              + " will not be in TachyonStorage", ioe);
+              + " will not be in TachyonStorage. Exception:" + ioe.getMessage());
           mShouldCacheCurrentBlock = false;
         }
       }
@@ -290,7 +291,7 @@
                       NetworkAddressUtils.getLocalHostName(ClientContext.getConf()));
         } catch (IOException ioe) {
           LOG.warn("Failed to write to TachyonStore stream, block " + getCurrentBlockId()
-              + " will not be in TachyonStorage.", ioe);
+              + " will not be in TachyonStorage. Exception:" + ioe.getMessage());
           mShouldCacheCurrentBlock = false;
         }
       } else {
@@ -316,14 +317,15 @@
           mContext.getTachyonBlockStore().promote(blockId);
         } catch (IOException ioe) {
           // Failed to promote
-          LOG.warn("Promotion of block " + blockId + " failed.", ioe);
+          LOG.warn("Promotion of block " + blockId + " failed.");
         }
       }
       mCurrentBlockInStream = mContext.getTachyonBlockStore().getInStream(blockId);
       mShouldCacheCurrentBlock =
           !(mCurrentBlockInStream instanceof LocalBlockInStream) && mTachyonStorageType.isStore();
     } catch (IOException ioe) {
-      LOG.debug("Failed to get BlockInStream for " + blockId + ", using ufs instead", ioe);
+      LOG.debug("Failed to get BlockInStream for " + blockId + ", using ufs instead. Exception:"
+          + ioe.getMessage());
       if (!mFileInfo.isPersisted) {
         LOG.error("Could not obtain data for " + blockId
             + " from Tachyon and data is not persisted in under storage.");
