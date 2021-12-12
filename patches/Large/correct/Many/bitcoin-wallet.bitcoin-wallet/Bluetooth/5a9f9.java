diff --git a/wallet/src/de/schildbach/wallet/util/Bluetooth.java b/wallet/src/de/schildbach/wallet/util/Bluetooth.java
index aca6f53..792f8d0 100644
--- a/wallet/src/de/schildbach/wallet/util/Bluetooth.java
+++ b/wallet/src/de/schildbach/wallet/util/Bluetooth.java
@@ -65,7 +65,7 @@
             if (mService == null)
                 return null;
             return (String) mService.getClass().getMethod("getAddress").invoke(mService);
-        } catch (final ReflectiveOperationException x) {
+        } catch (final Exception x) {
             throw new RuntimeException(x);
         }
     }
