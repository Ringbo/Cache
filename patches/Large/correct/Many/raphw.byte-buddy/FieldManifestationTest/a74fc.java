diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/description/modifier/FieldManifestationTest.java b/byte-buddy-dep/src/test/java/net/bytebuddy/description/modifier/FieldManifestationTest.java
index 5f86cc6..62d8f0f 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/description/modifier/FieldManifestationTest.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/description/modifier/FieldManifestationTest.java
@@ -36,7 +36,7 @@
                 {FieldManifestation.PLAIN, 0, true, false, false, false, true},
                 {FieldManifestation.FINAL, Opcodes.ACC_FINAL, false, true, false, false, false},
                 {FieldManifestation.VOLATILE, Opcodes.ACC_VOLATILE, false, false, true, false, false},
-                {FieldManifestation.TRANSIENT, Opcodes.ACC_TRANSIENT, false, false, true, true, false},
+                {FieldManifestation.TRANSIENT, Opcodes.ACC_TRANSIENT, false, false, false, true, false},
                 {FieldManifestation.VOLATILE_TRANSIENT, Opcodes.ACC_VOLATILE | Opcodes.ACC_TRANSIENT, false, false, true, true, false},
         });
     }
