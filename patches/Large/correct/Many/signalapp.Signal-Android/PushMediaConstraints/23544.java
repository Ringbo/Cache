diff --git a/src/org/thoughtcrime/securesms/mms/PushMediaConstraints.java b/src/org/thoughtcrime/securesms/mms/PushMediaConstraints.java
index d505ebe..33f22f8 100644
--- a/src/org/thoughtcrime/securesms/mms/PushMediaConstraints.java
+++ b/src/org/thoughtcrime/securesms/mms/PushMediaConstraints.java
@@ -6,7 +6,7 @@
 
 public class PushMediaConstraints extends MediaConstraints {
   private static final int MAX_IMAGE_DIMEN_LOWMEM = 768;
-  private static final int MAX_IMAGE_DIMEN        = 1280;
+  private static final int MAX_IMAGE_DIMEN        = 2048;
   private static final int KB                     = 1024;
   private static final int MB                     = 1024 * KB;
 
@@ -22,7 +22,7 @@
 
   @Override
   public int getImageMaxSize() {
-    return 420 * KB;
+    return 4 * MB;
   }
 
   @Override
