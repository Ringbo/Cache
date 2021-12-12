diff --git a/telephony/java/com/android/internal/telephony/gsm/UsimPhoneBookManager.java b/telephony/java/com/android/internal/telephony/gsm/UsimPhoneBookManager.java
index d27f240..9caae3d 100644
--- a/telephony/java/com/android/internal/telephony/gsm/UsimPhoneBookManager.java
+++ b/telephony/java/com/android/internal/telephony/gsm/UsimPhoneBookManager.java
@@ -282,7 +282,7 @@
     private void readAdnFileAndWait(int recNum) {
         Map <Integer,Integer> fileIds;
         fileIds = mPbrFile.mFileIds.get(recNum);
-        if (fileIds == null) return;
+        if (fileIds == null || fileIds.isEmpty()) return;
 
         mAdnCache.requestLoadAllAdnLike(fileIds.get(USIM_EFADN_TAG),
             fileIds.get(USIM_EFEXT1_TAG), obtainMessage(EVENT_USIM_ADN_LOAD_DONE));
