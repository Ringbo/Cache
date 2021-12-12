diff --git a/platform/platform-impl/src/com/intellij/ide/plugins/PluginManagerColumnInfo.java b/platform/platform-impl/src/com/intellij/ide/plugins/PluginManagerColumnInfo.java
index 3f2c256..a8e930b 100644
--- a/platform/platform-impl/src/com/intellij/ide/plugins/PluginManagerColumnInfo.java
+++ b/platform/platform-impl/src/com/intellij/ide/plugins/PluginManagerColumnInfo.java
@@ -189,7 +189,7 @@
           String count1 = o1.getDownloads();
           String count2 = o2.getDownloads();
           if (count1 != null && count2 != null) {
-            return -Long.valueOf(count1).compareTo(Long.valueOf(count2));
+            return Long.valueOf(count1).compareTo(Long.valueOf(count2));
           }
           else if (count1 != null) {
             return -1;
@@ -206,9 +206,9 @@
           long date1 = (o1 instanceof PluginNode) ? ((PluginNode)o1).getDate() : ((IdeaPluginDescriptorImpl)o1).getDate();
           long date2 = (o2 instanceof PluginNode) ? ((PluginNode)o2).getDate() : ((IdeaPluginDescriptorImpl)o2).getDate();
           if (date1 < date2) {
-            return 1;
+            return -1;
           }
-          else if (date1 > date2) return -1;
+          else if (date1 > date2) return 1;
           return 0;
         }
       };
