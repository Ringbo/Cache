diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/WindowsGetSpaceUsed.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/WindowsGetSpaceUsed.java
index 8e8c459..bd99aeb 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/WindowsGetSpaceUsed.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/fs/WindowsGetSpaceUsed.java
@@ -31,7 +31,8 @@
 @InterfaceStability.Evolving
 public class WindowsGetSpaceUsed extends CachingGetSpaceUsed {
 
-  WindowsGetSpaceUsed(CachingGetSpaceUsed.Builder builder) throws IOException {
+  public WindowsGetSpaceUsed(CachingGetSpaceUsed.Builder builder)
+      throws IOException {
     super(builder.getPath(),
         builder.getInterval(),
         builder.getJitter(),
