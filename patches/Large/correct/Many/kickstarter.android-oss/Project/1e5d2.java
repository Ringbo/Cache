diff --git a/app/src/main/java/com/kickstarter/models/Project.java b/app/src/main/java/com/kickstarter/models/Project.java
index 4e41beb..e3d9076 100644
--- a/app/src/main/java/com/kickstarter/models/Project.java
+++ b/app/src/main/java/com/kickstarter/models/Project.java
@@ -131,15 +131,15 @@
     return NumberUtils.numberWithDelimiter(backersCount());
   }
 
-  public @NonNull String formattedCommentsCount() {
+  public @Nullable String formattedCommentsCount() {
     return NumberUtils.numberWithDelimiter(commentsCount());
   }
 
-  public @NonNull String formattedStateChangedAt() {
+  public @Nullable String formattedStateChangedAt() {
     return DateTimeUtils.relativeDateInWords(stateChangedAt(), false, true);
   }
 
-  public @NonNull String formattedUpdatesCount() {
+  public @Nullable String formattedUpdatesCount() {
     return NumberUtils.numberWithDelimiter(updatesCount());
   }
 
