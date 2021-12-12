diff --git a/clients/unshaded/src/main/java/tachyon/client/file/FileInStream.java b/clients/unshaded/src/main/java/tachyon/client/file/FileInStream.java
index e56294b..547d8e6 100644
--- a/clients/unshaded/src/main/java/tachyon/client/file/FileInStream.java
+++ b/clients/unshaded/src/main/java/tachyon/client/file/FileInStream.java
@@ -117,7 +117,7 @@
       try {
         mCurrentCacheStream.write(data);
       } catch (IOException ioe) {
-        LOG.warn("Block of ID " + getCurrentBlockId() + " could not be cached into Tachyon", ioe);
+        LOG.warn("Block of ID " + getCurrentBlockId() + " could not be cached into Tachyon");
         mShouldCacheCurrentBlock = false;
       }
     }
@@ -154,7 +154,7 @@
           mCurrentCacheStream.write(b, currentOffset, bytesRead);
         } catch (IOException ioe) {
           LOG.warn("Failed to write into TachyonStorage, the block " + getCurrentBlockId()
-              + " will not be in TachyonStorage", ioe);
+              + " will not be in TachyonStorage");
           mShouldCacheCurrentBlock = false;
         }
       }
@@ -229,7 +229,7 @@
                      NetworkAddressUtils.getLocalHostName(ClientContext.getConf()));
         } catch (IOException ioe) {
           LOG.warn("Failed to get TachyonStore stream, the block " + currentBlockId
-              + " will not be in TachyonStorage", ioe);
+              + " will not be in TachyonStorage");
           mShouldCacheCurrentBlock = false;
         }
       }
@@ -290,7 +290,7 @@
                       NetworkAddressUtils.getLocalHostName(ClientContext.getConf()));
         } catch (IOException ioe) {
           LOG.warn("Failed to write to TachyonStore stream, block " + getCurrentBlockId()
-              + " will not be in TachyonStorage.", ioe);
+              + " will not be in TachyonStorage.");
           mShouldCacheCurrentBlock = false;
         }
       } else {
@@ -316,14 +316,14 @@
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
+      LOG.debug("Failed to get BlockInStream for " + blockId + ", using ufs instead.");
       if (!mFileInfo.isPersisted) {
         LOG.error("Could not obtain data for " + blockId
             + " from Tachyon and data is not persisted in under storage.");
