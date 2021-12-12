diff --git a/platform/platform-impl/src/com/intellij/ide/passwordSafe/impl/providers/masterKey/MasterKeyPasswordSafe.java b/platform/platform-impl/src/com/intellij/ide/passwordSafe/impl/providers/masterKey/MasterKeyPasswordSafe.java
index 8d919d8..8401592 100644
--- a/platform/platform-impl/src/com/intellij/ide/passwordSafe/impl/providers/masterKey/MasterKeyPasswordSafe.java
+++ b/platform/platform-impl/src/com/intellij/ide/passwordSafe/impl/providers/masterKey/MasterKeyPasswordSafe.java
@@ -199,7 +199,7 @@
               }
             }
           }
-        }, ModalityState.defaultModalityState());
+        }, ModalityState.any());
         //noinspection ThrowableResultOfMethodCallIgnored
         if (ex.get() != null) {
           throw ex.get();
