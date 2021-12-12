diff --git a/tinker-android/tinker-android-loader/src/main/java/com/tencent/tinker/loader/shareutil/SharePatchInfo.java b/tinker-android/tinker-android-loader/src/main/java/com/tencent/tinker/loader/shareutil/SharePatchInfo.java
index 53d4693..be6dc66 100644
--- a/tinker-android/tinker-android-loader/src/main/java/com/tencent/tinker/loader/shareutil/SharePatchInfo.java
+++ b/tinker-android/tinker-android-loader/src/main/java/com/tencent/tinker/loader/shareutil/SharePatchInfo.java
@@ -37,7 +37,7 @@
     public static final String FINGER_PRINT         = "print";
     public static final String OAT_DIR              = "dir";
     public static final String DEFAULT_DIR   = ShareConstants.DEFAULT_DEX_OPTIMIZE_PATH;
-    private static final String TAG = "PatchInfo";
+    private static final String TAG = "Tinker.PatchInfo";
     public String oldVersion;
     public String newVersion;
     public String fingerPrint;
@@ -73,7 +73,7 @@
                     fileLock.close();
                 }
             } catch (IOException e) {
-                Log.i(TAG, "releaseInfoLock error", e);
+                Log.w(TAG, "releaseInfoLock error", e);
             }
         }
 
@@ -129,7 +129,7 @@
                 oatDIr = properties.getProperty(OAT_DIR);
             } catch (IOException e) {
 //                e.printStackTrace();
-                Log.e(TAG, "read property failed, e:" + e);
+                Log.w(TAG, "read property failed, e:" + e);
             } finally {
                 SharePatchFileUtil.closeQuietly(inputStream);
             }
@@ -199,7 +199,8 @@
                 String comment = "from old version:" + info.oldVersion + " to new version:" + info.newVersion;
                 newProperties.store(outputStream, comment);
             } catch (Exception e) {
-                e.printStackTrace();
+//                e.printStackTrace();
+                Log.w(TAG, "write property failed, e:" + e);
             } finally {
                 SharePatchFileUtil.closeQuietly(outputStream);
             }
