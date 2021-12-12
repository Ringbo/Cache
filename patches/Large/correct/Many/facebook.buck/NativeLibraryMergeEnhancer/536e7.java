diff --git a/src/com/facebook/buck/android/NativeLibraryMergeEnhancer.java b/src/com/facebook/buck/android/NativeLibraryMergeEnhancer.java
index 05e1828..f87631a 100644
--- a/src/com/facebook/buck/android/NativeLibraryMergeEnhancer.java
+++ b/src/com/facebook/buck/android/NativeLibraryMergeEnhancer.java
@@ -249,7 +249,7 @@
             .append(linkable)
             .append(" has inconsistent application module mappings: ");
         for (NativeLinkable innerConstituent : linkable.constituents.getLinkables()) {
-          APKModule innerConstituentModule = linkableToModuleMap.get(constituent);
+          APKModule innerConstituentModule = linkableToModuleMap.get(innerConstituent);
           sb.append(innerConstituent).append(" -> ").append(innerConstituentModule).append(", ");
         }
         throw new RuntimeException(
