diff --git a/library/src/main/java/com/evernote/android/job/util/support/PersistableBundleCompat.java b/library/src/main/java/com/evernote/android/job/util/support/PersistableBundleCompat.java
index ed53ab2..86889b1 100644
--- a/library/src/main/java/com/evernote/android/job/util/support/PersistableBundleCompat.java
+++ b/library/src/main/java/com/evernote/android/job/util/support/PersistableBundleCompat.java
@@ -242,8 +242,8 @@
             // shouldn't happen
             return "";
 
-        } catch (VerifyError e) {
-            // https://gist.github.com/vRallev/9444359f05259e4b6317
+        } catch (Error e) {
+            // https://gist.github.com/vRallev/9444359f05259e4b6317 and other crashes on rooted devices
             CAT.e(e);
             return "";
 
