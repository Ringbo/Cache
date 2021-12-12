diff --git a/packages/MtpDocumentsProvider/tests/src/com/android/mtp/MtpDocumentsProviderTest.java b/packages/MtpDocumentsProvider/tests/src/com/android/mtp/MtpDocumentsProviderTest.java
index b86b2e2..bcff6c9d 100644
--- a/packages/MtpDocumentsProvider/tests/src/com/android/mtp/MtpDocumentsProviderTest.java
+++ b/packages/MtpDocumentsProvider/tests/src/com/android/mtp/MtpDocumentsProviderTest.java
@@ -30,12 +30,12 @@
 public class MtpDocumentsProviderTest extends AndroidTestCase {
     private ContentResolver mResolver;
     private MtpDocumentsProvider mProvider;
-    private MtpManagerMock mMtpManager;
+    private TestMtpManager mMtpManager;
 
     @Override
     public void setUp() {
         mResolver = new ContentResolver();
-        mMtpManager = new MtpManagerMock(getContext());
+        mMtpManager = new TestMtpManager(getContext());
         mProvider = new MtpDocumentsProvider();
         mProvider.onCreateForTesting(mMtpManager, mResolver);
     }
