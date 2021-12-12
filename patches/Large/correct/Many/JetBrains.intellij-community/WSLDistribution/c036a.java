diff --git a/platform/platform-impl/src/com/intellij/execution/wsl/WSLDistribution.java b/platform/platform-impl/src/com/intellij/execution/wsl/WSLDistribution.java
index f69d7be..bdf4d35 100644
--- a/platform/platform-impl/src/com/intellij/execution/wsl/WSLDistribution.java
+++ b/platform/platform-impl/src/com/intellij/execution/wsl/WSLDistribution.java
@@ -58,11 +58,11 @@
   @NotNull private final Description myDescription;
   @NotNull private final Path myExecutablePath;
 
-  public WSLDistribution(@NotNull WSLDistribution dist) {
+  protected WSLDistribution(@NotNull WSLDistribution dist) {
     this(dist.myDescription, dist.myExecutablePath);
   }
 
-  public WSLDistribution(@NotNull Description description, @NotNull Path executablePath) {
+  WSLDistribution(@NotNull Description description, @NotNull Path executablePath) {
     myDescription = description;
     myExecutablePath = executablePath;
   }
@@ -75,6 +75,9 @@
     return myExecutablePath;
   }
 
+  /**
+   * @return identification data of WSL distribution.
+   */
   @Nullable
   public String readReleaseInfo() {
     try {
