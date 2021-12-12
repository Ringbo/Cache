diff --git a/src/main/java/com/netflix/simianarmy/basic/BasicChaosCrawler.java b/src/main/java/com/netflix/simianarmy/basic/BasicChaosCrawler.java
index e9db150..15a416c 100644
--- a/src/main/java/com/netflix/simianarmy/basic/BasicChaosCrawler.java
+++ b/src/main/java/com/netflix/simianarmy/basic/BasicChaosCrawler.java
@@ -44,12 +44,12 @@
         private final String name;
         private final Enum type;
 
-        BasicInstanceGroup(String name) {
+        public BasicInstanceGroup(String name) {
             this.name = name;
             this.type = Types.ASG;
         }
 
-        BasicInstanceGroup(String name, Enum type) {
+        public BasicInstanceGroup(String name, Enum type) {
             this.name = name;
             this.type = type;
         }
