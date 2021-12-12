diff --git a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/toolchain/internal/gcc/version/GccVersionDeterminer.java b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/toolchain/internal/gcc/version/GccVersionDeterminer.java
index a7cab5b..7bc2bf5 100644
--- a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/toolchain/internal/gcc/version/GccVersionDeterminer.java
+++ b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/toolchain/internal/gcc/version/GccVersionDeterminer.java
@@ -130,7 +130,7 @@
         }
         boolean i386 = defines.containsKey("__i386__");
         boolean amd64 = defines.containsKey("__amd64__");
-        ArchitectureInternal architecture;
+        final ArchitectureInternal architecture;
         if (i386) {
             architecture = new DefaultArchitecture("i386", ArchitectureInternal.InstructionSet.X86, 32);
         } else if (amd64) {
