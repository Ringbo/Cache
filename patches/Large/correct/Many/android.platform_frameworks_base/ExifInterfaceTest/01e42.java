diff --git a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/unit/ExifInterfaceTest.java b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/unit/ExifInterfaceTest.java
index db326ba..012041f 100644
--- a/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/unit/ExifInterfaceTest.java
+++ b/media/tests/MediaFrameworkTest/src/com/android/mediaframeworktest/unit/ExifInterfaceTest.java
@@ -416,7 +416,7 @@
             in = getContext().getAssets().open(imageFile.getName());
             ExifInterface exifInterface = new ExifInterface(in);
             exifInterface.saveAttributes();
-        } catch (UnsupportedOperationException e) {
+        } catch (IOException e) {
             // Expected. saveAttributes is not supported with an ExifInterface object which was
             // created with InputStream.
             return;
