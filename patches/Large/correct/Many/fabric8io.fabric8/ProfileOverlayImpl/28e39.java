diff --git a/fabric-core/src/main/scala/org/fusesource/fabric/internal/ProfileOverlayImpl.java b/fabric-core/src/main/scala/org/fusesource/fabric/internal/ProfileOverlayImpl.java
index 4f6280e..2bbf1fe 100644
--- a/fabric-core/src/main/scala/org/fusesource/fabric/internal/ProfileOverlayImpl.java
+++ b/fabric-core/src/main/scala/org/fusesource/fabric/internal/ProfileOverlayImpl.java
@@ -113,7 +113,7 @@
     public Map<String, byte[]> getFileConfigurations() {
         try {
             Map<String, SupplementControl> aggregate = new HashMap<String, SupplementControl>();
-            supplement(this, aggregate);
+            supplement(self, aggregate);
 
             Map<String, byte[]> rc = new HashMap<String, byte[]>();
             for (Map.Entry<String, SupplementControl> entry : aggregate.entrySet()) {
@@ -134,6 +134,7 @@
             supplement(p, aggregate);
         }
 
+        // TODO fix this, should this every happen???
         if (profile instanceof ProfileOverlayImpl) {
             if (((ProfileOverlayImpl)profile).self.equals(self)) {
                 return;
@@ -183,7 +184,7 @@
     public Map<String, Map<String, String>> getConfigurations() {
         try {
             Map<String, SupplementControl> aggregate = new HashMap<String, SupplementControl>();
-            supplement(this, aggregate);
+            supplement(self, aggregate);
 
             Map<String, Map<String, String>> rc = new HashMap<String, Map<String, String>>();
             for (Map.Entry<String, SupplementControl> entry : aggregate.entrySet()) {
