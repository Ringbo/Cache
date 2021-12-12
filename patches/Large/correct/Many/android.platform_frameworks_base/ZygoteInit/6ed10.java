diff --git a/core/java/com/android/internal/os/ZygoteInit.java b/core/java/com/android/internal/os/ZygoteInit.java
index 9c960c0..73a3a0b 100644
--- a/core/java/com/android/internal/os/ZygoteInit.java
+++ b/core/java/com/android/internal/os/ZygoteInit.java
@@ -753,7 +753,7 @@
             closeServerSocket();
         } catch (MethodAndArgsCaller caller) {
             caller.run();
-        } catch (RuntimeException ex) {
+        } catch (Throwable ex) {
             Log.e(TAG, "Zygote died with exception", ex);
             closeServerSocket();
             throw ex;
