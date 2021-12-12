diff --git a/common/src/main/java/tachyon/worker/DataServerMessage.java b/common/src/main/java/tachyon/worker/DataServerMessage.java
index 4006d91..99ff30f 100644
--- a/common/src/main/java/tachyon/worker/DataServerMessage.java
+++ b/common/src/main/java/tachyon/worker/DataServerMessage.java
@@ -232,7 +232,7 @@
    *
    * @return The id of the block's locker
    */
-  int getLockId() {
+  public int getLockId() {
     return mLockId;
   }
 
@@ -343,7 +343,7 @@
    *
    * @param lockId The id of the block's locker
    */
-  void setLockId(int lockId) {
+  public void setLockId(int lockId) {
     mLockId = lockId;
   }
 }
